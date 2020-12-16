package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KelilingPsgPjg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keliling_psg_pjg)
        var edL = findViewById<EditText>(R.id.edMsknlbr)
        var edP = findViewById<EditText>(R.id.edMsknpjg)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var p = edP.text.toString()
            var l = edL.text.toString()
            var P = p.toDouble()
            var L = l.toDouble()
            var hsl = 2 * P + L
            tvHsl.setText("Keliling Persegi Panjang dengan \n panjang : $p dan lebar: $l adalah: \n ${hsl.toString()} ")
        })
    }
}