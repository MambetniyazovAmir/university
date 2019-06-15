package com.example.university

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.university.data.AppDao
import com.example.university.data.AppDatabase
import com.example.university.list.faculty.FacultiesListAdapter
import kotlinx.android.synthetic.main.activity_faculties.*

class FacultiesActivity : AppCompatActivity() {

    private val adapter: FacultiesListAdapter = FacultiesListAdapter()
    private val dao: AppDao = AppDatabase.getInstance(this).financeDao()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculties)
        button.setOnClickListener {

        }
    }
}
