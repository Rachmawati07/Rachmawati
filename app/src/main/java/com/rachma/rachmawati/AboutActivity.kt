package com.rachma.rachmawati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rachma.rachmawati.databinding.ActivityAboutBinding

// Untuk mendeklarasikan kelas yang bernama AboutActivity
// Dan untuk menginisialisasi variabel binding untuk ActivityAboutBinding
class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    // Untuk memanggil kelas super onCreate dalam pembuatan activity ini
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Untuk memanggil ActivityAboutBinding dengan menggunakan binding
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Untuk memberikan fungsi klik listener pada buttonHomeAbout agar ketika diklik bisa diarahkan pada fungsi home
        binding.buttonHomeAbout.setOnClickListener { home() }
    }

    // Untuk mendeklarasikan fungsi yang bernama home
    private fun home(){

        // Untuk mendeklarasikan variabel berupa intentHome dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(AboutActivity menuju ke kelas HomeActivity)
        val intentHome = Intent(this, HomeActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentHome)
    }
}