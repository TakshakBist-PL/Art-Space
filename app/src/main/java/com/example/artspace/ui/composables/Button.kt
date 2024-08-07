package com.example.artspace.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Button(
    text: String,
    onClickValue: () -> Unit,
    modifier: Modifier = Modifier) {

    Button(
        onClick = onClickValue,
        modifier = modifier.padding(16.dp)
    ) {
        Text(text = text)
    }
}