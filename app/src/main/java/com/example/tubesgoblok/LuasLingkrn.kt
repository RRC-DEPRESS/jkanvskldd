package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LuasLingkrn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_lingkrn)
        var esHtgluas = findViewById<EditText>(R.id.edMsknsisi)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var r = esHtgluas.text.toString()
            var R = r.toDouble()
            var phi = 3.14
            var hsl = phi * (R * R)
            tvHsl.setText("Luas Lingkaran dengan jari -jari:" + r + "\n adalah: " + hsl.toString())
        })
    }
}