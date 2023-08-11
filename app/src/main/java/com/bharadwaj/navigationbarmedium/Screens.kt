package com.bharadwaj.navigationbarmedium

sealed class Screens(val route : String) {
    object Home : Screens("home_screen")
    object Search : Screens("search_screen")
    object Profile : Screens("profile_screen")
}