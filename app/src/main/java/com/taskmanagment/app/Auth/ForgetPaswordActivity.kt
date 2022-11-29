package com.taskmanagment.app.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityForgetPaswordBinding

class ForgetPaswordActivity : AppCompatActivity() {
    lateinit var binding: ActivityForgetPaswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityForgetPaswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnnext.setOnClickListener {
            startActivity(Intent(this, OtpVerificationActivity::class.java))
        }
    }
}