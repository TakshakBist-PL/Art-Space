package com.example.artspace.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.artspace.R
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ArtworkColumn(
    artworkTitle: String,
    artistName: String,
    date: String,
    modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .background(colorResource(id = R.color.artwork_background))
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = artworkTitle,
            fontSize = 35.sp,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.Default
        )

        Spacer(modifier = modifier.height(2.dp))

        Text(
            text = buildAnnotatedString {

                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Bold
                    )
                ){
                    append(artistName)
                }
                append(" (")
                withStyle(
                    style = SpanStyle(
                        fontStyle = FontStyle.Italic
                    )
                ){
                    append(date)
                }

                append(")")
            }
        )
    }
}
