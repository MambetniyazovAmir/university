package com.example.university.list.teacher

import android.view.View
import android.widget.TextView
import com.example.university.R
import com.example.university.data.FacultyModel
import com.example.university.data.TeacherModel

class TeacherViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
    private val tvName: TextView = itemView.findViewById(R.id.name)

    fun populateModel(model: TeacherModel) {
        tvName.text = model.name
    }
}