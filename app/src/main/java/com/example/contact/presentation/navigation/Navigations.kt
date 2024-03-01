package com.example.contact.presentation.navigation

sealed class Navigations (val route:String){
    object Home:Navigations(route = "home")
    object AddContact:Navigations(route = "addContact")
}