package com.taskmanagment.app.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagment.app.Model.AddGoalModel
import com.taskmanagment.app.Model.MyroutineModel
import com.taskmanagment.app.R

class MyroutineAdpater (val context: Context, val addgoal: List<MyroutineModel>) :
    RecyclerView.Adapter<MyroutineAdpater.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_layout_routine, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val obj = addgoal[position]
        holder.title.text = obj.Question
    }

    override fun getItemCount(): Int {
        return addgoal.size
    }

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var title = itemView.findViewById<TextView>(R.id.topView)
    }
}
