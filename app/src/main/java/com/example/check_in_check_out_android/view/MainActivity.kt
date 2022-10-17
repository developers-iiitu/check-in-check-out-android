package com.example.check_in_check_out_android.view


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.check_in_check_out_android.R

class MainActivity : AppCompatActivity() {

    lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signupButton = findViewById(R.id.signup)
        signupButton.setOnClickListener {
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)
//            Toast.makeText(this@MainActivity, "Open", Toast.LENGTH_SHORT).show()
        }
    }
}