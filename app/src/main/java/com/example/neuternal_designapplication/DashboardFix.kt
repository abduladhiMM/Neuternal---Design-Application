package com.example.neuternal_designapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.neuternal_designapplication.ui.theme.BlueGradient
import com.example.neuternal_designapplication.ui.theme.GrayWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardFix(navController: NavController, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // ===================================  Navbar Atas  ===================================
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(210.dp)
//                .background(color = Color.Yellow)
        ) {
            Image(
                painter = painterResource(id = R.drawable.navbar_2),
                contentDescription = null,
                modifier = modifier,
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
                        painter = painterResource(id = R.drawable.profil_navbar_icon),
                        contentDescription = null,
                        modifier = modifier
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
                            modifier = modifier
                                .offset(x = (50).dp, y = (0).dp),
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = "Selamat Pagi",
                            fontWeight = FontWeight.Medium,
                            fontSize = 13.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (50).dp, y = (0).dp),
                            textAlign = TextAlign.Center
                        )

                        var text by rememberSaveable { mutableStateOf("") }
                        TextField(
                            value = "Cari Diskusi, Riwayat Diskusi, ...   ", onValueChange = {},
                            trailingIcon = {
                                Image(
                                    painter = painterResource(id = R.drawable.search_icon),
                                    contentDescription = null,
                                    modifier = modifier
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
                        painter = painterResource(id = R.drawable.notif_icon),
                        contentDescription = null,
                        modifier = modifier
                            .offset(x = (-2).dp, y = (2).dp)
                            .width(40.dp),
                        contentScale = ContentScale.FillWidth
                    )
                }
            }
        }

        // ===================================  Isi  ===================================
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(150.dp)
                .offset(x = (0).dp, y = (-15).dp)
//                .background(color = Color.Green)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .offset(x = (20).dp, y = (0).dp)
                        .width(120.dp)
                        .height(120.dp)
//                .background(color = Color.Gray)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(y = (2).dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.icon_1_2),
                            contentDescription = null,
                            modifier = modifier
                                .width(95.dp),
//                            contentScale = ContentScale.FillWidth
                        )

                        Text(
                            text = "Chatbot",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = BlueGradient,
                            modifier = modifier
                                .offset(x = (0).dp, y = (-4).dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Button(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .offset(x = (0).dp, y = (0).dp),
                        shape = RoundedCornerShape(10.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = BlueGradient
                        ),
                        onClick = {navController.navigate("chatbot")}
                    ) {

                    }
                }

                Box(
                    modifier = Modifier
                        .offset(x = (45).dp, y = (0).dp)
                        .width(120.dp)
                        .height(120.dp)
//                .background(color = Color.Gray)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(y = (2).dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.icon_2_2),
                            contentDescription = null,
                            modifier = modifier
                                .width(95.dp),
//                            contentScale = ContentScale.FillWidth
                        )

                        Text(
                            text = "Konsultasi",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = BlueGradient,
                            modifier = modifier
                                .offset(x = (0).dp, y = (-4).dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Button(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .offset(x = (0).dp, y = (0).dp),
                        shape = RoundedCornerShape(10.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = BlueGradient
                        ),
                        onClick = {navController.navigate("consult")}
                    ) {
                    }
                }

                Box(
                    modifier = Modifier
                        .offset(x = (70).dp, y = (0).dp)
                        .width(120.dp)
                        .height(120.dp)
//                .background(color = Color.Gray)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(y = (2).dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.icon_3_2),
                            contentDescription = null,
                            modifier = modifier
                                .width(95.dp),
//                            contentScale = ContentScale.FillWidth
                        )

                        Text(
                            text = "Memo",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = BlueGradient,
                            modifier = modifier
                                .offset(x = (0).dp, y = (-4).dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Button(
                        modifier = Modifier
                            .height(120.dp)
                            .width(120.dp)
                            .offset(x = (0).dp, y = (0).dp),
                        shape = RoundedCornerShape(10.dp),
                        enabled = true,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Transparent,
                            contentColor = BlueGradient
                        ),
                        onClick = { }
                    ) {

                    }
                }
            }

        }

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(240.dp)
                .offset(x = (0).dp, y = (-2).dp)
//                .background(color = Color.Yellow)
        ){
            Column {
                Row {
                    Text(
                        text = "Jadwal Obat",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = BlueGradient,
                        modifier = modifier
                            .offset(x = (20).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )

                    Box(
                        modifier = modifier
                            .width(20.dp)
                            .height(20.dp)
                            .offset(x = (285).dp, y = (0).dp)
//                            .background(color = Color.Green)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.right_arrow_1),
                            contentDescription = null,
                            modifier = modifier
                                .padding(start = 0.dp)
                                .width(20.dp),
                            contentScale = ContentScale.FillWidth
                        )
                    }
                }

                Box(
                    modifier = modifier
                        .width(405.dp)
                        .height(72.dp)
                        .offset(x = (20).dp, y = (16).dp)
//                        .background(color = Color.Green)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bg_1),
                        contentDescription = null,
                        modifier = modifier
                            .padding(start = 0.dp)
                            .width(405.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Row {
                        Box(
                            modifier = modifier
                                .width(76.dp)
                                .height(65.dp)
                                .offset(x = (9).dp, y = (7).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.drug_icon),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )
                        }

                        Column {


                            Text(
                                text = "Obat A",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.White,
                                modifier = modifier
                                    .offset(x = (8).dp, y = (8).dp),
                                textAlign = TextAlign.Center
                            )

                            Text(
                                text = "Hari ini pukul 07.00",
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color.White,
                                modifier = modifier
                                    .offset(x = (8).dp, y = (6).dp),
                                textAlign = TextAlign.Center
                            )
                        }

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (155).dp, y = (20).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cheklist),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(36.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = BlueGradient
                                ),
                                onClick = { }
                            ) {
                            }
                        }
                    }
                }

                Box(
                    modifier = modifier
                        .width(405.dp)
                        .height(72.dp)
                        .offset(x = (20).dp, y = (26).dp)
//                        .background(color = Color.Green)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bg_1),
                        contentDescription = null,
                        modifier = modifier
                            .padding(start = 0.dp)
                            .width(405.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Row {
                        Box(
                            modifier = modifier
                                .width(76.dp)
                                .height(65.dp)
                                .offset(x = (9).dp, y = (7).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.drug_icon),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )
                        }

                        Column {


                            Text(
                                text = "Obat B",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.White,
                                modifier = modifier
                                    .offset(x = (8).dp, y = (8).dp),
                                textAlign = TextAlign.Center
                            )

                            Text(
                                text = "Hari ini pukul 12.10",
                                fontWeight = FontWeight.Medium,
                                fontSize = 12.sp,
                                color = Color.White,
                                modifier = modifier
                                    .offset(x = (8).dp, y = (6).dp),
                                textAlign = TextAlign.Center
                            )
                        }

                        Box(
                            modifier = modifier
                                .width(38.dp)
                                .height(40.dp)
                                .offset(x = (161).dp, y = (22).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cheklist2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(25.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = BlueGradient
                                ),
                                onClick = { }
                            ) {
                            }
                        }
                    }
                }
            }
        }

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(285.dp)
                .offset(x = (0).dp, y = (-20).dp)
//                .background(color = Color.Green)
        ) {
            Column {
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(35.dp)
//                        .background(color = Color.Black)
                ) {
                    Text(
                        text = "Artikel Hari Ini",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = BlueGradient,
                        modifier = modifier
                            .offset(x = (20).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )
                }

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp)
//                        .background(color = Color.Blue)
                ) {
                    items(2) { index ->
                    Box(
                        modifier = modifier
                            .width(230.dp)
                            .height(285.dp)
                            .clip(RoundedCornerShape(10.dp))
//                            .background(color = GrayWhite)
                    ) {
                        Column {
                            Box(
                                modifier = modifier
                                    .width(230.dp)
                                    .height(150.dp)
                                    .padding(start = 0.dp)
//                                            .clip(RoundedCornerShape(10.dp))
//                                    .background(color = Color.Yellow)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.discover_two),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp, top = 0.dp)
//                                            .offset(x = (0).dp, y = (0).dp)
                                        .width(230.dp),
//                                        contentScale = ContentScale.FillWidth
                                )
                            }

                            Text(
                                text = "Pola Makan Sehat dan\nPenurunan Risiko Demensia",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 15.sp,
                                color = BlueGradient,
                                modifier = modifier
                                    .offset(x = (0).dp, y = (6).dp),
                                textAlign = TextAlign.Left
                            )

                            Row(
                                modifier = modifier
                                    .offset(y = (18).dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .height(32.dp)
                                        .width(110.dp)
//                                        .background(color = Color.Black)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically // Align icon and text vertically
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.heart_svgrepo_com),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp)
//                                                            .offset(x = (15.5).dp, y = (6).dp)
                                                .size(32.dp),
                                            contentScale = ContentScale.FillWidth
                                        )
                                        Spacer(modifier = Modifier.width(5.dp)) // Add spacing between icon and text
                                        Text(
                                            text = "32,9rb Likes", // Your text here
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp),// Adjust font size as needed
                                            color = BlueGradient
                                        )
                                    }

                                    Button(
                                        modifier = Modifier
                                            .height(32.dp)
                                            .width(32.dp), // Adjust width as needed
                                        shape = RoundedCornerShape(
                                            topStart = 8.dp,
                                            bottomStart = 8.dp,
                                            topEnd = 8.dp,
                                            bottomEnd = 8.dp
                                        ),
                                        enabled = true,
                                        colors =ButtonDefaults.buttonColors(
                                            containerColor = Color.Transparent,
                                            contentColor = BlueGradient
                                        ),
                                        onClick = { }
                                    ) {

                                    }
                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Box(
                                    modifier = Modifier
                                        .height(22.dp)
                                        .width(110.dp)
                                        .offset(y = (5).dp)
//                                        .background(color = Color.Yellow)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically // Align icon and text vertically
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.share_svgrepo_com),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp)
//                                                            .offset(x = (15.5).dp, y = (6).dp)
                                                .size(21.dp),
                                            contentScale = ContentScale.FillWidth
                                        )
                                        Spacer(modifier = Modifier.width(8.dp)) // Add spacing between icon and text
                                        Text(
                                            text = "524 Shares", // Your text here
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp),// Adjust font size as needed
                                            color = BlueGradient
                                        )
                                    }

                                    Button(
                                        modifier = Modifier
                                            .height(22.dp)
                                            .width(22.dp), // Adjust width as needed
                                        shape = RoundedCornerShape(
                                            topStart = 5.dp,
                                            bottomStart = 5.dp,
                                            topEnd = 5.dp,
                                            bottomEnd = 5.dp
                                        ),
                                        enabled = true,
                                        colors =ButtonDefaults.buttonColors(
                                            containerColor = Color.Transparent,
                                            contentColor = BlueGradient
                                        ),
                                        onClick = { }
                                    ) {

                                    }
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier .width(20.dp))

                    Box(
                        modifier = modifier
                            .width(230.dp)
                            .height(285.dp)
                            .clip(RoundedCornerShape(10.dp))
//                            .background(color = GrayWhite)
                    ) {
                        Column {
                            Box(
                                modifier = modifier
                                    .width(230.dp)
                                    .height(150.dp)
                                    .padding(start = 0.dp)
//                                            .clip(RoundedCornerShape(10.dp))
//                                    .background(color = Color.Yellow)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.discover_one),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp, top = 0.dp)
//                                            .offset(x = (0).dp, y = (0).dp)
                                        .width(230.dp),
//                                        contentScale = ContentScale.FillWidth
                                )
                            }

                            Text(
                                text = "Manfaat Jalan Kaki Setiap\n" +
                                        "Hari Bagi Otak",
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 15.sp,
                                color = BlueGradient,
                                modifier = modifier
                                    .offset(x = (0).dp, y = (6).dp),
                                textAlign = TextAlign.Left
                            )

                            Row(
                                modifier = modifier
                                    .offset(y = (18).dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .height(32.dp)
                                        .width(110.dp)
//                                        .background(color = Color.Black)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically // Align icon and text vertically
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.heart_svgrepo_com),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp)
//                                                            .offset(x = (15.5).dp, y = (6).dp)
                                                .size(32.dp),
                                            contentScale = ContentScale.FillWidth
                                        )
                                        Spacer(modifier = Modifier.width(5.dp)) // Add spacing between icon and text
                                        Text(
                                            text = "5,6rb Likes", // Your text here
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp),// Adjust font size as needed
                                            color = BlueGradient
                                        )
                                    }

                                    Button(
                                        modifier = Modifier
                                            .height(32.dp)
                                            .width(32.dp), // Adjust width as needed
                                        shape = RoundedCornerShape(
                                            topStart = 8.dp,
                                            bottomStart = 8.dp,
                                            topEnd = 8.dp,
                                            bottomEnd = 8.dp
                                        ),
                                        enabled = true,
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.Transparent,
                                            contentColor = BlueGradient
                                        ),
                                        onClick = { }
                                    ) {

                                    }
                                }

                                Spacer(modifier = Modifier.width(10.dp))
                                Box(
                                    modifier = Modifier
                                        .height(22.dp)
                                        .width(110.dp)
                                        .offset(y = (5).dp)
//                                        .background(color = Color.Yellow)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically // Align icon and text vertically
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.share_svgrepo_com),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp)
//                                                            .offset(x = (15.5).dp, y = (6).dp)
                                                .size(21.dp),
                                            contentScale = ContentScale.FillWidth
                                        )
                                        Spacer(modifier = Modifier.width(8.dp)) // Add spacing between icon and text
                                        Text(
                                            text = "350 Shares", // Your text here
                                            fontSize = 12.sp,
                                            modifier = Modifier
                                                .padding(top = 0.2.dp),// Adjust font size as needed
                                            color = BlueGradient
                                        )
                                    }

                                    Button(
                                        modifier = Modifier
                                            .height(22.dp)
                                            .width(22.dp), // Adjust width as needed
                                        shape = RoundedCornerShape(
                                            topStart = 5.dp,
                                            bottomStart = 5.dp,
                                            topEnd = 5.dp,
                                            bottomEnd = 5.dp
                                        ),
                                        enabled = true,
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.Transparent,
                                            contentColor = BlueGradient
                                        ),
                                        onClick = { }
                                    ) {

                                    }
                                }
                            }
                        }
                    }
                        Spacer(modifier = Modifier .width(20.dp))
                    }
                }
            }
        }

        // ===================================  Navbar Menu ===================================
        Box(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.Top)
                .offset(x = (0).dp, y = (0).dp)
                .background(color = Color.Black)
        ) {
            Box(
                modifier = modifier
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
                    modifier = modifier
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
                                    painter = painterResource(id = R.drawable.beranda___active_icon),
                                    contentDescription = "Home Icon",
                                    modifier = Modifier.size(37.dp),
                                    tint = Color.Unspecified
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
                                    painter = painterResource(id = R.drawable.aktivitas_icon),
                                    contentDescription = "Aktivitas Icon",
                                    modifier = Modifier.size(31.dp)
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
}