package com.example.contact.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.contact.presentation.ContactAdd
import com.example.contact.presentation.Home

@Composable
fun NavigationGraph (navHostController: NavHostController){
    NavHost(navController =navHostController , startDestination = Navigations.Home.route){
        composable(route=Navigations.Home.route){
            Home(navHostController=navHostController)

        }
        composable(route=Navigations.AddContact.route){
            ContactAdd(navHostController=navHostController)

        }




    }
}