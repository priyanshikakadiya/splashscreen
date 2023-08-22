package com.app.splashscreen.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.splashscreen.R
import com.app.splashscreen.model.PassDataModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class PassDataActivity : AppCompatActivity() {

    //edit text for input the data
    lateinit var etName: EditText
    lateinit var etEnroll: EditText
    lateinit var etEmail: EditText
    private lateinit var dbReference: DatabaseReference


    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_data)

        etName = findViewById(R.id.etName)
        etEnroll = findViewById(R.id.etEnRoll)
        etEmail = findViewById(R.id.etEmail)
        btnSend = findViewById(R.id.btnSend)

        dbReference = FirebaseDatabase.getInstance().getReference("studentData")


        btnSend.setOnClickListener {
            saveDataBase()
        }

        /*val bundle = Bundle()
        bundle.putString("studentName", etName.text.toString())
        bundle.putString("roll", etEnroll.text.toString())
        bundle.putString("email", etEmail.text.toString())

        val intent = Intent(this, ReceiverActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)*/
    }

    private fun saveDataBase() {
        val studentName = etName.text.toString()
        val studentEnroll = etEnroll.text.toString()
        val studentEmail = etEmail.text.toString()

        if (studentName.isBlank() && studentEnroll.isBlank() && studentEmail.isBlank()) {
            Toast.makeText(this, "Please add some data.", Toast.LENGTH_SHORT).show()
        } else {
            val studentId = dbReference.push().key!!

            val studentData = PassDataModel(studentId, studentName, studentEmail, studentEnroll)

            dbReference.child(studentId).setValue(studentData)
                .addOnCompleteListener {
                    Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Error ${it.message}", Toast.LENGTH_SHORT).show()
                }
        }
    }
}
