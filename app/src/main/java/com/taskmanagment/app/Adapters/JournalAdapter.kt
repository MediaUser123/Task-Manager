package com.taskmanagment.app.Adapters

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagment.app.Model.JournalModel
import com.taskmanagment.app.Model.MilestonesModel
import com.taskmanagment.app.R

class JournalAdapter (val context: Context, val journal: List<JournalModel>) :
    RecyclerView.Adapter<JournalAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.item_journal, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val obj = journal[position]
        holder.title.text = obj.Title
        holder.desc.text = obj.Desc

        holder.layout.setOnClickListener { showPopup() }
    }

    override fun getItemCount(): Int {
        return journal.size
    }

    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var title = itemView.findViewById<TextView>(R.id.tv_title)
        var desc = itemView.findViewById<TextView>(R.id.tv_descrip)
        var layout = itemView.findViewById<RelativeLayout>(R.id.rectangle)
    }

    private fun showPopup() {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.popup_journal)
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
