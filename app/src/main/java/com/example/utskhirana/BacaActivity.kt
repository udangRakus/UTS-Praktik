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

class BacaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baca)
        // AMBIL PESAN DENGAN KEY YANG SAMA
        val key = "kunci"
        val getPesan = intent.getStringExtra(key)
        val idTerimaPesan = findViewById<TextView>(R.id.tvTerimaPesan)// PESAN DIMASUKKAN KE TVTERIMAPESAN
        idTerimaPesan.text = getPesan
    }

    // FUNCTION ONCLICK BUTTON KE HALAMAN MAINACTIVITY
    fun fKeMainActivity(view : View){
        val key1 = "kunci2"
        val idpesan = findViewById<EditText>(R.id.etBalasPesan)
        val isipesan = idpesan.text.toString()
        // UNTUK KE HALAMAN MAINACTIVITY
        val intKeMain = Intent(this, MainActivity::class.java)
        // UNTUK MENGIRIM PESAN SESUAI KEY
        intKeMain.apply {
            putExtra(key1,isipesan)
        }
        startActivity(intKeMain)
    }
}