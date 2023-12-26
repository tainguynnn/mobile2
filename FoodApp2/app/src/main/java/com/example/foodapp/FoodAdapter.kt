package com.example.foodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(val foodList: ArrayList<FoodModel>)
    :RecyclerView.Adapter<FoodAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var foodImg : ImageView
        var foodTitle : TextView

        init{
            foodImg = itemView.findViewById(R.id.cardViewImg)
            foodTitle = itemView.findViewById(R.id.cardViewTXT)

            itemView.setOnClickListener(){
                    Toast.makeText(
                        itemView.context,
                        "you choose: ${foodList[adapterPosition]}",
                        Toast.LENGTH_SHORT
                    ).show()}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.foodImg.setImageResource(foodList[position].imgCard)
        holder.foodTitle.setText(foodList[position].txtCard)


        }

}