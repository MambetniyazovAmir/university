package com.example.university.list.department

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.university.R
import com.example.university.data.DepartmentModel
import com.example.university.data.FacultyModel

class DepartmentListAdapter : androidx.recyclerview.widget.RecyclerView.Adapter<DepartmentViewHolder>() {
    private var models: List<DepartmentModel> = listOf()

    fun setData(models: List<DepartmentModel>) {
        this.models = models
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return DepartmentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: DepartmentViewHolder, position: Int) {
        holder.populateModel(models[position])
    }
}