package com.example.mysimpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up_screen.*

class SignUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)

        sign_up.setOnClickListener {

            var firstName =first_name.text.toString()
            var lastName =last_name.text.toString()
            var username = username_signup.text.toString()
            var password = password_signup.text.toString()
            var confirmPassword = confirm_password.text.toString()
            var phoneNo = phone_number.text.toString()
            var email = email.text.toString()
            var country = country.text.toString()
            var pincode = pin_code.text.toString()

            if(firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || phoneNo.isEmpty() || email.isEmpty() || country.isEmpty() || pincode.isEmpty())
                Toast.makeText(
                    this,
                    "Please fill all the fields",
                    Toast.LENGTH_SHORT
                ).show()

            else if(password != confirmPassword)
                Toast.makeText(
                    this,
                    "Password and confirm password are mismatched!",
                    Toast.LENGTH_SHORT
                ).show()

            else if(!check_box.isChecked)
                Toast.makeText(
                    this,
                    "Please agree to the terms and conditions to register",
                    Toast.LENGTH_SHORT
                ).show()


            else{
                Toast.makeText(
                    this,
                    "Successfully registered!",
                    Toast.LENGTH_SHORT
                ).show()

                val i = Intent(this, LoginScreen::class.java)
                startActivity(i)




            }
        }
    }
}