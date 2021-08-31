package com.example.mysimpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_screen.*

class  LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        login.setOnClickListener {
            var uname = username_login.text.toString()
            var pass = password_login.text.toString()

            if(uname.isEmpty() || pass.isEmpty())
                Toast.makeText(
                    this,
                    "Username and password are mandatory",
                    Toast.LENGTH_SHORT
                ).show()

            else{
                val i = Intent(this, WelcomeScreen::class.java)
                i.putExtra("Username",uname)
                startActivity(i)
            }

        }

    }
}