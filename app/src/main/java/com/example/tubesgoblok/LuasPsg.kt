package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LuasPsg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_psg)
        var esHtgluas = findViewById<EditText>(R.id.edMsknsisi)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var sisi = esHtgluas.text.toString()
            var ss = sisi.toDouble()
            var hsl = ss * ss
            tvHsl.setText("Luas Persegi dengan sisi :" + sisi + " \n adalah : " + hsl.toString())
        })
    }
}