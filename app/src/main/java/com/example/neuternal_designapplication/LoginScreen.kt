package com.example.neuternal_designapplication

import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.neuternal_designapplication.ui.theme.BlueGradient

@Composable
fun LoginScreen(navController: NavHostController) {
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

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(16.dp))

            // Input Fields
            val emailOrPhone = remember { mutableStateOf("") }
            val password = remember { mutableStateOf("") }

            OutlinedTextField(
                value = emailOrPhone.value,
                onValueChange = { emailOrPhone.value = it },
                label = { Text(text = "No. Telp/Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )

            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text(text = "Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )

            // Link Lupa Password
            Text(
                text = "Lupa password?",
                fontSize = 14.sp,
                color = BlueGradient,
                textAlign = TextAlign.Right,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable { navController.navigate("forgot_password")  }
            )

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(30.dp))

            // Tombol Masuk
            Button(
                onClick = { navController.navigate("dashboard_fix")  },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF005BBB)), // Warna biru
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .height(48.dp)
                    .clickable { navController.navigate("dashboard_fix")  }
            ) {
                Text(
                    text = "Masuk",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // Link Daftar Akun
            Text(
                text = "Belum punya Akun? Daftar disini",
                fontSize = 14.sp,
                color = BlueGradient,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable { navController.navigate("register_screen") }
            )
        }
    }
}
