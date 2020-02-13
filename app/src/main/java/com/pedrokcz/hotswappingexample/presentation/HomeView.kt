package com.pedrokcz.hotswappingexample.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pedrokcz.hotswappingexample.R
import com.pedrokcz.hotswappingexample.databinding.ActivityHomeBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HomeView : AppCompatActivity() {

    private val viewModel by viewModel<HomeViewModel>()
    private val monsterAdapter = HomeAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityHomeBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_home)

        setUpRecyclerView(binding.monstersList)
        observeMonsterList()
    }

    private fun setUpRecyclerView(recyclerView: RecyclerView) {
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = monsterAdapter
        }
    }

    private fun observeMonsterList() {
        viewModel.monstersList.observe(this, Observer {
            monsterAdapter.addMonsters(it)
        })
    }
}
