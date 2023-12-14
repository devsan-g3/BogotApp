package com.example.bogotapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Plaza de Bolívar", "plazabolivar", "La Plaza de Bolívar, en el corazón de Bogotá, fusiona historia, política y la esencia de la ciudad, rodeada de imponentes edificios gubernamentales."),
                Sitio("Museo del oro", "museo_oro", "Sumérgete en la historia precolombina en el Museo del Oro, donde resplandecen las riquezas culturales indígenas a través de joyas y artefactos que narran la destreza artística de antiguas civilizaciones."),
                Sitio("Jardín  Botánico", "jardinb", "El Jardín Botánico de Bogotá, un santuario natural en la ciudad, invita a explorar la diversidad de la flora colombiana, ofreciendo un respiro necesario en medio del ajetreo urbano."),
                Sitio("Museo Nacional", "museo_nal", "El Museo Nacional guarda la memoria colombiana, exhibiendo artefactos desde los orígenes hasta el arte contemporáneo. Cada sala cuenta una parte crucial de la historia, proporcionando una experiencia educativa e inspiradora."),
            )
        )
    }
}



