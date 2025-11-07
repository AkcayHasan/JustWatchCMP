package com.akcay.justwatchmultiplatform.screens.home.movies

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Movies") })
        }
    ) {

    }
}

@Composable
fun MoviesScreenContent() {

}

@Composable
fun MoviesScreenPreview() {

}