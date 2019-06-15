package com.example.university.list.department

import android.view.View
import android.widget.TextView
import com.example.university.R
import com.example.university.data.DepartmentModel
import com.example.university.data.FacultyModel

class DepartmentViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
    private val tvName: TextView = itemView.findViewById(R.id.name)

    fun populateModel(model: DepartmentModel) {
        tvName.text = model.name
    }
}