package com.example.university.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FacultyModel::class, DepartmentModel::class, TeacherModel::class], version = 3 , exportSchema = false)
abstract class AppDatabase: RoomDatabase(){

    abstract fun financeDao(): AppDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context):AppDatabase{
            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context,AppDatabase::class.java, "finance.db")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE!!
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}