package com.example.university.list.teacher

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.university.R
import com.example.university.data.FacultyModel
import com.example.university.data.TeacherModel
import com.example.university.list.faculty.FacultyViewHolder

class TeachersListAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<TeacherViewHolder>() {
    private var models: List<TeacherModel> = listOf()

    fun setData(models: List<TeacherModel>) {
        this.models = models
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return TeacherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        holder.populateModel(models[position])
    }
}