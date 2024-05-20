package com.example.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
class ForgotPass : AppCompatActivity() {
    lateinit var edtForgotMob:EditText
    lateinit var edtForgotEmail:EditText
    lateinit var btnFogotNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)
        title = "Fogot Password"
        edtForgotMob = findViewById(R.id.edtForgotMob)
        edtForgotEmail = findViewById(R.id.edtForgotEmail)
        btnFogotNext = findViewById(R.id.btnForgotNext)

        btnFogotNext.setOnClickListener({
            val intent= Intent(this@ForgotPass,LoginPage::class.java)
            startActivity(intent)
        }
        )

    }
}