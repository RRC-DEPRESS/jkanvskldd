package com.example.tubesgoblok

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MenuHitungBDTR : AppCompatActivity() {
    lateinit var tvPsg: TextView
    lateinit var tvLngkrn: TextView
    lateinit var tvPsgPjg: TextView
    lateinit var tvSgtg: TextView
    lateinit var tvTrpsm: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_hitung_b_d_t_r)

        tvPsg = findViewById<TextView>(R.id.tv_Mnghtg_Psg)
        tvLngkrn = findViewById<TextView>(R.id.tv_Mnghtg_lngkrn)
        tvPsgPjg = findViewById<TextView>(R.id.tv_Mnghtg_PsgPjg)
        tvSgtg = findViewById<TextView>(R.id.tv_Mnghtg_Sgtg)
        tvTrpsm = findViewById<TextView>(R.id.tv_Mnghtg_Trpsm)

        tvPsg.setOnClickListener(View.OnClickListener { popupMenu() })
        tvLngkrn.setOnClickListener(View.OnClickListener { popupMenu1() })
        tvPsgPjg.setOnClickListener(View.OnClickListener { popupMenu2() })
        tvSgtg.setOnClickListener(View.OnClickListener { popupMenu3() })
        tvTrpsm.setOnClickListener(View.OnClickListener { popupMenu4() })
    }

    private fun popupMenu() {
        val popupMenu = PopupMenu(this, tvPsg)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            when (item.itemId) {
                R.id.htg_luas_item -> {
                    val i = Intent(this, LuasPsg::class.java)
                    startActivity(i)
                    true
                }
                R.id.htg_kelling_item -> {
                    val ii = Intent(this, KelilingPsg::class.java)
                    startActivity(ii)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    private fun popupMenu1() {
        val popupMenu = PopupMenu(this, tvLngkrn)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            when (item.itemId) {
                R.id.htg_luas_item -> {
                    val i = Intent(this, LuasLingkrn::class.java)
                    startActivity(i)
                    true
                }
                R.id.htg_kelling_item -> {
                    val ii = Intent(this, KelilingLingkrn::class.java)
                    startActivity(ii)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    private fun popupMenu2() {
        val popupMenu = PopupMenu(this, tvPsgPjg)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            when (item.itemId) {
                R.id.htg_luas_item -> {
                    val i = Intent(this, LuasPsgPjg::class.java)
                    startActivity(i)
                    true
                }
                R.id.htg_kelling_item -> {
                    val ii = Intent(this, KelilingPsgPjg::class.java)
                    startActivity(ii)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    private fun popupMenu3() {
        val popupMenu = PopupMenu(this, tvSgtg)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            when (item.itemId) {
                R.id.htg_luas_item -> {
                    val i = Intent(this, LuasSgtg::class.java)
                    startActivity(i)
                    true
                }
                R.id.htg_kelling_item -> {
                    val ii = Intent(this, KelilingSgtg::class.java)
                    startActivity(ii)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }

    private fun popupMenu4() {
        val popupMenu = PopupMenu(this, tvTrpsm)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener { item ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
            when (item.itemId) {
                R.id.htg_luas_item -> {
                    val i = Intent(this, LuasTrapesm::class.java)
                    startActivity(i)
                    true
                }
                R.id.htg_kelling_item -> {
                    val ii = Intent(this, KelilingTrapesm::class.java)
                    startActivity(ii)
                    true
                }
                else -> false
            }
        }
        popupMenu.show()
    }
}