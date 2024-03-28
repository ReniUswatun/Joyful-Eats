package com.reni.joyfuleats

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    private lateinit var buttonToInstagram: Button
    private lateinit var buttonToGithub: Button
    private lateinit var buttonToShare: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        buttonToInstagram = findViewById(R.id.go_to_instagram)
        buttonToGithub = findViewById(R.id.go_to_github)
        buttonToShare = findViewById(R.id.go_to_share)
        buttonToInstagram.setOnClickListener {

            val instagramIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/reni_uswtn/"))
            startActivity(instagramIntent)
        }

        buttonToGithub.setOnClickListener {

            val githubIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ReniUswatun"))
            startActivity(githubIntent)
        }
        buttonToShare.setOnClickListener {
            val textToShare =
                "Nama: ${getString(R.string.developer_profile_name)}\nNim: ${getString(R.string.developer_profile_nim)}"
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain" // Menentukan tipe konten sebagai teks biasa
                putExtra(
                    Intent.EXTRA_TEXT,
                    textToShare
                ) // Menambahkan teks yang akan dibagikan ke intent
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }
}

