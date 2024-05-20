package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

 class RegstrationPage : AppCompatActivity() {
    lateinit var edtName:EditText
    lateinit var edtEmail:EditText
    lateinit var edtMobile:EditText
    lateinit var edtDelivery:EditText
    lateinit var edtPassword:EditText
    lateinit var edtConformPass:EditText
    lateinit var btnRegister:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regstration_page)
        title="Registraton Page"
        edtName=findViewById(R.id.edtName)
        edtEmail=findViewById(R.id.edtEmail)
        edtMobile=findViewById(R.id.edtMobile)
        edtDelivery=findViewById(R.id.edtDelivery)
        edtPassword=findViewById(R.id.edtPassword)
        edtConformPass=findViewById(R.id.edtConformPass)
        btnRegister=findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this@RegstrationPage,LoginPage::class.java)
            startActivity(intent)
            Toast.makeText(this@RegstrationPage,"Register Sucessfully",Toast.LENGTH_LONG)
        }


    }
}