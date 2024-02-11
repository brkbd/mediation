package com.example.mediation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mediation.ui.theme.background_color
import com.example.mediation.ui.theme.icon_dark_color

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SettingScreen(modifier: Modifier = Modifier, backToHome: () -> Unit) {
    Surface(modifier = modifier.fillMaxSize(), color = background_color) {
        Scaffold(
            topBar = { TopBackHandlerBar(backToHome = backToHome) },
            bottomBar = { BottomNavigationBar() },
            containerColor = Color.Transparent
        ) {
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBackHandlerBar(modifier: Modifier = Modifier, backToHome: () -> Unit) {
    TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
        containerColor = Color.Transparent,
        titleContentColor = Color.Transparent
    ), title = { Text(text = "") },
        navigationIcon = {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = backToHome ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = com.example.mediation.R.drawable.arrowback_icon),
                        contentDescription = "",
                        tint = icon_dark_color
                    )
                }
                Text(
                    text = "设定",
                    color = icon_dark_color,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = modifier.offset(x = (-4).dp)
                )
            }
        }
    )
}