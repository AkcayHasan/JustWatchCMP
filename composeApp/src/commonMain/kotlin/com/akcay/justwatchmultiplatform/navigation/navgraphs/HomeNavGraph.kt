package com.akcay.justwatchmultiplatform.navigation.navgraphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.akcay.justwatchmultiplatform.navigation.NavigableGraphs
import com.akcay.justwatchmultiplatform.navigation.NavigableRoutes
import com.akcay.justwatchmultiplatform.navigation.OnNavigateTo
import com.akcay.justwatchmultiplatform.screens.home.movies.MoviesScreen
import com.akcay.justwatchmultiplatform.screens.home.profile.ProfileScreen

fun NavGraphBuilder.homeScreenNavGraph(
    onNavigateTo: OnNavigateTo,
    navController: NavController,
) {
    navigation<NavigableGraphs.Home>(
        startDestination = NavigableRoutes.Home.MoviesScreen
    ) {
        composable<NavigableRoutes.Home.MoviesScreen> {
            MoviesScreen()
        }
        composable<NavigableRoutes.Home.SearchScreen> {

        }
        composable<NavigableRoutes.Home.ProfileScreen> {
            ProfileScreen()
        }
    }
}