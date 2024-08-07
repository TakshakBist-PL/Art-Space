package com.example.artspace.ui.composables

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Button(
    text: String,
    onClickValue: () -> Unit,
    modifier: Modifier = Modifier) {

    Button(onClick = onClickValue) {
        Text(text = text)
    }
}