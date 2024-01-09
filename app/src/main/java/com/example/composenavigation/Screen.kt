package com.example.composenavigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Second: Screen("screen")
    object Last: Screen("last")
}