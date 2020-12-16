package com.example.tubesgoblok

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bKirim = findViewById<Button>(R.id.btnok)
        var edNama = findViewById<EditText>(R.id.editUN)
        var edPass = findViewById<EditText>(R.id.editPass)
        bKirim.setOnClickListener(View.OnClickListener{
            var user = edNama.text.toString()
            var pass = edPass.text.toString()
            if (pass == "123" && user == "admin") {
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_LONG).show()
                val i = Intent(this,MenuHitungBDTR::class.java)
                startActivity(i)
            } else {
                Toast.makeText(this, "password salah", Toast.LENGTH_LONG).show()
            }
        })
    }
}