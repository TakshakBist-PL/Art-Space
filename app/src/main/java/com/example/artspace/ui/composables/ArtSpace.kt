package com.example.artspace.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.artspace.R

@Composable
fun ArtSpace(modifier: Modifier = Modifier) {

    val artistNameList = listOf(
        stringResource(id = R.string.artist_bridge),
        stringResource(id = R.string.artist_city),
        stringResource(id = R.string.artist_deer),
        stringResource(id = R.string.artist_fog),
        stringResource(id = R.string.artist_forest),
        stringResource(id = R.string.artist_harbour),
        stringResource(id = R.string.artist_jungle),
        stringResource(id = R.string.artist_library),
        stringResource(id = R.string.artist_skyscraper),
        stringResource(id = R.string.artist_windows)
    ).toTypedArray()

    val titleNameList = listOf(
        stringResource(id = R.string.title_bridge),
        stringResource(id = R.string.title_city),
        stringResource(id = R.string.title_deer),
        stringResource(id = R.string.title_fog),
        stringResource(id = R.string.title_forest),
        stringResource(id = R.string.title_harbour),
        stringResource(id = R.string.title_jungle),
        stringResource(id = R.string.title_library),
        stringResource(id = R.string.title_skyscraper),
        stringResource(id = R.string.title_windows)
    ).toTypedArray()

    val dateList = listOf(
        stringResource(id = R.string.date_bridge),
        stringResource(id = R.string.date_city),
        stringResource(id = R.string.date_deer),
        stringResource(id = R.string.date_fog),
        stringResource(id = R.string.date_forest),
        stringResource(id = R.string.date_harbour),
        stringResource(id = R.string.date_jungle),
        stringResource(id = R.string.date_library),
        stringResource(id = R.string.date_skyscraper),
        stringResource(id = R.string.date_windows)
    ).toTypedArray()

    val descriptionList = listOf(
        stringResource(id = R.string.description_bridge),
        stringResource(id = R.string.description_city),
        stringResource(id = R.string.description_deer),
        stringResource(id = R.string.description_fog),
        stringResource(id = R.string.description_forest),
        stringResource(id = R.string.description_harbour),
        stringResource(id = R.string.description_jungle),
        stringResource(id = R.string.description_library),
        stringResource(id = R.string.description_skyscraper),
        stringResource(id = R.string.description_windows)
    ).toTypedArray()


    val imageList = listOf(
        painterResource(id = R.drawable.bridge),
        painterResource(id = R.drawable.city),
        painterResource(id = R.drawable.deer),
        painterResource(id = R.drawable.fog),
        painterResource(id = R.drawable.forest),
        painterResource(id = R.drawable.harbour),
        painterResource(id = R.drawable.jungle),
        painterResource(id = R.drawable.library),
        painterResource(id = R.drawable.skyscraper),
        painterResource(id = R.drawable.windows)
    ).toTypedArray()

    var indexStateVariable by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {

    }
}