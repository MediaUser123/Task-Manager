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
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagment.app.Model.MyGoalsModel
import com.taskmanagment.app.R

class MyGoalsAdapter (val context: Context, val mygoals: List<MyGoalsModel>) :
    RecyclerView.Adapter<MyGoalsAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_my_goals, parent, false)
        return MyViewHolder(view)


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val obj = mygoals[position]
        holder.image.setImageResource(obj.userImage)
        holder.title.text = obj.Title
        holder.desc.text = obj.Desc
        holder.time.text = obj.UploadOn

        holder.layout.setOnClickListener { showPopup() }
    }

    override fun getItemCount(): Int {
        return mygoals.size
    }


    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        var image = itemView.findViewById<ImageView>(R.id.userImg)
        var title = itemView.findViewById<TextView>(R.id.tv_title)
        var desc = itemView.findViewById<TextView>(R.id.tv_descrip)
        var time = itemView.findViewById<TextView>(R.id.tv_date)

        var layout = itemView.findViewById<RelativeLayout>(R.id.rectangle)




    }
    private fun showPopup() {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.popup_my_goals)
        dialog.window?.setLayout(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dialog.setCanceledOnTouchOutside(true)
        val RelativeLayout = dialog.findViewById(R.id.arrow_back) as RelativeLayout
        RelativeLayout.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }


}

