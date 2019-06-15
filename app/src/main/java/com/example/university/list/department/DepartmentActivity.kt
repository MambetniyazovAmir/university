package com.example.university.list.department

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.university.OnAddButtonClickListener
import com.example.university.R
import com.example.university.data.AppDao
import com.example.university.data.AppDatabase
import com.example.university.data.DepartmentModel
import com.example.university.list.faculty.AddDialog
import kotlinx.android.synthetic.main.activity_department.*

class DepartmentActivity : AppCompatActivity(), OnAddButtonClickListener {

    private val adapter = DepartmentListAdapter()
    private lateinit var dao: AppDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_department)
        dao = AppDatabase.getInstance(this).financeDao()
        listView.adapter =adapter
        listView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        listView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        adapter.setData(dao.getAllDepartments())
        button.setOnClickListener {
            val dialog = AddDialog(this, this)
            dialog.show()
        }
    }

    override fun onAddButtonClick(name: String) {
        val model = DepartmentModel(name)
        dao.addDepartment(model)
        val models = dao.getAllDepartments()
        adapter.setData(models)
    }
}
