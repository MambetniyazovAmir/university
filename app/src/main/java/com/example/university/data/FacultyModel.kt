package com.example.university.data

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "faculty")
data class FacultyModel (
    @ColumnInfo(name = "faculty_name")
    var facultyName: String,
    @ColumnInfo(name = "faculty_dean")
    var facultyDean: String = ""
)