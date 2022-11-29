package com.taskmanagment.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Activities.GoalCategoryActivity
import com.taskmanagment.app.Adapters.MyGoalsAdapter
import com.taskmanagment.app.Model.MyGoalsModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.FragmentGoalsBinding


class GoalsFragment : Fragment() {
    lateinit var binding: FragmentGoalsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout_bg for this fragment
        binding = FragmentGoalsBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.threedot.setOnClickListener { startActivity(Intent(context, GoalCategoryActivity::class.java)) }


        val data = ArrayList<MyGoalsModel>()
        data.add(MyGoalsModel(R.drawable.user_img,
            "Build muscle",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Dec  30,2022"))
        data.add(MyGoalsModel(R.drawable.user_img,
            "Build muscle",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Dec  30,2022"))
        data.add(MyGoalsModel(R.drawable.user_img,
            "Build muscle",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Dec  30,2022"))
        data.add(MyGoalsModel(R.drawable.user_img,
            "Build muscle",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Dec  30,2022"))
        data.add(MyGoalsModel(R.drawable.user_img,
            "Build muscle",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Dec  30,2022"))


        val adapter = MyGoalsAdapter(requireContext(), data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        return view

    }

}