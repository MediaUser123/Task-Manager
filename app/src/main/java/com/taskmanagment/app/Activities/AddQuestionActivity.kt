package com.taskmanagment.app.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddQuestionBinding

class AddQuestionActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backpress.setOnClickListener {
            finish()
        }
    }
}