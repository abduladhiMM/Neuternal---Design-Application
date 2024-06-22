package com.example.neuternal_designapplication


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun ForgotPasswordScreen(navController: NavHostController) {
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
            // Judul
            Text(
                text = "Lupa Password?",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = BlueGradient, // Sesuaikan warna teks sesuai dengan gambar
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Deskripsi
            Text(
                text = "Jangan takut, jangan panik.\nAkun Anda aman dalam database",
                fontSize = 16.sp,
                color = BlueGradient, // Sesuaikan warna teks sesuai dengan gambar
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(24.dp))

            // Gambar gembok
            Box(modifier = Modifier
                .fillMaxWidth()
//                .background(color = Color.Gray)
                .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                val lockImage: Painter = painterResource(id = R.drawable.teenyicons_password_solid) // Sesuaikan dengan resource gambar Anda
                Image(
                    painter = lockImage,
                    contentDescription = "Lock Image",
                    modifier = Modifier
                        .width(160.dp)
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            // Deskripsi bawah
            Text(
                text = "Masukkan No.Telp/Email Anda pada kolom dibawah",
                fontSize = 14.sp,
                color = Color(0xFF003366), // Sesuaikan warna teks sesuai dengan gambar
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(16.dp))

            // Input Field
            val emailOrPhone = remember { mutableStateOf("") }
            OutlinedTextField(
                value = emailOrPhone.value,
                onValueChange = { emailOrPhone.value = it },
                label = { Text(text = "No. Telp/Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )

            // Spacer untuk jarak
            Spacer(modifier = Modifier.height(20.dp))

            // Tombol Kirim
            Button(
                onClick = { navController.navigate("otp_verification") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD700)), // Warna kuning
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
                    .height(48.dp)
            ) {
                Text(
                    text = "Kirim",
                    color = Color(0xFF003366), // Sesuaikan warna teks sesuai dengan gambar
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}