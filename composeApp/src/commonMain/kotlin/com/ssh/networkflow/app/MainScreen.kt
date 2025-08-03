package com.ssh.networkflow.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.ssh.networkflow.platform.ui.componenets.EDButton
import networkflow.composeapp.generated.resources.Res
import networkflow.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
internal fun MainScreen() = MaterialTheme(
    colorScheme = lightColorScheme(
        primary = Color(color = 0xFF0050C8),
        background = Color(color = 0xFFF4F6F7),
        surface = White
    )
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize().background(color = colorScheme.background),
        contentPadding = WindowInsets.systemBars.asPaddingValues()
    ) {

        items(count = 12) {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minHeight = 100.dp)
                    .padding(horizontal = 24.dp, vertical = 12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorScheme.surface
                )
            ) {

                EDButton(
                    modifier = Modifier.fillMaxWidth().padding(all = 12.dp),
                    onClick = {

                    },
                    text = "Hello platform button"
                )
            }

        }
    }
}


@Preview
@Composable
private fun TextToolbarElement() {

    Row(
        modifier = Modifier
            .padding(all = 24.dp)
            .background(color = White, shape = RoundedCornerShape(size = 12.dp))
            .padding(horizontal = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 12.dp)
    ) {
        repeat(4) {

            Image(
                modifier = Modifier.size(size = 24.dp),
                painter = painterResource(resource = Res.drawable.compose_multiplatform),
                contentDescription = null
            )
        }
    }
}