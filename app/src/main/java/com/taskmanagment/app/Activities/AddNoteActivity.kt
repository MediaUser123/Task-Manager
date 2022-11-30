package com.taskmanagment.app.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddGoalBinding
import com.taskmanagment.app.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowBack.setOnClickListener {
            finish()
        }

        binding.nextLayout.setOnClickListener {
            finish()
        }
    }
}