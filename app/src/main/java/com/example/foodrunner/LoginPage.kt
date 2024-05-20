package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
class LoginPage : AppCompatActivity() {
    lateinit var imgLogo:ImageView
    lateinit var edtMob:EditText
    lateinit var edtPass:EditText
    lateinit var btnLogin:Button
    lateinit var txtForgotpass:TextView
    lateinit var txtRegister:TextView
    val validMob = "7807212518"
    val validPass = "Radhe"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        title = "Log In"
        edtMob = findViewById(R.id.edtMob)
        edtPass = findViewById(R.id.edtPass)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotpass = findViewById(R.id.txtForgotpass)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener {
            val mobile =edtMob.text.toString()
            val password=edtPass.text.toString()
            if  (mobile== validMob && password==validPass) {
                val intent = Intent(this@LoginPage,MainActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(this@LoginPage,"Invalid Credential",Toast.LENGTH_LONG).show()
            }
            txtRegister.setOnClickListener({
                val Rintent =Intent(this@LoginPage,RegstrationPage::class.java)
            startActivity(Rintent)
            })
            txtForgotpass.setOnClickListener( {
                val Fintent =Intent(this@LoginPage,ForgotPass::class.java)
            startActivity(Fintent)
            })


        }
    }
}


