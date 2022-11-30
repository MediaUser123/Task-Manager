package com.taskmanagment.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.taskmanagment.app.databinding.ActivitySubtaskBinding

class SubtaskActivity : AppCompatActivity() {
lateinit var binding: ActivitySubtaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySubtaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.settimeText.setOnClickListener {
            binding.timepickerlayoout.visibility = View.VISIBLE
        }
        binding.backpress.setOnClickListener {
           finish()
        }

    }
}