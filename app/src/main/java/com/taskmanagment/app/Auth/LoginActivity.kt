package com.taskmanagment.app.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.taskmanagment.app.AddActivity
import com.taskmanagment.app.MainActivity
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.rel1.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
        binding.forgetpass.setOnClickListener {
            startActivity(Intent(this, ForgetPaswordActivity::class.java))
        }
        binding.edtuser.setOnFocusChangeListener(object : View.OnFocusChangeListener {
            override fun onFocusChange(v: View?, hasFocus: Boolean) {
                if (hasFocus) {
                    binding.view1.setBackgroundColor(resources.getColor(R.color.blue))
                } else {
                    binding.view1.setBackgroundColor(resources.getColor(R.color.view))
                }
            }
        })
        binding.edtpass.setOnFocusChangeListener(object : View.OnFocusChangeListener {
            override fun onFocusChange(v: View?, hasFocus: Boolean) {
                if (hasFocus) {
                    binding.view2.setBackgroundColor(resources.getColor(R.color.blue))
                } else {
                    binding.view2.setBackgroundColor(resources.getColor(R.color.view))
                }
            }
        })
    }
}