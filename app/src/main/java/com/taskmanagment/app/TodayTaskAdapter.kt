package com.taskmanagment.app

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
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class TodayTaskAdapter(
    val context: Context,
    val List: ArrayList<todayModel>,
) : RecyclerView.Adapter<TodayTaskAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_layout_today_task, parent, false)
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

        holder.layout3.setOnClickListener {
            holder.image2.visibility = View.VISIBLE
            holder.layout3.setBackgroundResource(R.drawable.back_square2)
        }
        holder.layout4.setOnClickListener {
            holder.image3.visibility = View.VISIBLE
            holder.layout4.setBackgroundResource(R.drawable.back_square2)
        }
        holder.layout1.setOnClickListener {
            holder.image4.visibility = View.VISIBLE
            holder.layout1.setBackgroundResource(R.drawable.back_square2)

        }
        holder.moreText.setOnClickListener {
            showPopup()
        }
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
        val image2 = itemView.findViewById<ImageView>(R.id.tick)
        val image3 = itemView.findViewById<ImageView>(R.id.tick2)
        val image4 = itemView.findViewById<ImageView>(R.id.tick3)
        val layout3 = itemView.findViewById<RelativeLayout>(R.id.layout3)
        val layout4 = itemView.findViewById<RelativeLayout>(R.id.layout4)
        val layout1 = itemView.findViewById<RelativeLayout>(R.id.layout1)
        val moreText = itemView.findViewById<RelativeLayout>(R.id.moreText)
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
        val subtask=dialog.findViewById(R.id.subtaskText) as TextView
        val startText=dialog.findViewById(R.id.startText) as TextView
        val editText=dialog.findViewById(R.id.editText) as TextView
        imageView.setOnClickListener { dialog.dismiss() }

        subtask.setOnClickListener {
            context.startActivity(Intent(context,SubtaskActivity::class.java))
        }
        startText.setOnClickListener {
            context.startActivity(Intent(context,StartActivity::class.java))
        }
        editText.setOnClickListener {
            context.startActivity(Intent(context,AddActivity::class.java))
        }

        imageView.setOnClickListener { dialog.dismiss() }
        dialog.show()

    }
}



