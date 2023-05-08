package com.example.acpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acpokemon.databinding.ActivityPesquisarPokemonBinding

class pesquisar_pokemon : AppCompatActivity() {

    private lateinit var binding: ActivityPesquisarPokemonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPesquisarPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarDados()
        binding.btnEnviarPokemon.setOnClickListener{ enviarPokemon()}
    }

    private fun recuperarDados(){
        val nome = intent.getStringExtra("nome")
        binding.textViewNome.setText(nome)
    }

    private fun enviarPokemon() {
        val nome = binding.edtPokemonDigitado.text.toString()
        if (nome == "Charmander" || nome == "Squirtle" || nome == "Bulbasaur") {
            val intent = Intent(this, dados_pokemon::class.java)
            intent.putExtra("nome", nome)
            startActivity(intent)
        }
        else{
            val intent = Intent(this, pesquisar_pokemon::class.java)
        }
    }
}