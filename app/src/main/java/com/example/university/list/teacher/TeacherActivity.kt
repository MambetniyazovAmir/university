package com.example.university.list.teacher

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
import com.example.university.data.TeacherModel
import com.example.university.list.faculty.AddDialog
import kotlinx.android.synthetic.main.activity_teacher.*

class TeacherActivity : AppCompatActivity(), OnAddButtonClickListener {

    private val adapter: TeachersListAdapter = TeachersListAdapter()
    private lateinit var dao: AppDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)
        dao = AppDatabase.getInstance(this).financeDao()
        button.setOnClickListener {
            val dialog = AddDialog(this, this)
            dialog.show()
        }
        listView.adapter = adapter
        listView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        listView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        adapter.setData(dao.getAllTeachers())
    }

    override fun onAddButtonClick(name: String) {
        val model = TeacherModel(name)
        dao.addTeacher(model)
        adapter.setData(dao.getAllTeachers())
    }
}
