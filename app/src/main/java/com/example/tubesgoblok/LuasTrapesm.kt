package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LuasTrapesm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_trapesm)
        var edAB = findViewById<EditText>(R.id.edMsknAB)
        var edEF = findViewById<EditText>(R.id.edMsknEF)
        var edt = findViewById<EditText>(R.id.edMsknt)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var AB = edAB.text.toString()
            var ab = AB.toDouble()
            var t = edt.text.toString()
            var T = t.toDouble()
            var EF = edEF.text.toString()
            var ef = EF.toDouble()
            var hsl = (ab + ef) * T / 2
            tvHsl.setText("Luas Trapesium dengan panjang\nAB: " + AB + " , panjang EF: " + EF + " dan\n tinggi: " + t + " adalah: " + hsl.toString())
        })
    }
}