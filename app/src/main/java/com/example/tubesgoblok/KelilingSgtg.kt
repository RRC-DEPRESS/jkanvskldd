package com.example.tubesgoblok

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KelilingSgtg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keliling_sgtg)
        var edA = findViewById<EditText>(R.id.edMsknals)
        var edT = findViewById<EditText>(R.id.edMskntgi)
        var edssm = findViewById<EditText>(R.id.edMsknssM)
        var bttnHsl = findViewById<Button>(R.id.bttn_hasil)
        var tvHsl = findViewById<TextView>(R.id.shw_hsl)
        bttnHsl.setOnClickListener(View.OnClickListener {
            var a = edA.text.toString()
            var t = edT.text.toString()
            var ssm = edssm.text.toString()
            var SisiMiring = ssm.toDouble()
            var alas = a.toDouble()
            var tinggi = t.toDouble()
            var hsl = SisiMiring + alas + tinggi
            tvHsl.setText("Keliling Segitiga dengan \n alas : " + a + ", tinggi: " + t + " dan sisi miring: " + ssm + "\n adalah: " + hsl.toString())
        })
    }
}