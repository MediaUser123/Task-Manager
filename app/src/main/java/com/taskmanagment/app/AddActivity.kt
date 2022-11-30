package com.taskmanagment.app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.taskmanagment.app.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clicks()

    }

    private fun clicks() {
        binding.lay1.setOnClickListener {
            binding.lay2.visibility = View.VISIBLE
        }
        binding.backpress.setOnClickListener {
            finish()
        }
        binding.dateCardLayout.setOnClickListener {
            binding.calLayout.visibility = View.VISIBLE
        }
        binding.recurringlayout.setOnClickListener {
            binding.textrecurring.setTextColor(Color.parseColor("#38A1F3"))
            binding.textonetime.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view2.setBackgroundResource(R.drawable.layout_bg3)
            binding.view1.setBackgroundResource(R.drawable.layout_bg6)
            binding.lay3.visibility = View.GONE
            binding.calenderview.visibility = View.GONE
            binding.reLayout.visibility = View.VISIBLE

        }
        binding.onetimelayout.setOnClickListener {
            binding.textonetime.setTextColor(Color.parseColor("#38A1F3"))
            binding.textrecurring.setTextColor(Color.parseColor("#AEAEAE"))
            binding.view1.setBackgroundResource(R.drawable.layout_bg3)
            binding.view2.setBackgroundResource(R.drawable.layout_bg6)
            binding.lay3.visibility = View.VISIBLE
            binding.calenderview.visibility = View.VISIBLE
            binding.reLayout.visibility = View.GONE

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
        binding.layoutT.setOnClickListener {
            binding.layoutT.setBackgroundResource(R.drawable.layout_bg3)
            binding.textTime1.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layoutW.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime2.setTextColor(Color.parseColor("#000000"))
            binding.layoutM.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime3.setTextColor(Color.parseColor("#000000"))
            binding.layoutS.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime4.setTextColor(Color.parseColor("#000000"))
            binding.layoutY.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime5.setTextColor(Color.parseColor("#000000"))
            binding.layoutweekedays.visibility = View.VISIBLE

        }
        binding.layoutW.setOnClickListener {
            binding.layoutT.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime1.setTextColor(Color.parseColor("#000000"))
            binding.layoutW.setBackgroundResource(R.drawable.layout_bg3)
            binding.textTime2.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layoutM.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime3.setTextColor(Color.parseColor("#000000"))
            binding.layoutS.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime4.setTextColor(Color.parseColor("#000000"))
            binding.layoutY.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime5.setTextColor(Color.parseColor("#000000"))


        }
        binding.layoutM.setOnClickListener {
            binding.layoutT.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime1.setTextColor(Color.parseColor("#000000"))
            binding.layoutW.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime2.setTextColor(Color.parseColor("#000000"))
            binding.layoutM.setBackgroundResource(R.drawable.layout_bg3)
            binding.textTime3.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layoutS.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime4.setTextColor(Color.parseColor("#000000"))
            binding.layoutY.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime5.setTextColor(Color.parseColor("#000000"))


        }
        binding.layoutS.setOnClickListener {
            binding.layoutT.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime1.setTextColor(Color.parseColor("#000000"))
            binding.layoutW.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime2.setTextColor(Color.parseColor("#000000"))
            binding.layoutM.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime3.setTextColor(Color.parseColor("#000000"))
            binding.layoutS.setBackgroundResource(R.drawable.layout_bg3)
            binding.textTime4.setTextColor(Color.parseColor("#FFFFFFFF"))
            binding.layoutY.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime5.setTextColor(Color.parseColor("#000000"))


        }
        binding.layoutY.setOnClickListener {
            binding.layoutT.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime1.setTextColor(Color.parseColor("#000000"))
            binding.layoutW.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime2.setTextColor(Color.parseColor("#000000"))
            binding.layoutM.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime3.setTextColor(Color.parseColor("#000000"))
            binding.layoutS.setBackgroundResource(R.drawable.layout_bg4)
            binding.textTime4.setTextColor(Color.parseColor("#000000"))
            binding.layoutY.setBackgroundResource(R.drawable.layout_bg3)
            binding.textTime5.setTextColor(Color.parseColor("#FFFFFFFF"))


        }
        binding.layout1.setOnClickListener {
            binding.tick1.visibility = View.VISIBLE
            binding.layout1.setBackgroundResource(R.drawable.back_square2)

        }
        binding.layout2.setOnClickListener {
            binding.tick2.visibility = View.VISIBLE
            binding.layout2.setBackgroundResource(R.drawable.back_square2)

        }
        binding.layout3.setOnClickListener {
            binding.tick3.visibility = View.VISIBLE
            binding.layout3.setBackgroundResource(R.drawable.back_square2)

        }
        binding.layout4.setOnClickListener {
            binding.tick4.visibility = View.VISIBLE
            binding.layout4.setBackgroundResource(R.drawable.back_square2)

        }
        binding.timetext.setOnClickListener {
            binding.timepickerlayoout.visibility = View.VISIBLE
            OnClickTime()
        }
        binding.layout5.setOnClickListener {
            binding.tick5.visibility = View.VISIBLE
            binding.layout5.setBackgroundResource(R.drawable.back_square2)

        }
        binding.layout6.setOnClickListener {
            binding.tick6.visibility = View.VISIBLE
            binding.layout6.setBackgroundResource(R.drawable.back_square2)

        }
        binding.layout7.setOnClickListener {
            binding.tick7.visibility = View.VISIBLE
            binding.layout7.setBackgroundResource(R.drawable.back_square2)

        }
        binding.dateText.setOnClickListener {
            binding.calLayout.visibility = View.VISIBLE


        }
    }
    private fun OnClickTime() {
        val textView = findViewById<TextView>(R.id.textView)
        binding.timePicker.setOnTimeChangedListener { _, hour, minute -> var hour = hour
            var am_pm = ""
            // AM_PM decider logic
            when {hour == 0 -> { hour += 12
                am_pm = "AM"
            }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> { hour -= 12
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            if (textView != null) {
                val hour = if (hour < 10) "0" + hour else hour
                val min = if (minute < 10) "0" + minute else minute
                // display format of time
                val msg = "Time is: $hour : $min $am_pm"
                binding.textView.text = msg
                binding.textView.visibility = ViewGroup.VISIBLE
            }
        }
    }
}