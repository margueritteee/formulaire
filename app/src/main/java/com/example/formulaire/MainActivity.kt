//kezrane margueritte groupe 2
package com.example.formulaire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var nom: EditText
    private lateinit var num: EditText
    private lateinit var spec: EditText
    private lateinit var lat: EditText
    private lateinit var longt: EditText
    private lateinit var sm: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.nompren)
        num = findViewById(R.id.numero)
        spec = findViewById(R.id.spec)
        lat = findViewById(R.id.lat)
        longt = findViewById(R.id.longt)
        sm = findViewById(R.id.sm)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val nomm = nom.text.toString()
            val numm = num.text.toString()
            val specText = spec.text.toString()
            val latText = lat.text.toString()
            val longtText = longt.text.toString()
            val smText = sm.text.toString()

            if (nomm.isNotEmpty() && numm.isNotEmpty() && specText.isNotEmpty() &&
                latText.isNotEmpty() && longtText.isNotEmpty() && smText.isNotEmpty()
            ) {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("nom", nomm)
                intent.putExtra("num", numm)
                intent.putExtra("spec", specText)
                intent.putExtra("lat", latText)
                intent.putExtra("longt", longtText)
                intent.putExtra("sm", smText)

                startActivity(intent)
            } else {
                Toast.makeText(this, "Tous les champs sont obligatoires.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}

