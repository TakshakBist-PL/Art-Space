package com.example.artspace.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ImageBox(
    painter: Painter,
    imageDescription: String,
    modifier: Modifier = Modifier) {
    Box(modifier = modifier.padding(20.dp)){
        Image(painter = painter, contentDescription = imageDescription)
    }
}