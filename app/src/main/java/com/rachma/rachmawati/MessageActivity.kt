package com.rachma.rachmawati

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.rachma.rachmawati.databinding.ActivityMessageBinding

// Untuk mendeklarasikan konstanta publik EXTRA_MESSAGE dikarenakan pada activity berikutnya menggunakan kunci untuk mendapatkan kembali nilai teks
const val EXTRA_MESSAGE = "com.rachma.rachmawati.MESSAGE"

// Untuk mendeklarasikan kelas yang bernama MessageActivity
// Dan untuk menginisialisasi variabel binding untuk ActivityMessageBinding
class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessageBinding

    // Untuk memanggil kelas super onCreate dalam pembuatan activity ini
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // Untuk memanggil ActivityMessageBinding dengan menggunakan binding
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Untuk memberikan fungsi klik listener pada buttonSend agar ketika diklik bisa diarahkan pada fungsi sendMessage
        binding.buttonSend.setOnClickListener{ sendMessage() }

        // Untuk memberikan fungsi klik listener pada buttonHomeMessage agar ketika diklik bisa diarahkan pada fungsi home
        binding.buttonHomeMessage.setOnClickListener{ home() }
    }

    // Untuk mendeklarasikan fungsi yang bernama SendMessage
    private fun sendMessage() {

        // Untuk mendeklarasikan variabel editText dan menentukan metode masukkan
        val editText = findViewById<EditText>(R.id.editTextEnterMessage)

        // Untuk mendeklarasikan variabel message dan kemudian dikonversi dari teks menjadi string
        val message = editText.text.toString()

        // Untuk mendeklarasikan variabel berupa intent dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(MessageActivity menuju ke kelas ShowMessageActivity)
        // Dan menggunakan metode putExtra() untuk menambahkan nilai EditText ke intent
        val intent = Intent(this, ShowMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intent)
    }

    // Untuk mendeklarasikan fungsi yang bernama home
    private fun home(){

        // Untuk mendeklarasikan variabel berupa intentHome dari kelas Intent
        // Untuk mendeklarasikan parameter dari kelas aktif yang digunakan sekarang(MessageActivity menuju ke kelas HomeActivity)
        val intentHome = Intent(this, HomeActivity::class.java)

        // Untuk menjalankan activity melalui intent yang telah dideklarasikan
        startActivity(intentHome)
    }
}