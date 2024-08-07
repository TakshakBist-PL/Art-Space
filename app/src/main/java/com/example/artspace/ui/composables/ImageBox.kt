package com.example.artspace.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ImageBox(
    painter: Painter,
    imageDescription: String,
    modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .shadow(8.dp, shape = RoundedCornerShape(4.dp))
            .border(1.dp, Color.White, shape = RoundedCornerShape(4.dp))
            .background(Color.White, shape = RoundedCornerShape(4.dp))
            .padding(40.dp)
            .aspectRatio(0.75f),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painter,
            contentDescription = imageDescription,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}