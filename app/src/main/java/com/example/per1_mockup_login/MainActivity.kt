package com.example.per1_mockup_login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan ini sesuai dengan nama layout Anda

        // Menghubungkan ID XML dengan variabel Kotlin
        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_btn) //

        // Mengatur aksi untuk tombol login
        loginButton.setOnClickListener {
            // Mengambil teks dari EditText
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Menampilkan Toast dengan username dan password
            Toast.makeText(this, "Username: $username\nPassword: $password", Toast.LENGTH_SHORT).show()
        }
    }
}