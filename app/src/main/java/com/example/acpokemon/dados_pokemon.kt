package com.example.acpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acpokemon.databinding.ActivityDadosPokemonBinding

class dados_pokemon : AppCompatActivity() {

    private lateinit var binding: ActivityDadosPokemonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recuperarDadosPokemon()
        binding.buttonVoltar.setOnClickListener{voltar()}
    }

    private fun recuperarDadosPokemon(){
        val nome = intent.getStringExtra("nome")
        binding.textViewRNomePokemon.setText(nome)
        if (nome == "Charmander"){
            binding.textViewRTipo.setText("Fogo")
            binding.textViewRHabilidade.setText("Blaze")


        }
        else if (nome == "Squirtle"){
            binding.textViewRTipo.setText("Agua")
            binding.textViewRHabilidade.setText("Torrent")
            binding.imageViewFotoPokemon.setImageResource(R.drawable.agua)
        }
        else if (nome == "Bulbasaur"){
            binding.textViewRTipo.setText("Planta")
            binding.textViewRHabilidade.setText("Overgrow")
            binding.imageViewFotoPokemon.setImageResource(R.drawable.planta)
        }
    }

    private fun voltar(){
        val voltar = Intent(this, pesquisar_pokemon::class.java)
        startActivity(voltar)
    }
}
