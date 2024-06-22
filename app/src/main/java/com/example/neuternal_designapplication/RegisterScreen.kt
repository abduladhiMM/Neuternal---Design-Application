package com.example.neuternal_designapplication

import androidx.compose.foundation.Image
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

@Composable
fun RegisterScreen(navController: NavHostController) {
    var showDialog by remember { mutableStateOf(false) }

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
            val name = remember { mutableStateOf("") }
            val emailOrPhone = remember { mutableStateOf("") }
            val password = remember { mutableStateOf("") }
            val confirmPassword = remember { mutableStateOf("") }

            OutlinedTextField(
                value = name.value,
                onValueChange = { name.value = it },
                label = { Text(text = "Nama Lengkap") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )

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

            OutlinedTextField(
                value = confirmPassword.value,
                onValueChange = { confirmPassword.value = it },
                label = { Text(text = "Ulangi Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )

            // Deskripsi bawah
            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Dengan mengklik Daftar Akun, Anda setuju dengan semua Persyaratan Kami dan Privacy Policy",
                fontSize = 14.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Tombol Daftar Akun
            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { showDialog = true },
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

            // Tombol Kembali
            Button(
                onClick = { navController.popBackStack() }, // Navigasi kembali ke layar Login
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .height(48.dp)
            ) {
                Text(
                    text = "Kembali",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {showDialog = false},
            title = { Text("Konfirmasi") },
            text = { Text("Apakah Anda yakin dengan data yang dimasukkan?") },
            confirmButton = {
                Button(
                    onClick = { navController.navigate("login_screen") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD700)) // Warna kuning
                ) {
                    Text("Ya", color = Color.Black)
                }
            },
            dismissButton = {
                Button(
                    onClick = { showDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF005BBB)) // Warna biru
                ) {
                    Text("Tidak", color = Color.White)
                }
            }
        )
    }
}