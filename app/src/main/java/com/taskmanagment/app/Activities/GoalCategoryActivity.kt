package com.taskmanagment.app.Activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Adapters.GoalCategoryAdapter
import com.taskmanagment.app.Model.GoalCategoryModel
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityGoalCategoryBinding

class GoalCategoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityGoalCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGoalCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowBack.setOnClickListener {
            finish()
        }

        val data = ArrayList<GoalCategoryModel>()
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))
        data.add(GoalCategoryModel(R.drawable.userimg, "Health & Wellness"))

        val adapter = GoalCategoryAdapter(this, data)
        binding.rcv.adapter = adapter
        binding.rcv.layoutManager = GridLayoutManager(this,2)

    }
}