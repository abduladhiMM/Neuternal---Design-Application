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


@Composable
fun AktivitasPage(navController: NavController, modifier: Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        Recommendations(navController)
        ActivityHistory()
        Spacer(modifier = Modifier.height(16.dp))
        OtherActivities()
        NavbarBawah(navController = navController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header() {
    // ===================================  Navbar Atas  ===================================
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(210.dp)
//                .background(color = Color.Yellow)
    ) {
        Image(
            painter = painterResource(id = com.example.neuternal_designapplication.R.drawable.navbar_2),
            contentDescription = null,
            modifier = Modifier,
            contentScale = ContentScale.FillWidth
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = (0).dp, y = (40).dp)
                .height(160.dp)
//                .background(color = Color.Black)
        ) {
            Row {
                Image(
                    painter = painterResource(id = com.example.neuternal_designapplication.R.drawable.profil_navbar_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(x = (28).dp, y = (0).dp)
                        .width(50.dp),
                    contentScale = ContentScale.FillWidth
                )

                val annotatedString = buildAnnotatedString {
                    pushStyle(SpanStyle(fontWeight = FontWeight.Bold))
                    append("Hi, Msbree")
                }

                Column {

                    Text(
                        text = annotatedString,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier
                            .offset(x = (50).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = "Selamat Pagi",
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp,
                        color = Color.White,
                        modifier = Modifier
                            .offset(x = (50).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )

                    var text by rememberSaveable { mutableStateOf("") }
                    TextField(
                        value = "Cari Diskusi, Riwayat Diskusi, ...   ", onValueChange = {},
                        trailingIcon = {
                            Image(
                                painter = painterResource(id = com.example.neuternal_designapplication.R.drawable.search_icon),
                                contentDescription = null,
                                modifier = Modifier
                                    .offset(x = (-5).dp, y = (0).dp)
                                    .width(35.dp)
                                    .padding(end = 6.dp)
                            )
                        },

                        colors = TextFieldDefaults.textFieldColors(
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black,
                        ),

                        modifier = Modifier
                            .padding(top = 25.dp)
                            .padding(start = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(color = Color.White),

//                            placeholder = {
//                                Text("Cari Diskusi, Riwayat Diskusi, ...   ")
//                            }

                    )
                }

                Image(
                    painter = painterResource(id = com.example.neuternal_designapplication.R.drawable.notif_icon),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(x = (-2).dp, y = (2).dp)
                        .width(40.dp),
                    contentScale = ContentScale.FillWidth
                )
            }
        }
    }
}


@Composable
fun Recommendations(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .padding(top = 5.dp)
    ) {
        Text(
            text = "Berdasarkan Topik",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = BlueGradient,
            modifier = Modifier
                .offset(x = (8).dp, y = (0).dp),
            textAlign = TextAlign.Center
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = BlueGradient)
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                RecommendationItem("Jalan Kaki", com.example.neuternal_designapplication.R.drawable.tabler_walk) { navController.navigate("halaman_utama") }
                RecommendationItem("Yoga", com.example.neuternal_designapplication.R.drawable.tabler_yoga)
                RecommendationItem("Senam", com.example.neuternal_designapplication.R.drawable.iconoir_yoga)
                RecommendationItem("Tai Chi", com.example.neuternal_designapplication.R.drawable.grommet_icons_yoga)
            }
        }
    }
}

@Composable
fun RecommendationItem(activity: String, imageRes: Int, onClick: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFFFFD740), Color(0xFFFFAB00))
                )
            )
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_icon),
            contentDescription = null,
            modifier = Modifier.size(80.dp)
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(activity, color = BlueGradient, textAlign = TextAlign.Center, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ActivityHistory() {
    Spacer(modifier = Modifier.height(10.dp))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
//            .background(color = Color.Green)
    ) {
        Text(
            text = "Riwayat Aktivitas",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = BlueGradient,
            modifier = Modifier
                .offset(x = (8).dp, y = (0).dp)
                .padding(bottom = 8.dp),
            textAlign = TextAlign.Center
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Image(
                painter = painterResource(id = com.example.neuternal_designapplication.R.drawable.riwayat_aktivitas),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp) // Adjust the height as needed
            )
        }
        Text(
            text = "Lebih lengkap >",
            color = BlueGradient,
            fontSize = 15.sp, // Adjust the size to be more appropriate
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(Alignment.CenterHorizontally) // Align text to the end of the parent
        )
    }
}


@Composable
fun OtherActivityItem(activity: String, imageRes: Int) {
    Box(
        modifier = Modifier
            .width(190.dp)
            .height(126.5.dp)
//            .background(color = Color.Green)
            .clip(RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = com.example.neuternal_designapplication.R.drawable.bg_aktivitas_lain),
            contentDescription = null,
            modifier = Modifier
                .offset(x = (-2).dp, y = (2).dp)
                .width(200.dp),
            contentScale = ContentScale.FillWidth
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(70.dp) // Adjust the size as needed
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(activity, color = Color(0xFF204194), fontWeight = FontWeight.SemiBold)
        }
    }
}

@Composable
fun OtherActivities() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, bottom = 16.dp)
//            .background(color = Color.Green)
    ) {
        Text(
            text = "Aktivitas Lain",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = BlueGradient,
            modifier = Modifier
                .offset(x = (0).dp, y = (0).dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OtherActivityItem("Permainan", com.example.neuternal_designapplication.R.drawable.playgames)
//            Spacer(modifier = Modifier .width())
            OtherActivityItem("Player Musik", com.example.neuternal_designapplication.R.drawable.majesticons_music_line)
        }

        Spacer(modifier = Modifier.height(28.5.dp))
    }
}

@Composable
fun NavbarBawah(navController: NavController) {
    // ===================================  Navbar Menu ===================================
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(Alignment.Top)
            .offset(x = (0).dp, y = (0).dp)
            .background(color = Color.Black)
    ) {
        Box(
            modifier = Modifier
                .width(448.dp)
                .wrapContentHeight(Alignment.Top)
                .offset(x = (0).dp, y = (1).dp)
                .background(color = Color.Gray)
                .clip(RoundedCornerShape(0.dp))
        ) {
//            Image(
//                painter = painterResource(id = R.drawable.bg_bar),
//                contentDescription = null,
//                modifier = modifier
//                    .offset(x = (0).dp, y = (0).dp)
//                    .fillMaxWidth()
//                    .height(IntrinsicSize.Max),
//                contentScale = ContentScale.Crop
//                )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .offset(x = (0).dp, y = (2).dp)
//                .background(color = Color.Blue)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Button(
                        modifier = Modifier
                            .height(100.dp)
                            .width(112.dp),
                        shape = RoundedCornerShape(topStart = 10.dp, topEnd = 0.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = BlueGradient
                        ),
                        onClick = {navController.navigate("dashboard_fix")}
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.beranda_icon),
                                contentDescription = "Home Icon",
                                modifier = Modifier.size(37.dp)
                            )
//                            Spacer(modifier = Modifier.height(1.5.dp)) // Add spacing between icon and text
                            Text(text = "Beranda")
                        }
                    }

                    Button(
                        modifier = Modifier
                            .height(95.dp)
                            .width(112.dp),
                        shape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = BlueGradient
                        ),
                        onClick = {navController.navigate("activitas_page")}

                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.aktivitas___active_icon),
                                contentDescription = "Aktivitas Icon",
                                modifier = Modifier.size(31.dp),
                                tint = Color.Unspecified
                            )
//                            Spacer(modifier = Modifier.height(3.dp)) // Add spacing between icon and text
                            Text(text = "Aktivitas", modifier = Modifier.offset(y = (2.5).dp))
                        }
                    }

                    Button(
                        modifier = Modifier
                            .height(100.dp)
                            .width(112.dp),
                        shape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = BlueGradient,
                        ),
                        onClick = {navController.navigate("forum_page1")}

                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.forum_icon),
                                contentDescription = "Home Forum",
                                modifier = Modifier
                                    .size(35.dp)
                                    .offset(x = (0).dp, y = (-4.5).dp),
                                tint = Color.Unspecified
                            )
//                            Spacer(modifier = Modifier.height(0.dp)) // Add spacing between icon and text
                            Text(text = "Forum", modifier = Modifier.offset(y = (1).dp))
                        }
                    }

                    Button(
                        modifier = Modifier
                            .height(100.dp)
                            .width(112.dp),
                        shape = RoundedCornerShape(topStart = 0.dp, topEnd = 10.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = BlueGradient
                        ),
                        onClick = {navController.navigate("profil")}
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally // Center content horizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.profil_icon),
                                contentDescription = "Home Profil",
                                modifier = Modifier
                                    .size(37.dp)
                                    .offset(y = (-3.5).dp)
                            )
//                            Spacer(modifier = Modifier.height(2.dp)) // Add spacing between icon and text
                            Text(text = "Profil")
                        }
                    }
                }
            }
        }
    }
}


