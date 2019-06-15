package com.example.university.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "faculty")
data class FacultyModel (
    @ColumnInfo(name = "faculty_name")
    var facultyName: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "faculty_dean")
    var facultyDean: String = ""
)