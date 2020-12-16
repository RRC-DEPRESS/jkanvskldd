package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LuasSgtg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_sgtg)
        var edA = findViewById<EditText>(R.id.edMsknals)
        var edT = findViewById<EditText>(R.id.edMskntgi)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var a = edA.text.toString()
            var A = a.toDouble()
            var t = edT.text.toString()
            var T = t.toDouble()
            var hsl = A * T / 2
            tvHsl.setText("Luas Segitiga dengan \n alas : " + a + " dan tinggi: " + t + " adalah:\n" + hsl.toString())
        })
    }
}