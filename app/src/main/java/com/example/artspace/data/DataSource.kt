package com.example.artspace.data

import com.example.artspace.R
import com.example.artspace.model.ArtworkModel

object DataSource {
    fun getArtworkModel(): List<ArtworkModel> {
        return listOf(
            ArtworkModel(R.drawable.bridge, R.string.description_bridge, R.string.artist_bridge, R.string.title_bridge, R.string.date_bridge),
            ArtworkModel(R.drawable.city, R.string.description_city, R.string.artist_city, R.string.title_city, R.string.date_city),
            ArtworkModel(R.drawable.deer, R.string.description_deer, R.string.artist_deer, R.string.title_deer, R.string.date_deer),
            ArtworkModel(R.drawable.fog, R.string.description_fog, R.string.artist_fog, R.string.title_fog, R.string.date_fog),
            ArtworkModel(R.drawable.forest, R.string.description_forest, R.string.artist_forest, R.string.title_forest, R.string.date_forest),
            ArtworkModel(R.drawable.harbour, R.string.description_harbour, R.string.artist_harbour, R.string.title_harbour, R.string.date_harbour),
            ArtworkModel(R.drawable.jungle, R.string.description_jungle, R.string.artist_jungle, R.string.title_jungle, R.string.date_jungle),
            ArtworkModel(R.drawable.library, R.string.description_library, R.string.artist_library, R.string.title_library, R.string.date_library),
            ArtworkModel(R.drawable.skyscraper, R.string.description_skyscraper, R.string.artist_skyscraper, R.string.title_skyscraper, R.string.date_skyscraper),
            ArtworkModel(R.drawable.windows, R.string.description_windows, R.string.artist_windows, R.string.title_windows, R.string.date_windows)
        )
    }
}