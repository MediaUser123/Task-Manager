package com.taskmanagment.app.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagment.app.Activities.AddGoalActivity
import com.taskmanagment.app.Model.GoalCategoryModel
import com.taskmanagment.app.Model.MyGoalsModel
import com.taskmanagment.app.R

class GoalCategoryAdapter (val context: Context, val GoalCategory: List<GoalCategoryModel>) :
    RecyclerView.Adapter<GoalCategoryAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_select_goal_category, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val obj = GoalCategory[position]
        holder.image.setImageResource(obj.userImage)
        holder.title.text = obj.Title

        holder.next.setOnClickListener {
            context.startActivity(Intent(context,AddGoalActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return GoalCategory.size
    }

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var image = itemView.findViewById<ImageView>(R.id.userImg)
        var title = itemView.findViewById<TextView>(R.id.tv_title)
        var next = itemView.findViewById<CardView>(R.id.rl)
    }
}

