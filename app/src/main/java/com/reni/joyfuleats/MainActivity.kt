package com.reni.joyfuleats

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    private lateinit var buttonDeveloper: ImageButton
    private lateinit var buttonSetting: ImageButton
    private lateinit var buttonBakso: CardView
    private lateinit var buttonBubur: CardView
    private lateinit var buttonSeblak: CardView
    private lateinit var buttonPenyet: CardView
    private lateinit var buttonSoto: CardView
    private lateinit var buttonGeprek: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonDeveloper = findViewById<ImageButton>(R.id.developer_button)
        buttonDeveloper.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent) // Menggunakan startActivity untuk memulai aktivitas baru
        }

        buttonSetting = findViewById(R.id.profile_settings_button)
        buttonSetting.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.setting_account_icon)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()
        }
        buttonBakso = findViewById(R.id.card_bakso)
        buttonBakso.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.letter_to_icon_bakso)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()
        }


        buttonBubur = findViewById(R.id.card_bubur_ayam)
        buttonBubur.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.letter_to_icon_bubur_ayam)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()

        }
        buttonSeblak = findViewById(R.id.card_seblak)
        buttonSeblak.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.letter_to_icon_seblak)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()

        }

        buttonPenyet = findViewById(R.id.card_ayam_penyet)
        buttonPenyet.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.letter_to_icon_ayam_geprek)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()


        }
        buttonSoto = findViewById(R.id.card_soto_ayam)
        buttonSoto.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.letter_to_icon_soto_ayam)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()
        }
        buttonGeprek = findViewById(R.id.card_ayam_geprek)
        buttonGeprek.setOnClickListener {
            Toast.makeText(
                this,
                "${getString(R.string.letter_to_icon_ayam_geprek)} Clicked, Next page under development by the developer",
                Toast.LENGTH_SHORT
            ).show()

        }


    }


}