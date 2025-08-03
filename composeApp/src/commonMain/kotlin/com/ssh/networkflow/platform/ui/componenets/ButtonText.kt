package com.ssh.networkflow.platform.ui.componenets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
internal fun ButtonText(text: String) = Text(
    text = text,
    style = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold,
    )
)