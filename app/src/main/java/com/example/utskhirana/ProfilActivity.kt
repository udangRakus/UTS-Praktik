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

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
    }

    // FUNCTION ONCLICK BUTTON KE HALAMAN MAINACTIVITY
    fun fBerandaActivity(view: View){
        val intKeberanda = Intent(this, MainActivity::class.java)
        startActivity(intKeberanda)
    }
}