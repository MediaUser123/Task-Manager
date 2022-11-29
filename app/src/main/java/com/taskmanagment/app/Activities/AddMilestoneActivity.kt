package com.taskmanagment.app.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddMilestoneBinding
import com.taskmanagment.app.databinding.ActivityMilestonesBinding

class AddMilestoneActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddMilestoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddMilestoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Donerl.setOnClickListener { finish() }
    }
}