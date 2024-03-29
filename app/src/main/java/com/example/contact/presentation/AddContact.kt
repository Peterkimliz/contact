package com.example.contact.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.contact.presentation.common.AppBar

@Composable
fun ContactAdd(navHostController: NavHostController) {
    Scaffold(
        topBar = {
            AppBar(title = "Add Contact", showLeading = true,navHostController=navHostController)
        },
        floatingActionButton = {
            FloatingActionButton(
                shape = FloatingActionButtonDefaults.largeShape,
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                onClick = { }) {
                Icon(imageVector = Icons.Default.Check, contentDescription = "Add Contact")
            }
        }

    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(it)
        ) {

        }
    }

}