package com.akcay.justwatchmultiplatform.navigation

import kotlinx.serialization.Serializable

interface Navigable

@Serializable data object PreviousScreen : Navigable