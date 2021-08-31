package com.example.mysimpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        about.setOnClickListener {
            val i = Intent(this, AboutScreen::class.java)
            startActivity(i)
        }

        login_main.setOnClickListener {
            val i = Intent(this, LoginScreen::class.java)
            startActivity(i)

        }

        signup_main.setOnClickListener {
            val i = Intent(this, SignUpScreen::class.java)
            startActivity(i)

        }

    }
}