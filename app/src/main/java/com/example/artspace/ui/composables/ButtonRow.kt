package com.example.artspace.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonRow(
    onNextClickValue: () -> Unit,
    onPreviousClickValue: ()-> Unit,
    modifier: Modifier = Modifier) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            text = "Previous",
            onClickValue = onPreviousClickValue,
            modifier = Modifier.weight(1f)
        )
        Button(
            text = "Next",
            onClickValue = onNextClickValue,
            modifier = Modifier.weight(1f)
        )
    }
}