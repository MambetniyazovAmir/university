package com.example.university.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "departments")
data class DepartmentModel (
    @ColumnInfo(name = "name")
    var name: String,
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
)