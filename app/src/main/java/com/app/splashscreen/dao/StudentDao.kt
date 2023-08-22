/*
package com.app.splashscreen.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.app.splashscreen.model.StudentData

@Dao
interface StudentDao {

    @Insert
    fun insertStudent(studentData: StudentData?)

    @Query("select * from studentData")
    fun getAllStudentList(): List<StudentData>?

    @Update
    fun updateStudent(studentData: StudentData?)

    @Delete
    fun deleteStudent(studentData: StudentData?)
}*/
