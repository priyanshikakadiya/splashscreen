/*
package com.app.splashscreen.activity

import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.splashscreen.adapter.RoomDbRecyclerViewAdapter
import com.app.splashscreen.databinding.ActivityRoomDataBinding
import com.app.splashscreen.model.StudentData
import com.app.splashscreen.viewModel.RecyclerViewModel

class RoomDataActivity : AppCompatActivity(), RoomDbRecyclerViewAdapter.RowClickListener {

    lateinit var mBinding: ActivityRoomDataBinding
    lateinit var recyclerViewAdapter: RoomDbRecyclerViewAdapter
    lateinit var viewModel: RecyclerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityRoomDataBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.recyclerViewDB.apply {
            layoutManager = LinearLayoutManager(this@RoomDataActivity)
            recyclerViewAdapter = RoomDbRecyclerViewAdapter(this@RoomDataActivity)
            adapter = recyclerViewAdapter
            val divider = DividerItemDecoration(applicationContext, VERTICAL)
            addItemDecoration(divider)
        }
//        viewModel = ViewModelProviders.of(this).get(RecyclerViewModel::class.java)
        viewModel.getAllStudentsObserver().observe(this, Observer {
            recyclerViewAdapter.setListData(ArrayList(it))
            recyclerViewAdapter.notifyDataSetChanged()
        })

        mBinding.btnSend.setOnClickListener {
            val name = mBinding.etName.text.toString()
            val email = mBinding.etEmail.text.toString()
            val enroll = mBinding.etEnRoll.text.toString()

            if (mBinding.btnSend.text.equals("Save")) {
                val studentData = StudentData(0, name, email, enroll)
                viewModel.insertStudentData(studentData)
            } else {
                val studentData = StudentData(
//                    mBinding.etName.getTag(mBinding.etName.id).toString().toInt(),
                    1,
                    name,
                    email,
                    enroll
                )
                viewModel.updateStudentData(studentData)
                mBinding.btnSend.text = "Save"
            }
            mBinding.etName.setText("")
            mBinding.etEmail.setText("")
            mBinding.etEnRoll.setText("")
        }
    }

    override fun onDeleteUserClickListener(studentData: StudentData) {
        viewModel.deleteStudentData(studentData)
    }

    override fun onItemClickListener(studentData: StudentData) {
        mBinding.etName.setText(studentData.studentName)
        mBinding.etEmail.setText(studentData.studentEmail)
        mBinding.etEnRoll.setText(studentData.studentRoll)
        mBinding.etName.setTag(mBinding.etName.id, studentData.id)
        mBinding.btnSend.text = "Update"
    }
}*/
