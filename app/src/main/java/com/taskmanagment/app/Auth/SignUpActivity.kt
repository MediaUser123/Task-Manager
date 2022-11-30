package com.taskmanagment.app.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignUpBinding.inflate(layoutInflater)


        setContentView(binding.root)
        binding.rel1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
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
        binding.edtemail.setOnFocusChangeListener(object : View.OnFocusChangeListener {
            override fun onFocusChange(v: View?, hasFocus: Boolean) {
                if (hasFocus) {
                    binding.view2.setBackgroundColor(resources.getColor(R.color.blue))
                } else {
                    binding.view2.setBackgroundColor(resources.getColor(R.color.view))
                }
            }
        })
        binding.edtpass.setOnFocusChangeListener(object : View.OnFocusChangeListener {
            override fun onFocusChange(v: View?, hasFocus: Boolean) {
                if (hasFocus) {
                    binding.view3.setBackgroundColor(resources.getColor(R.color.blue))
                } else {
                    binding.view3.setBackgroundColor(resources.getColor(R.color.view))
                }
            }
        })
    }
}