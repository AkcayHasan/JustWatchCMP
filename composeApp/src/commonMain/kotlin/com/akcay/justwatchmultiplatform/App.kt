package com.akcay.justwatchmultiplatform

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.akcay.justwatchmultiplatform.navigation.Navigable
import com.akcay.justwatchmultiplatform.navigation.NavigableGraphs
import com.akcay.justwatchmultiplatform.navigation.NavigableRoutes
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        JustWatchNavigation(startDestination = NavigableGraphs.Home)
    }
}