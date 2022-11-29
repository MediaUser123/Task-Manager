package com.taskmanagment.app.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddGoalBinding
import com.taskmanagment.app.databinding.ActivitySetGoalBinding

class SetGoalActivity : AppCompatActivity() {
    lateinit var binding: ActivitySetGoalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetGoalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextScreen.setOnClickListener {
            startActivity(Intent(this,
                MilestonesActivity::class.java))
        }

    }
}