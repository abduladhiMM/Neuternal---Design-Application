package com.example.neuternal_designapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neuternal_designapplication.ui.theme.BlueGradient
import com.example.neuternal_designapplication.ui.theme.NeuternalDesignApplicationTheme
import kotlinx.coroutines.delay

@Composable
fun BeginningScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo
            Box(modifier = Modifier
                .fillMaxWidth()
//                .background(color = Color.Gray)
                .height(100.dp),
                contentAlignment = Alignment.Center
            ) {
                val logo: Painter = painterResource(id = R.drawable.logo) // Sesuaikan dengan resource logo Anda
                Image(
                    painter = logo,
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(350.dp)
                )
            }

            Box(modifier = Modifier
                .fillMaxWidth()

//                .background(color = Color.Gray)
                .height(100.dp),
                contentAlignment = Alignment.Center
            ) {
                val logo: Painter = painterResource(id = R.drawable.bersama_melawan_lupa__merawat_dengan_penuh_cinta) // Sesuaikan dengan resource logo Anda
                Image(
                    painter = logo,
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(300.dp)
                        .offset(x = (0).dp, y = (-35).dp)
                )
            }

            // Deskripsi

            Text(
                text = "Pilih Daftar Akun untuk pertama kali menggunakan,\n" +
                        "Masuk untuk masuk kedalam akun Anda",
                fontSize = 13.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 100.dp, bottom = 8.dp)
            )

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(16.dp))

            // Tombol Daftar Akun
            Button(
                onClick = { navController.navigate("register_screen") }, // Navigasi ke layar Register
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF005BBB)), // Warna biru
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .height(48.dp)
            ) {
                Text(
                    text = "Daftar Akun",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(16.dp))

            // Tombol Masuk
            Button(
                onClick = { navController.navigate("login_screen") }, // Navigasi ke layar Login
                colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = BlueGradient),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .border(
                        width = 2.dp,
                        color = BlueGradient,
                        shape = RoundedCornerShape(24.dp),

                    )
            ) {
                Text(
                    text = "Masuk",
                    color = BlueGradient,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}