package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KelilingPsg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keliling_psg)
        var esHtgluas = findViewById<EditText>(R.id.edMsknsisi)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var sisiStr = esHtgluas.getText().toString()
            var sisi = sisiStr.toDouble()
            var hsl = sisi+sisi+sisi+sisi
            tvHsl.setText("Keliling Persegi dengan sisi: $sisi adalah: $hsl")
        })
    }
}