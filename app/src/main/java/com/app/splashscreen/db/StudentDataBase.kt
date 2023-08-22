/*
package com.app.splashscreen.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.app.splashscreen.dao.StudentDao
import com.app.splashscreen.model.StudentData


@Database(entities = [StudentData::class], version = 1, exportSchema = false)
abstract class StudentDataBase : RoomDatabase() {

    abstract fun studentDao(): StudentDao?

    companion object {
        private var INSTANCE: StudentDataBase? = null

        fun getAppDatabase(context: Context): StudentDataBase? {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder<StudentDataBase>(
                    context.applicationContext, StudentDataBase::class.java, "StudentDB"
                )
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE
        }
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}*/
