package com.example.university.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AppDao {
    @Query("SELECT * FROM faculty")
    fun getAllContacts(): List<FacultyModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addFaculty(model: FacultyModel)
}