package com.example.projet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.insciption.*

class InscriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.insciption)

        inscrire_btn.setOnClickListener {

            if (num_sec_sociale_txt.text.toString().isEmpty() || nom_txt.text.toString().isEmpty()
                || prenom_txt.text.toString().isEmpty() || adresse_txt.text.toString().isEmpty()
                || tel_txt.text.toString().isEmpty()
            )
            {
                Toast.makeText(this, "Veuillez remplir tous les champs !", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, ConfirmPasswordActivity::class.java)
                startActivity(intent)
            }

        }
    }
}