package com.example.university.list.faculty

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.university.R
import com.example.university.data.FacultyModel
import com.example.university.list.department.DepartmentViewHolder

class FacultiesListAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<FacultyViewHolder>() {
    private var models: List<FacultyModel> = listOf()

    fun setData(models: List<FacultyModel>) {
        this.models = models
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacultyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return FacultyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: FacultyViewHolder, position: Int) {
        holder.populateModel(models[position])
    }
}