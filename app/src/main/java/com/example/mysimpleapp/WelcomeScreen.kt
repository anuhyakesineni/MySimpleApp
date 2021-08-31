package com.example.mysimpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_welcome_screen.*

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        var b:Bundle? = intent.extras
        var name = "Welcome " + b?.getString("Username")

        user.text = name

        Toast.makeText(
            this,
            "You are successfully logged in!",
            Toast.LENGTH_SHORT
        ).show()
    }
}