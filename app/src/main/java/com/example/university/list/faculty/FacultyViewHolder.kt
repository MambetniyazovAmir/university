package com.example.university.list.faculty

import android.view.View
import android.widget.TextView
import com.example.university.R
import com.example.university.data.FacultyModel

class FacultyViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
    private val tvName: TextView = itemView.findViewById(R.id.name)

    fun populateModel(model: FacultyModel) {
        tvName.text = model.facultyName
    }
}