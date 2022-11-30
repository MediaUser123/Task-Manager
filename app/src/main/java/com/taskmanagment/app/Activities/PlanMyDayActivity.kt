package com.taskmanagment.app.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.AddActivity
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityPlanMyDayBinding

class PlanMyDayActivity : AppCompatActivity() {
    lateinit var binding: ActivityPlanMyDayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPlanMyDayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this,AddActivity::class.java))
        }
        binding.backpress.setOnClickListener {
finish()
        }
    }
}