package com.taskmanagment.app.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Adapters.AddGoalAdpater
import com.taskmanagment.app.Adapters.MilestonesAdapter
import com.taskmanagment.app.Model.MilestonesModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddGoalBinding
import com.taskmanagment.app.databinding.ActivityMilestonesBinding

class MilestonesActivity : AppCompatActivity() {
    lateinit var binding: ActivityMilestonesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMilestonesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.arrowBack.setOnClickListener {
            finish()
        }

        binding.addNewMilestones.setOnClickListener {
            startActivity(Intent(this,
                AddMilestoneActivity::class.java))
        }

        binding.Skiprl.setOnClickListener {
            startActivity(Intent(this, MyPlanActivity::class.java))
        }


        val data = ArrayList<MilestonesModel>()
        data.add(MilestonesModel("Lose 10 lbs",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Target Date :Dec  30,2022"))

        data.add(MilestonesModel("Lose 10 lbs",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Target Date :Dec  30,2022"))

        data.add(MilestonesModel("Lose 10 lbs",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Target Date :Dec  30,2022"))
        data.add(MilestonesModel("Lose 10 lbs",
            "lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy",
            "Target Date :Dec  30,2022"))

        val adapter = MilestonesAdapter(this, data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}