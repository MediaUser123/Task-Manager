package com.taskmanagment.app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.taskmanagment.app.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lay1.setOnClickListener {
            binding.lay2.visibility= View.VISIBLE
        }
        binding.backpress.setOnClickListener {
            finish()
        }
        binding.dateCardLayout.setOnClickListener {
            binding.calLayout.visibility= View.VISIBLE
        }
        binding.recurringlayout.setOnClickListener {
            binding.textrecurring.setTextColor(Color.parseColor("#38A1F3"))
            binding.textonetime.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view2.setBackgroundResource(R.drawable.layout_bg3)
            binding.view1.setBackgroundResource(R.drawable.layout_bg6)
            binding.lay3.visibility= View.GONE
            binding.calenderview.visibility= View.GONE
            binding.reLayout.visibility= View.VISIBLE

        }
        binding.onetimelayout.setOnClickListener {
            binding.textonetime.setTextColor(Color.parseColor("#38A1F3"))
            binding.textrecurring.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view1.setBackgroundResource(R.drawable.layout_bg3)
            binding.view2.setBackgroundResource(R.drawable.layout_bg6)
            binding.lay3.visibility= View.VISIBLE
            binding.calenderview.visibility= View.VISIBLE
            binding.reLayout.visibility= View.GONE

        }
        binding.layNormal.setOnClickListener {
            binding.layNormal.setBackgroundResource(R.drawable.layout_bg3)
            binding.text1.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layHigh.setBackgroundResource(R.drawable.layout_bg4)
            binding.text2.setTextColor(Color.parseColor("#000000"))
            binding.layHighest.setBackgroundResource(R.drawable.layout_bg4)
            binding.text3.setTextColor(Color.parseColor("#000000"))

        }

        binding.layHigh.setOnClickListener {
            binding.layHigh.setBackgroundResource(R.drawable.layout_bg3)
            binding.text2.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layHighest.setBackgroundResource(R.drawable.layout_bg4)
            binding.text3.setTextColor(Color.parseColor("#000000"))
            binding.layNormal.setBackgroundResource(R.drawable.layout_bg4)
            binding.text1.setTextColor(Color.parseColor("#000000"))

        }
        binding.layHighest.setOnClickListener {
            binding.layHighest.setBackgroundResource(R.drawable.layout_bg3)
            binding.text3.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layHigh.setBackgroundResource(R.drawable.layout_bg4)
            binding.text2.setTextColor(Color.parseColor("#000000"))
            binding.layNormal.setBackgroundResource(R.drawable.layout_bg4)
            binding.text1.setTextColor(Color.parseColor("#000000"))

        }

        binding.laytoday.setOnClickListener {
            binding.laytoday.setBackgroundResource(R.drawable.layout_bg3)
            binding.texttoday.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layTomorrow.setBackgroundResource(R.drawable.layout_bg4)
            binding.texttwo.setTextColor(Color.parseColor("#000000"))
            binding.laysomeday.setBackgroundResource(R.drawable.layout_bg4)
            binding.textsoeday.setTextColor(Color.parseColor("#000000"))

        }
        binding.layTomorrow.setOnClickListener {
            binding.laytoday.setBackgroundResource(R.drawable.layout_bg4)
            binding.texttoday.setTextColor(Color.parseColor("#000000"))
            binding.layTomorrow.setBackgroundResource(R.drawable.layout_bg3)
            binding.texttwo.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.laysomeday.setBackgroundResource(R.drawable.layout_bg4)
            binding.textsoeday.setTextColor(Color.parseColor("#000000"))

        }
        binding.laysomeday.setOnClickListener {
            binding.laytoday.setBackgroundResource(R.drawable.layout_bg4)
            binding.texttoday.setTextColor(Color.parseColor("#000000"))
            binding.layTomorrow.setBackgroundResource(R.drawable.layout_bg4)
            binding.texttwo.setTextColor(Color.parseColor("#000000"))
            binding.laysomeday.setBackgroundResource(R.drawable.layout_bg3)
            binding.textsoeday.setTextColor(Color.parseColor("#FFFFFFFF"))

        }
    }
}