package com.taskmanagment.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.taskmanagment.app.Activities.AddQuestionActivity
import com.taskmanagment.app.Adapters.MyroutineAdpater
import com.taskmanagment.app.Model.MyroutineModel
import com.taskmanagment.app.databinding.ActivityMorningRoutineBinding

class MorningRoutineActivity : AppCompatActivity() {
    lateinit var binding: ActivityMorningRoutineBinding
    lateinit var adapter: MyroutineAdpater
    var arraylist: ArrayList<MyroutineModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMorningRoutineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this, AddQuestionActivity::class.java))
        }
        binding.rcv.layoutManager = LinearLayoutManager(this)
        getdata()
        adapter = MyroutineAdpater(this, arraylist)
        binding.rcv.adapter = adapter
    }
    private fun getdata() {
        arraylist.add(
            MyroutineModel(
                "What am I grateful for?",

                )
        )
        arraylist.add(
            MyroutineModel(
                "How did I spend my time today?",

                )
        )
    }

}