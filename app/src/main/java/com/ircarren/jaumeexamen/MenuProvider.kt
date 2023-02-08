package com.ircarren.jaumeexamen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

object MenuProvider
{
    val menuItems = listOf(
        MenuDataClass(
            "Home", Icons.Filled.Home
        ),
        MenuDataClass(
            "Portfolio", Icons.Filled.List
        )
    )
}

data class MenuDataClass(var name: String, var icon: ImageVector) {

}