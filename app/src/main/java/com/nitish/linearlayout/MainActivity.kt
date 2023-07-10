package com.nitish.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etName:EditText?=null
    var etRollNo:EditText?=null
    var etHeight:EditText?=null
    var btnValidate:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etRollNo = findViewById(R.id.etRollNo)
        etHeight = findViewById(R.id.etHeight)
        btnValidate = findViewById(R.id.btnValidate)

        btnValidate?.setOnClickListener {
            if (etName?.text.toString().isNullOrEmpty()){
                etName?.error = "Enter your name"
            }
            else if (etRollNo?.text.toString().isNullOrEmpty()){
                etRollNo?.error = "Enter your roll no"
            }
            else if(etHeight?.text.toString().isNullOrEmpty()){
                etHeight?.error = "Enter your height"
            }
            else{
                Toast.makeText(this, "Validate values", Toast.LENGTH_SHORT).show()

                var intent = Intent(this,SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }

}