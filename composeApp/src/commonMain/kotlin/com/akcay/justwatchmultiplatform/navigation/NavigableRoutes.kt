package com.akcay.justwatchmultiplatform.navigation

import androidx.navigation.NavOptionsBuilder
import kotlinx.serialization.Serializable

typealias OnNavigateTo = (Navigable, NavOptionsBuilder.() -> Unit) -> Unit

sealed class NavigableRoutes : Navigable {
    sealed class Home : NavigableRoutes() {
        @Serializable
        data object MoviesScreen : Home()
        @Serializable
        data object SearchScreen : Home()
        @Serializable
        data object ProfileScreen : Home()
    }

    sealed class Login : NavigableRoutes() {
        @Serializable
        data object LoginScreen : Home()
        @Serializable
        data object RegisterScreen : Home()
        @Serializable
        data object ForgotPassword : Home()
    }

    @Serializable
    data class MovieDetailScreen(val id: String) : NavigableRoutes()
}