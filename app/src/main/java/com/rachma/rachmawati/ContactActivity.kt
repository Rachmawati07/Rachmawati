package com.rachma.rachmawati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rachma.rachmawati.databinding.ActivityContactBinding

// Untuk mendeklarasikan kelas yang bernama ContactActivity
// Dan untuk menginisialisasi variabel binding untuk ActivityContactBinding
class ContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactBinding

    // Untuk memanggil kelas super onCreate dalam pembuatan activity ini
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        // Untuk memanggil ActivityContactBinding dengan menggunakan binding
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Untuk memberikan fungsi klik listener pada buttonHomeContact agar ketika diklik bisa diarahkan pada fungsi home
        binding.buttonHomeContact.setOnClickListener { home() }
    }

    // Untuk mendeklarasikan fungsi yang bernama home
    private fun home(){

        // Untuk mendeklarasikan variabel berupa intentHome dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(ContactActivity menuju ke kelas HomeActivity)
        val intentHome = Intent(this, HomeActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentHome)
    }

}