package com.example.hisms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    // declaring the variable for registration fields
    lateinit var name: String
    lateinit var password: String
    lateinit var rePass: String
    lateinit var email: String
    lateinit var phNumber: String
    lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mAuth = FirebaseAuth.getInstance()

        // action listener to go to main activity
        val mainButton = findViewById<Button>(R.id.mainActivity)

        mainButton.setOnClickListener{

            name = findViewById<EditText>(R.id.fullNameText).text.toString()
            password = findViewById<EditText>(R.id.passwordText).text.toString()
            rePass = findViewById<EditText>(R.id.rePasswordText).text.toString()
            email = findViewById<EditText>(R.id.emailText).text.toString()
            phNumber = findViewById<EditText>(R.id.phoneText).text.toString()

            if(TextUtils.isEmpty(name) || TextUtils.isEmpty(password) || TextUtils.isEmpty(rePass) || TextUtils.isEmpty(email) || TextUtils.isEmpty(phNumber)) {
                Toast.makeText(this, "Please fill all the details", Toast.LENGTH_SHORT).show()
            } else {
                createAccount(email, password)
            }

        }
    }

    fun createAccount(email: String, password: String) {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            if(it.isSuccessful) {
                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "${it.exception?.localizedMessage.toString()}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}