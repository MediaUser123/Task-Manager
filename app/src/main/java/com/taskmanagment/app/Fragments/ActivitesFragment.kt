package com.taskmanagment.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Adapters.TodayTaskAdapter2
import com.taskmanagment.app.AddActivity
import com.taskmanagment.app.Model.todayModel
import com.taskmanagment.app.R
import com.taskmanagment.app.TodayTaskAdapter
import com.taskmanagment.app.databinding.FragmentActivitesBinding
import com.taskmanagment.app.databinding.FragmentTodayBinding

class ActivitesFragment : Fragment() {
    lateinit var binding: FragmentActivitesBinding
    lateinit var adapter: TodayTaskAdapter2
    var arraylist: ArrayList<todayModel> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout_bg for this fragment
        binding = FragmentActivitesBinding.inflate(inflater, container, false)
        binding.rcv.layoutManager = LinearLayoutManager(context)
        getdata()
        adapter = TodayTaskAdapter2(requireContext(), arraylist)
        binding.rcv.adapter = adapter

        binding.addimg.setOnClickListener {
            startActivity(Intent(context, AddActivity::class.java))
        }
        return binding.root
    }
    private fun getdata() {
        arraylist.add(
            todayModel(
                "Look For Insurance",
                "1/2 sub-task done",
                "Test sub-task",
                "Test sub-task 1",
                "Every Day",
                "",
                "",

                R.drawable.mask_ic,
            )
        )
        arraylist.add(
            todayModel(
                "Look For Insurance",
                "1/2 sub-task done",
                "Test sub-task",
                "Test sub-task 1",
                "Every Day",
                "",
                "",
                R.drawable.mask_ic,

                )
        )
    }


}