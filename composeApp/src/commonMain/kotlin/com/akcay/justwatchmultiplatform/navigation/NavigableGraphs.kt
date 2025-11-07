package com.akcay.justwatchmultiplatform.navigation

import kotlinx.serialization.Serializable

sealed class NavigableGraphs: Navigable {
    @Serializable
    data object Home: NavigableGraphs()
    @Serializable
    data object Login: NavigableGraphs()
}