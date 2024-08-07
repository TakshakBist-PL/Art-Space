package com.example.artspace.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.unit.dp
import com.example.artspace.R

@Composable
fun ArtSpace(modifier: Modifier = Modifier) {

    val artistNameList = stringArrayResource(id = R.array.artist_names)
    val titleNameList = stringArrayResource(id = R.array.title_names)
    val dateList = stringArrayResource(id = R.array.dates)
    val descriptionList = stringArrayResource(id = R.array.descriptions)

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
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        ImageBox(
            painter = imageList[indexStateVariable],
            imageDescription = descriptionList[indexStateVariable],
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(50.dp))

        ArtworkColumn(
            artworkTitle = titleNameList[indexStateVariable],
            artistName = artistNameList[indexStateVariable],
            date = dateList[indexStateVariable],
            modifier = Modifier.padding(vertical = 16.dp)
        )


        ButtonRow(
            onNextClickValue = {
                indexStateVariable = (indexStateVariable + 1) % imageList.size
            },
            onPreviousClickValue = {
                indexStateVariable = if (indexStateVariable > 0) {
                    indexStateVariable - 1
                } else {
                    imageList.size - 1
                }
            }
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}