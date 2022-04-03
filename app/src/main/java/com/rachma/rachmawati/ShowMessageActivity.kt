package com.rachma.rachmawati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rachma.rachmawati.databinding.ActivityShowMessageBinding

// Untuk mendeklarasikan kelas yang bernama ShowMessageActivity
// Dan untuk menginisialisasi variabel binding untuk ActivityShowMessageBinding
class ShowMessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShowMessageBinding

    // Untuk memanggil kelas super onCreate dalam pembuatan activity ini
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        // Untuk memanggil ActivityShowMessageBinding dengan menggunakan binding
        binding = ActivityShowMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Untuk memberikan fungsi klik listener pada buttonBack agar ketika diklik bisa diarahkan pada fungsi home
        binding.buttonBack.setOnClickListener { home() }

        // Untuk mendeklarasikan variabel message dan mendapatkan intent yang dimulai pada activity ini
        // Dan mengekstrak string
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // Untuk mendeklarasikan variabel textView dan menangkap teks view pada layout
        // Dan mengatur stringnya sebagai teks message
        val textView = findViewById<TextView>(R.id.textShowMessage).apply {
            text = message
        }
    }

    // Untuk mendeklarasikan fungsi yang bernama home
    private fun home(){

        // Untuk mendeklarasikan variabel berupa intentBack dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(ShowMessageActivity menuju ke kelas MessageActivity)
        val intentBack = Intent(this, MessageActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentBack)
    }

}