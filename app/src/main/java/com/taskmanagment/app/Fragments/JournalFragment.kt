package com.taskmanagment.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Activities.AddNoteActivity
import com.taskmanagment.app.Activities.GoalCategoryActivity
import com.taskmanagment.app.Adapters.JournalAdapter
import com.taskmanagment.app.Adapters.MyGoalsAdapter
import com.taskmanagment.app.Model.JournalModel
import com.taskmanagment.app.Model.MyGoalsModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.FragmentGoalsBinding
import com.taskmanagment.app.databinding.FragmentJournalBinding


class JournalFragment : Fragment() {
    lateinit var binding: FragmentJournalBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentJournalBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.threedot.setOnClickListener { startActivity(Intent(context, AddNoteActivity::class.java)) }

        val data = ArrayList<JournalModel>()
        data.add(JournalModel("Walk 5 Miles",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy"))
        data.add(JournalModel("Walk 5 Miles",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy"))
        data.add(JournalModel("Walk 5 Miles",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy"))
        data.add(JournalModel("Walk 5 Miles",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy"))


        val adapter = JournalAdapter(requireContext(), data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        return view
    }

}