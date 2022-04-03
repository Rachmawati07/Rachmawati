package com.rachma.rachmawati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rachma.rachmawati.databinding.ActivityHomeBinding

// Untuk mendeklarasikan kelas yang bernama HomeActivity
// Dan untuk menginisialisasi variabel binding untuk ActivityHomeBinding
class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    // Untuk memanggil kelas super onCreate dalam pembuatan activity ini
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Untuk memanggil ActivityHomeBinding dengan menggunakan binding
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Untuk memberikan fungsi klik listener pada buttonProfile agar ketika diklik bisa diarahkan pada fungsi profile
        binding.buttonProfile.setOnClickListener { profile() }

        // Untuk memberikan fungsi klik listener pada buttonAbout agar ketika diklik bisa diarahkan pada fungsi about
        binding.buttonAbout.setOnClickListener { about() }

        // Untuk memberikan fungsi klik listener pada buttonContact agar ketika diklik bisa diarahkan pada fungsi contact
        binding.buttonContact.setOnClickListener { contact() }

        // Untuk memberikan fungsi klik listener pada buttonMessage agar ketika diklik bisa diarahkan pada fungsi message
        binding.buttonMesssage.setOnClickListener { message() }
    }

    // Untuk mendeklarasikan fungsi yang bernama profile
    private fun profile(){

        // Untuk mendeklarasikan variabel berupa intentProfile dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(HomeActivity menuju ke kelas ProfileActivity)
        val intentProfile = Intent(this, ProfileActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentProfile)
    }

    // Untuk mendeklarasikan fungsi yang bernama about
    private fun about(){

        // Untuk mendeklarasikan variabel berupa intentAbout dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(HomeActivity menuju ke kelas AboutActivity)
        val intentAbout = Intent(this, AboutActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentAbout)
    }

    // Untuk mendeklarasikan fungsi yang bernama contact
    private fun contact(){

        // Untuk mendeklarasikan variabel berupa intentContact dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(HomeActivity menuju ke kelas ContactActivity)
        val intentContact = Intent(this, ContactActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentContact)
    }

    // Untuk mendeklarasikan fungsi yang bernama message
    private fun message(){

        // Untuk mendeklarasikan variabel berupa intentMessage dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(HomeActivity menuju ke kelas MessageActivity)
        val intentMessage = Intent(this, MessageActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentMessage)
    }
}