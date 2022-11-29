package com.taskmanagment.app.Auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityCreatePasswordBinding

class CreatePasswordActivity : AppCompatActivity() {
    lateinit var binding: ActivityCreatePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCreatePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}