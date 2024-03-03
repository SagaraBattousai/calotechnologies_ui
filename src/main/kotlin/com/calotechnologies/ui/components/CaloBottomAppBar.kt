package com.calotechnologies.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.calotechnologies.ui.theme.CaloTechnologiesTheme

//This and CaloTopAppBar are not really all that useful but they remove some boilerplate


@Composable
fun CaloBottomAppBar(
    modifier: Modifier = Modifier,
    actions: @Composable() (RowScope.() -> Unit) = {},
    floatingActionButton: @Composable() (() -> Unit)? = null
) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
        actions = actions,
//TODO: Possibly add defaults for this (Colour wise)
        floatingActionButton = floatingActionButton
    )
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Preview(
    name = "Light Mode"
)
@Composable
private fun Preview() {
    CaloTechnologiesTheme {
        CaloBottomAppBar(
            actions={
                IconButton(onClick = { /* do something */ }) {
                    Icon(Icons.Filled.Check, contentDescription = "Localized description")
                }
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {},
                    containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Icon(Icons.AutoMirrored.Filled.Send, contentDescription = "Localized description")
                }
            }
        )
    }
}

