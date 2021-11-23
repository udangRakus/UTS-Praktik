package com.example.utskhirana
/*
*
* AUTHOR @KHIRANA DWICAHYO
* NIM 19523134
* PAB KELAS D
*
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TERIMA PESAN BALIK DARI HALAMAN BACA DENGAN KEY YANG SAMA
        val key1 = "kunci2"
        val getPesan = intent.getStringExtra(key1)
        val idTerimaPesan = findViewById<TextView>(R.id.tvPesan) // PESAN DIMASUKKAN KE TVPESAN
        idTerimaPesan.text = getPesan
    }
    val key = "kunci"

    // FUNCTION ONCLICK BUTTON KE HALAMAN PROFIL
    fun fProfilActivity(view: View){
        val intKeprofil = Intent(this, ProfilActivity::class.java)
        startActivity(intKeprofil)
    }

    // ONCLICK PESAN KE HALAMAN BACA
    fun fBacaActivity(view: View){
        val idPesan = findViewById<EditText>(R.id.etIsipesan)
        val isiPesan = idPesan.text.toString()
        // UNTUK PINDAH KE HALAMAN BACA
        val intKebaca = Intent(this, BacaActivity::class.java)
        // KIRIM PESAN SESUAI KEY KE HALAMAN BACA
        intKebaca.apply {
            putExtra(key, isiPesan)
        }
        // MENJALANKAN FUNGSI INTKEBACA
        startActivity(intKebaca)
    }
}