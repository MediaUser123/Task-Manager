package com.taskmanagment.app.Activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.taskmanagment.app.Fragments.SevenDaysFragment
import com.taskmanagment.app.Fragments.ThirtyDaysFragment
import com.taskmanagment.app.Fragments.TwelveDaysFragment
import com.taskmanagment.app.R
import com.taskmanagment.app.databinding.ActivityAddNoteBinding
import com.taskmanagment.app.databinding.ActivityMyProgressBinding

class MyProgressActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyProgressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyProgressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.arrowBack.setOnClickListener {
            finish()
        }


        val fragment1 = SevenDaysFragment()
        val fragment2 = ThirtyDaysFragment()
        val fragment3 = TwelveDaysFragment()
        setFragment(fragment1)
        val text1 = findViewById<TextView>(R.id.textsevendays)
        val text2 = findViewById<TextView>(R.id.textthirtyday)
        val text3 = findViewById<TextView>(R.id.texttwelvemonths)


        text1.setOnClickListener {
            setFragment(fragment1)
            binding.textsevendays.setTextColor(Color.parseColor("#38A1F3"))
            binding.view1.setBackgroundResource(R.drawable.layout_bg3)
            binding.textthirtyday.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view2.setBackgroundResource(R.drawable.layout_bg6)
            binding.texttwelvemonths.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view3.setBackgroundResource(R.drawable.layout_bg6)
        }

        text2.setOnClickListener {
            setFragment(fragment2)
            binding.textthirtyday.setTextColor(Color.parseColor("#38A1F3"))
            binding.view2.setBackgroundResource(R.drawable.layout_bg3)
            binding.textsevendays.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view1.setBackgroundResource(R.drawable.layout_bg6)
            binding.texttwelvemonths.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view3.setBackgroundResource(R.drawable.layout_bg6)
        }

        text3.setOnClickListener {
            setFragment(fragment3)
            binding.texttwelvemonths.setTextColor(Color.parseColor("#38A1F3"))
            binding.view3.setBackgroundResource(R.drawable.layout_bg3)
            binding.textthirtyday.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view2.setBackgroundResource(R.drawable.layout_bg6)
            binding.textsevendays.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view1.setBackgroundResource(R.drawable.layout_bg6)
        }
    }

    private fun setFragment(fragment: Fragment) {


        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_frame, fragment)
        fragmentTransaction.commit()
    }
}