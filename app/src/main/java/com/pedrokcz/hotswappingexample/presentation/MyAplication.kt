package com.pedrokcz.hotswappingexample.presentation

import android.app.Application
import android.content.Intent
import com.google.firebase.firestore.FirebaseFirestore
import com.pedrokcz.digimon.DigimonStrategy
import com.pedrokcz.pokemon.PokemonStrategy
import com.pedrokcz.presentation.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

@Suppress("unused")
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(getModule(null))
            FirebaseFirestore.getInstance()
                .collection("v1")
                .document("toggle")
                .addSnapshotListener { documentSnapshot, _ ->
                    val strategy = documentSnapshot?.data?.getValue("monster_strategy").toString()
                    modules(getModule(strategy))
                    startActivity(getHomeIntent())
                }
        }
    }

    private fun getModule(strategy: String?) = module {
        single(override = true) {
            when (strategy) {
                "pokemon" -> PokemonStrategy()
                "digimon" -> DigimonStrategy()
                else -> PokemonStrategy()
            }
        }
        viewModel(override = true) { HomeViewModel(get()) }
    }

    private fun getHomeIntent(): Intent {
        return Intent(this, MyActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
    }
}
