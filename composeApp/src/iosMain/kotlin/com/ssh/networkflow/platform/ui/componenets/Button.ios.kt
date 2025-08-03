package com.ssh.networkflow.platform.ui.componenets

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

@Composable
internal actual fun PlatformButton(
    modifier: Modifier,
    onClick: () -> Unit,
    shape: Shape,
    content: @Composable RowScope.() -> Unit
) {

    TextButton(modifier = modifier, onClick = onClick, shape = shape, content = content)
}