/*
package com.app.splashscreen.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.splashscreen.R
import com.app.splashscreen.activity.RoomDataActivity
import com.app.splashscreen.model.StudentData


class RoomDbRecyclerViewAdapter(val listener: RowClickListener) :
    RecyclerView.Adapter<RoomDbRecyclerViewAdapter.MyViewHolder>() {

    var items = ArrayList<StudentData>()

    fun setListData(data: ArrayList<StudentData>) {
        this.items = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row, parent, false)
        return MyViewHolder(inflater, listener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onItemClickListener(items[position])

        }
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class MyViewHolder(view: View, val listener: RowClickListener) : RecyclerView.ViewHolder(view) {
        val tvName = view.findViewById<TextView>(R.id.tvStudentName)
        val tvEmail = view.findViewById<TextView>(R.id.tvStudentEmail)
        val deleteImage = view.findViewById<ImageView>(R.id.imgDelete)

        fun bind(data: StudentData) {
            tvName.text = data.studentName
            tvEmail.text = data.studentEmail
            deleteImage.setOnClickListener {
                listener.onDeleteUserClickListener(data)
            }
        }

    }

    interface RowClickListener {
        fun onDeleteUserClickListener(student: StudentData)

        fun onItemClickListener(student: StudentData)
    }
}*/
