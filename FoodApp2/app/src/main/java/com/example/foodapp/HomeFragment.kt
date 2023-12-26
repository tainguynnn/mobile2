package com.example.foodapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using Data Binding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        val rootView = binding.root

        val recyclerView: RecyclerView = binding.recyclerview
        recyclerView.layoutManager = GridLayoutManager(context, 2)


        var foodList: ArrayList<FoodModel> = ArrayList()

        val f1 = FoodModel(R.drawable.card1, "pizza")
        val f2 = FoodModel(R.drawable.card2, "pizza")
        val f3 = FoodModel(R.drawable.card3, "pizza")
        val f4 = FoodModel(R.drawable.card4, "pizza")
        val f5 = FoodModel(R.drawable.card5, "pizza")
        val f6 = FoodModel(R.drawable.card6, "pizza")
        val f7 = FoodModel(R.drawable.card4, "pizza")
        val f8 = FoodModel(R.drawable.card5, "pizza")
        val f9 = FoodModel(R.drawable.card6, "pizza")
        val f10 = FoodModel(R.drawable.card6, "pizza")

        foodList.add(f1)
        foodList.add(f2)
        foodList.add(f3)
        foodList.add(f4)
        foodList.add(f5)
        foodList.add(f6)
        foodList.add(f7)
        foodList.add(f8)
        foodList.add(f9)
        foodList.add(f10)

        val adapter = FoodAdapter(foodList)
        recyclerView.adapter = adapter

        binding.toolbarButton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_homeFragment_to_orderFragment)
        }
        // Return the root view after setting up the RecyclerView
        return rootView
    }
}
