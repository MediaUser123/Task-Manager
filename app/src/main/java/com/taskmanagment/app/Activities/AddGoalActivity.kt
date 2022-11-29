package com.taskmanagment.app.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Adapters.AddGoalAdpater
import com.taskmanagment.app.Adapters.MyGoalsAdapter
import com.taskmanagment.app.Model.AddGoalModel
import com.taskmanagment.app.Model.GoalCategoryModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddGoalBinding
import com.taskmanagment.app.databinding.ActivityGoalCategoryBinding

class AddGoalActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddGoalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddGoalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextLayout.setOnClickListener {
            startActivity(Intent(this,
                SetGoalActivity::class.java))
        }


        val data = ArrayList<AddGoalModel>()
        data.add(AddGoalModel(R.drawable.ic_arrow_forward, "Keep my weight under...Ibs"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward, "Run my first marathon"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward,
            "Build muscle tone and cardio endurance"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward,
            "Be the most physically fit in my life!"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward, "Be... lbs slimmer"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward, "Maintain 10% or less bodyfat"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward, "Do ……. steps per dau for a full year"))
        data.add(AddGoalModel(R.drawable.ic_arrow_forward, "Become vegetarian"))


        val adapter = AddGoalAdpater(this, data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }
}