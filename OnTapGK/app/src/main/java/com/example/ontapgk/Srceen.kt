package com.example.simplenavigation

sealed class Screen(val route:String) {
    object Home:Screen(route = "Home_screen")
    object Register:Screen(route = "Register_screen")
}