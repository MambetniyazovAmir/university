package com.example.university

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.university.list.department.DepartmentActivity
import com.example.university.list.faculty.FacultiesActivity
import com.example.university.list.teacher.TeacherActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        faculties.setOnClickListener {
            startActivity(Intent(this, FacultiesActivity::class.java))
        }
        departments.setOnClickListener {
            startActivity(Intent(this, DepartmentActivity::class.java))
        }
        teachers.setOnClickListener {
            startActivity(Intent(this, TeacherActivity::class.java))
        }
    }

}
