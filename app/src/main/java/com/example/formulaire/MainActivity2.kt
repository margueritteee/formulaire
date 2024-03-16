package com.example.formulaire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var nomVal: TextView
    private lateinit var phoneVal: TextView
    private lateinit var specVal :TextView
    private lateinit var webVal: TextView
    private lateinit var phoneIcon: ImageView
    private lateinit var mapIcon: ImageView
    private lateinit var webIcon: ImageView
    private lateinit var latVal: TextView
    private lateinit var longVal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nomVal = findViewById(R.id.nomVal)
        phoneVal = findViewById(R.id.phoneVal)
        specVal = findViewById(R.id.specVal)
        webVal = findViewById(R.id.webVal)
        phoneIcon = findViewById(R.id.phoneIcon)
        mapIcon = findViewById(R.id.mapIcon)
        webIcon = findViewById(R.id.webIcon)
        latVal = findViewById(R.id.latVal)
        longVal = findViewById(R.id.longVal)

        val name = intent.getStringExtra("nom")
        val phone = intent.getStringExtra("num")
        val specialty = intent.getStringExtra("spec")
        val latitude = intent.getStringExtra("lat")
        val longitude = intent.getStringExtra("longt")
        val website = intent.getStringExtra("sm")

        nomVal.text = name
        phoneVal.text = phone
        specVal.text = specialty
        latVal.text = latitude
        longVal.text = longitude
        webVal.text = website

        phoneIcon.setOnClickListener {
            val uri = Uri.parse("tel:$phone")
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)
        }

        mapIcon.setOnClickListener {
            val data = Uri.parse("geo:$latitude,$longitude")
            val intent = Intent(Intent.ACTION_VIEW,data)
            startActivity(intent)
        }

        webIcon.setOnClickListener {
            val uri = Uri.parse(website)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        } //lazm link ytktb b https://


    }
}
