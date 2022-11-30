package com.taskmanagment.app.Adapters

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.taskmanagment.app.Model.todayModel
import com.taskmanagment.app.R


class TodayTaskAdapter2(
    val context: Context,
    val List: ArrayList<todayModel>,
) : RecyclerView.Adapter<TodayTaskAdapter2.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_layout_to_do, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val list = List[position]
        holder.tittle.text = list.Tittle
        holder.subTask.text = list.SubTask
        holder.subtest1.text = list.Subtest
        holder.subtest2.text=list.Subtest2
        holder.time1.text=list.Time
        holder.time2.text=list.Time2
        holder.image.setImageResource(list.Image)


    }

    override fun getItemCount(): Int {
        return List.size
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView) {

        val tittle = itemView.findViewById<TextView>(R.id.tittleText)
        val subTask = itemView.findViewById<TextView>(R.id.taskText)
        val subtest1 = itemView.findViewById<TextView>(R.id.subtasktext1)
        val subtest2 = itemView.findViewById<TextView>(R.id.subtasktext2)
        val time1 = itemView.findViewById<TextView>(R.id.subtasktiming1)
        val time2 = itemView.findViewById<TextView>(R.id.subtasktiming2)
        val image = itemView.findViewById<ImageView>(R.id.iv_profile)

//        val parentLayout = itemView.findViewById<CardView>(R.id.cardview)

    }
    private fun showPopup() {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.popup_activity)
        dialog.window?.setLayout(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dialog.setCanceledOnTouchOutside(true)
        val imageView=dialog.findViewById(R.id.clossimg) as CardView
        imageView.setOnClickListener { dialog.dismiss() }
        dialog.show()

    }
}



