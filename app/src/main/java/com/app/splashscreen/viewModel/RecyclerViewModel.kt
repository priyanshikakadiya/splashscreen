/*
package com.app.splashscreen.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.splashscreen.db.StudentDataBase
import com.app.splashscreen.model.StudentData

class RecyclerViewModel(app: Application) : AndroidViewModel(app) {

    lateinit var allStudents: MutableLiveData<List<StudentData>>

    init {
        allStudents = MutableLiveData()
    }

    fun getAllStudentsObserver(): MutableLiveData<List<StudentData>> {
        return allStudents
    }

    fun getAllStudents() {
        val studentDao = StudentDataBase.getAppDatabase((getApplication()))?.studentDao()
        val list = studentDao?.getAllStudentList()

        allStudents.postValue(list!!)
    }

    fun insertStudentData(data: StudentData) {
        val studentDao = StudentDataBase.getAppDatabase((getApplication()))?.studentDao()
        studentDao?.insertStudent(data)
    }

    fun updateStudentData(data: StudentData) {
        val studentDao = StudentDataBase.getAppDatabase((getApplication()))?.studentDao()
        studentDao?.updateStudent(data)
    }

    fun deleteStudentData(data: StudentData) {
        val studentDao = StudentDataBase.getAppDatabase((getApplication()))?.studentDao()
        studentDao?.deleteStudent(data)
        getAllStudents()
    }
}*/
