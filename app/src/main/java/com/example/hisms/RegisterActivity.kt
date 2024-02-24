package com.example.hisms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    // declaring the variable for registration fields
    lateinit var name: String
    lateinit var password: String
    lateinit var rePass: String
    lateinit var email: String
    lateinit var phNumber: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // action listener to go to main activity
        val mainButton = findViewById<Button>(R.id.mainActivity)

        mainButton.setOnClickListener{

            name = (R.id.fullNameText).toString()
            password = (R.id.passwordText).toString()
            rePass = (R.id.rePasswordText).toString()
            email = (R.id.emailText).toString()
            phNumber = R.id.phoneText.toString()

            if(TextUtils.isEmpty(name) || TextUtils.isEmpty(password) || TextUtils.isEmpty(rePass) || TextUtils.isEmpty(email) || TextUtils.isEmpty(phNumber)) {
                Toast.makeText(this, "Please fill all the details", Toast.LENGTH_SHORT).show()
            } else {
                //val myIntent = Intent(this, MainActivity::class.java)
                //startActivity(myIntent)
                //Toast.makeText(MainActivity::class.java, "Registration Successful!", Toast.LENGTH_SHORT).show()
            }

        }

        // creating a createAccount function
      //  createAccount(email, password)
    }

    //fun createAccount(email: String, password: String) {

    //}
}