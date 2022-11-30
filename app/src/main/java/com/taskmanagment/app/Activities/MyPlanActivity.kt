package com.taskmanagment.app.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Adapters.MilestonesAdapter
import com.taskmanagment.app.Model.MilestonesModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityMyPlanBinding

class MyPlanActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyPlanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowBack.setOnClickListener {
            finish()
        }

        val data = ArrayList<MilestonesModel>()
        data.add(MilestonesModel("Lose 10 lbs",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Target Date :Dec  30,2022"))



        val adapter = MilestonesAdapter(this, data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}