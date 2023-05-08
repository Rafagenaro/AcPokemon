package com.example.acpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acpokemon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener{ enviar()}
    }

    private fun enviar(){
        val nome = binding.edtNomeDigitado.text.toString()
        val intent = Intent(this, pesquisar_pokemon::class.java)
        intent.putExtra("nome", nome)
        startActivity(intent)
    }
}