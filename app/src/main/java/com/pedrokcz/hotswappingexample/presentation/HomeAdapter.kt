package com.pedrokcz.hotswappingexample.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pedrokcz.hotswappingexample.databinding.ItemMonsterBinding
import com.pedrokcz.hotswappingexample.domain.entity.Monster
import com.squareup.picasso.Picasso

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.MonsterViewHolder>() {

    private val monsterList = mutableListOf<Monster>()

    fun addMonsters(list: List<Monster>) {
        monsterList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonsterViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return MonsterViewHolder(
            ItemMonsterBinding.inflate(inflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MonsterViewHolder, position: Int) {
        Picasso.get().load(
            monsterList[position].photo
        ).into(holder.view.monsterImage)
        holder.view.monsterName.text = monsterList[position].name
    }

    override fun getItemCount(): Int {
        return monsterList.size
    }

    inner class MonsterViewHolder(val view: ItemMonsterBinding) :
        RecyclerView.ViewHolder(view.root)
}
