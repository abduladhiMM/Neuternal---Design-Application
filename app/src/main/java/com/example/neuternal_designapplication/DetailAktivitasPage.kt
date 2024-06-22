package com.example.neuternal_designapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.textFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.neuternal_designapplication.ui.theme.BlueGradient
import com.example.neuternal_designapplication.ui.theme.NeuternalDesignApplicationTheme

// Page 2 - Detail Jalan
@Composable
fun HalamanUtama(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Atas(navController)
        Spacer(modifier = Modifier.height(16.dp))
        Description()
        Spacer(modifier = Modifier.height(16.dp))
        ActivitySessions()
        Spacer(modifier = Modifier.height(4.dp))
        StartButton()
        NavbarBawah(navController = navController)
    }
}

@Composable
fun Atas(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
//                .background(color = Color.Yellow)
    ) {
        Image(
            painter = painterResource(id = R.drawable.navbar_v2),
            contentDescription = null,
            modifier = Modifier,
            contentScale = ContentScale.FillWidth
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (0).dp, y = (40).dp)
                .height(60.dp)
//                .background(color = Color.Black)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .width(55.dp)
                        .height(55.dp)
                        .offset(x = (5).dp, y = (0).dp)
//                            .background(color = Color.Gray)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.back_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .offset(x = (15).dp, y = (0).dp)
                            .width(55.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Button(
                        modifier = Modifier
                            .height(46.dp)
                            .width(46.dp)
                            .offset(x = (15).dp, y = (0).dp),
                        shape = RoundedCornerShape(30.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = BlueGradient
                        ),
                        onClick = {navController.navigate("activitas_page")}
                    ) {
                    }
                }
            }
        }
    }
}

@Composable
fun Description() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(315.dp)
            .offset(x = (0).dp, y = (-15).dp)
//                .background(color = Color.Gray)
    ) {
        Column {
            Text(
                text = "Jalan Kaki",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                color = BlueGradient,
                modifier = Modifier
                    .offset(x = (20).dp, y = (0).dp),
                textAlign = TextAlign.Center
            )

            Text(
                text = "Rekomendasi Aktivitas | Jalan Kaki",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = BlueGradient,
                modifier = Modifier
                    .offset(x = (20).dp, y = (0).dp),
                textAlign = TextAlign.Center
            )

            Image(
                painter = painterResource(id = R.drawable.bg_deskripsi),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = (-6).dp, y = (20).dp)
                    .width(440.dp),
                contentScale = ContentScale.FillWidth
            )
        }

        Box(
            modifier = Modifier
                .width(408.dp)
                .height(190.dp)
                .offset(x = (0).dp, y = (70).dp)
//                    .background(color = Color.Gray)
        ) {
            Row {
                Column {
                    Text(
                        text = "Deskripsi Aktivitas",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = BlueGradient,
                        modifier = Modifier
                            .offset(x = (20).dp, y = (15).dp),
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Salah satu aktivitas harian yang dianjurkan oleh ahli kepada para penderita Alzheimer maupun demensia.\n" +
                                "\n" +
                                "Dengan melakukannya setiap hari, dengan rentang waktu min. 10 menit hingga max. 30 menit, dengan setiap sesinya sekitar 10 - 15 menit.",
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp,
                        color = BlueGradient,
                        modifier = Modifier
                            .offset(x = (20).dp, y = (28).dp)
                            .width(380.dp),
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .width(90.dp)
                .height(90.dp)
                .offset(x = (305).dp, y = (0).dp)
//                    .background(color = Color.Green)
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_1_v2),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = (0).dp, y = (0).dp)
                    .width(90.dp),
                contentScale = ContentScale.FillWidth
            )
        }
    }
}

@Composable
fun ActivitySessions() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)
            .offset(x = (0).dp, y = (0).dp)
//            .background(color = Color.Gray)
    ) {
        Box(
            modifier = Modifier
                .width(520.dp)
                .height(344.dp)
                .offset(x = (0).dp, y = (0).dp)
//                .background(color = Color.Green)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_deskripsi_2),
                contentDescription = null,
                modifier = Modifier
                    .offset(x = (-6).dp, y = (0).dp)
                    .width(520.dp),
                contentScale = ContentScale.FillWidth
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(344.dp)
                .offset(x = (0).dp, y = (-35).dp)
//                .background(color = Color.Green)
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(35.dp)
//                        .background(color = Color.Black)
                ) {
                    Text(
                        text = "Mari Aktivitas",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = BlueGradient,
                        modifier = Modifier
                            .offset(x = (20).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(344.dp)
//                        .background(
//                            color = Color(0xFFFFC107))
//                            shape = RoundedCornerShape(12.dp))
                        .padding(start = 22.dp, end = 30.dp)
                ) {

                    Column {
                        Row {
                            ActivitySessionCard2(
                                "Sesi 1 1",
                                "Sesi",
                                "1"
                            )
                            Spacer(modifier = Modifier.width(12.dp))

                            ActivitySessionCard(
                                "Sesi 1",
                                com.example.neuternal_designapplication.R.drawable.walking_man_a4nzeibmjk,
                                "Jalan Kaki",
                                "10.00"
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))

                        Row {
                            ActivitySessionCard2(
                                "Sesi 1 1",
                                "Sesi",
                                "2"
                            )
                            Spacer(modifier = Modifier.width(12.dp))

                            ActivitySessionCard(
                                "Sesi 1",
                                com.example.neuternal_designapplication.R.drawable.walking_man_a4nzeibmjk,
                                "Jalan Kaki",
                                "10.00"
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))

                        Row {
                            ActivitySessionCard2(
                                "Sesi 1 1",
                                "Sesi",
                                "3"
                            )
                            Spacer(modifier = Modifier.width(12.dp))

                            ActivitySessionCard(
                                "Sesi 1",
                                com.example.neuternal_designapplication.R.drawable.walking_man_a4nzeibmjk,
                                "Jalan Kaki",
                                "10.00"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ActivitySessionCard(session: String, iconRes: Int, title: String, time: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier.size(45.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF204194)
                )
                Text(
                    text = time,
                    fontSize = 14.sp,
                    color = Color(0xFF204194)
                )
            }
        }
    }
}

@Composable
fun ActivitySessionCard2(session: String, sesi: String, title: String) {
    Box(
        modifier = Modifier
            .width(70.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(
                    topStart = 12.dp,
                    topEnd = 12.dp,
                    bottomStart = 34.dp,
                    bottomEnd = 12.dp
                )
            )
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = sesi,
                fontSize = 14.sp,
                color = Color(0xFF204194)
            )

            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF204194)
            )
        }
    }
}

@Composable
fun StartButton() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(84.dp)
            .offset(x = (0).dp, y = (0).dp)
//            .background(color = Color.Gray)
            .padding(start = 22.dp, end = 29.dp)
    ) {
        Button(
            onClick = { /* TODO: Handle start button click */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF0D47A1),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = "Mulai",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

