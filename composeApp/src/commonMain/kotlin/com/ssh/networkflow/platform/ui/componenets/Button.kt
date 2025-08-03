package com.ssh.networkflow.platform.ui.componenets

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Composable
internal expect fun PlatformButton(
    modifier: Modifier,
    onClick: () -> Unit,
    shape: Shape,
    content: @Composable RowScope.() -> Unit
)

@Composable
internal fun EDButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    shape: Shape = RoundedCornerShape(size = 12.dp),
    text: String
) {

    PlatformButton(modifier = modifier, shape = shape, onClick = onClick) {
        ButtonText(text = text)
    }
}