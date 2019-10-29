package com.example.responsi_271

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            val email = email.text.toString()
            val password = pas.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Pasaword", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "deddycahya132gmail.com" || password =="5170411271") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
        btn_daftar.setOnClickListener{
            val intent = Intent( this, Register::class.java)
            startActivity(intent)
        }
    }
}
