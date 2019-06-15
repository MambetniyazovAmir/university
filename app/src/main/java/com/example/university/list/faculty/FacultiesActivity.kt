package com.example.university.list.faculty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.university.OnAddButtonClickListener
import com.example.university.R
import com.example.university.data.AppDao
import com.example.university.data.AppDatabase
import com.example.university.data.FacultyModel
import com.example.university.list.department.DepartmentListAdapter
import kotlinx.android.synthetic.main.activity_faculties.*

class FacultiesActivity : AppCompatActivity(), OnAddButtonClickListener {

    private val adapter: FacultiesListAdapter = FacultiesListAdapter()
    private lateinit var dao: AppDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculties)
        dao = AppDatabase.getInstance(this).financeDao()
        button.setOnClickListener {
            val dialog = AddDialog(this, this)
            dialog.show()
        }
        listView.adapter = adapter
        listView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        listView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        adapter.setData(dao.getAllContacts())
    }

    override fun onAddButtonClick(name: String) {
        val model = FacultyModel(name)
        dao.addFaculty(model)
        adapter.setData(dao.getAllContacts())
    }
}
