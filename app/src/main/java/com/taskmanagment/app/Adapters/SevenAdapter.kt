package com.taskmanagment.app.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagment.app.Model.MyGoalsModel
import com.taskmanagment.app.R

class SevenAdapter (val context: Context, val seven: List<MyGoalsModel>) :
    RecyclerView.Adapter<SevenAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_seven, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val obj = seven[position]
        holder.image.setImageResource(obj.userImage)
        holder.title.text = obj.Title
        holder.desc.text = obj.Desc
        holder.time.text = obj.UploadOn
    }

    override fun getItemCount(): Int {
        return seven.size
    }

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

        var image = itemView.findViewById<ImageView>(R.id.userImg)
        var title = itemView.findViewById<TextView>(R.id.tv_title)
        var desc = itemView.findViewById<TextView>(R.id.tv_descrip)
        var time = itemView.findViewById<TextView>(R.id.tv_date)
    }
}