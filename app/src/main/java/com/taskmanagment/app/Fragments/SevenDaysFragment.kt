package com.taskmanagment.app.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Adapters.MyGoalsAdapter
import com.taskmanagment.app.Adapters.SevenAdapter
import com.taskmanagment.app.Model.MyGoalsModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.FragmentGoalsBinding
import com.taskmanagment.app.databinding.FragmentSevenDaysBinding

class SevenDaysFragment : Fragment() {
    lateinit var binding: FragmentSevenDaysBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentSevenDaysBinding.inflate(inflater, container, false)
        val view = binding.root

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


        val adapter = SevenAdapter(requireContext(), data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        return view
    }

}