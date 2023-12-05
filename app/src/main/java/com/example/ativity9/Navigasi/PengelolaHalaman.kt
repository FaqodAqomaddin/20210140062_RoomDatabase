package com.example.ativity9.Navigasi

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SiswaApp(navHostController: NavHostController = rememberNavController()){
    HostNavigasi(navHostController = navHostController)
}