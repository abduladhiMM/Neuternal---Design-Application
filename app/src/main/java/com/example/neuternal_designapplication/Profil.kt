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
fun Profil(navController: NavController, modifier: Modifier) {
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
                .height(230.dp)
//                .background(color = Color.Gray)
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
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.uil_setting),
                        contentDescription = null,
                        modifier = modifier
                            .offset(x = (380).dp, y = (2).dp)
                            .width(40.dp),
                        contentScale = ContentScale.FillWidth
                    )

                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {

                        Row (modifier = Modifier .fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                            val annotatedString = buildAnnotatedString {
                                pushStyle(SpanStyle(fontWeight = FontWeight.Bold))
                                append("Msbree")
                            }
                            Column {

                                Image(
                                    painter = painterResource(id = R.drawable.profil_navbar_icon),
                                    contentDescription = null,
                                    modifier = modifier
                                        .offset(x = (10).dp, y = (0).dp)
                                        .width(80.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                                Spacer(modifier = Modifier.height(12.dp))

                                Text(
                                    text = annotatedString,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 22.sp,
                                    color = BlueGradient,
                                    modifier = modifier
                                        .offset(x = (10).dp, y = (0).dp),
                                    textAlign = TextAlign.Center
                                )


                            }

                            Box(modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
//                                .background(color = Color.Green)
                                .offset(y = 68.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.edit_icon),
                                    contentDescription = null,
                                    modifier = modifier
                                        .offset(x = (0).dp, y = (0).dp)
                                        .width(20.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }
                    }
                }
            }
        }

        // ===================================  Isi  ===================================
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(655.dp)
                .offset(x = (0).dp, y = (-2).dp)
//                .background(color = Color.Yellow)
        ){
            Column {
                Row {
                    Text(
                        text = "Akun",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = BlueGradient,
                        modifier = modifier
                            .offset(x = (20).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )
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
                                painter = painterResource(id = R.drawable.bg_icon_v2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Box(
                                modifier = modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .offset(x = (8).dp, y = (7).dp)
//                            .background(color = Color.Green)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mdi_drugs_2),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp)
                                        .width(40.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }

                        Text(
                            text = "Riwayat Obat",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (8).dp, y = (23).dp),
                            textAlign = TextAlign.Center
                        )

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (165).dp, y = (18).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back_icon_2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(30.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .offset(x = (-2).dp, y = (-3).dp)
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.White
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
                                painter = painterResource(id = R.drawable.bg_icon_v2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Box(
                                modifier = modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .offset(x = (8).dp, y = (7).dp)
//                            .background(color = Color.Green)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.health_report_list_svgrepo_com),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp)
                                        .width(40.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }

                        Text(
                            text = "Riwayat Konsultasi",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (8).dp, y = (23).dp),
                            textAlign = TextAlign.Center
                        )

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (116).dp, y = (18).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back_icon_2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(30.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .offset(x = (-2).dp, y = (-3).dp)
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.White
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
                        .offset(x = (20).dp, y = (36).dp)
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
                                painter = painterResource(id = R.drawable.bg_icon_v2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Box(
                                modifier = modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .offset(x = (8).dp, y = (7).dp)
//                            .background(color = Color.Green)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.fitness_watch_pulse_smartwatch_svgrepo_com),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp)
                                        .width(40.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }

                        Text(
                            text = "Riwayat Aktivitas",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (8).dp, y = (23).dp),
                            textAlign = TextAlign.Center
                        )

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (130).dp, y = (18).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back_icon_2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(30.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .offset(x = (-2).dp, y = (-3).dp)
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.White
                                ),
                                onClick = { }
                            ) {
                            }
                        }
                    }
                }
            }


            Column(
                modifier = Modifier
                    .offset(x = (0).dp, y = (310).dp)
            ) {
                Row {
                    Text(
                        text = "Pengaturan",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = BlueGradient,
                        modifier = modifier
                            .offset(x = (20).dp, y = (0).dp),
                        textAlign = TextAlign.Center
                    )
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
                                painter = painterResource(id = R.drawable.bg_icon_v2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Box(
                                modifier = modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .offset(x = (8).dp, y = (7).dp)
//                            .background(color = Color.Green)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.material_symbols_privacy_tip_outline_rounded),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp)
                                        .width(40.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }

                        Text(
                            text = "Ketentuan & Privasi",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (8).dp, y = (23).dp),
                            textAlign = TextAlign.Center
                        )

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (110).dp, y = (18).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back_icon_2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(30.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .offset(x = (-2).dp, y = (-3).dp)
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.White
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
                                painter = painterResource(id = R.drawable.bg_icon_v2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Box(
                                modifier = modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .offset(x = (8).dp, y = (7).dp)
//                            .background(color = Color.Green)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ri_customer_service_2_line),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp)
                                        .width(40.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }

                        Text(
                            text = "Pusat Bantuan",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (8).dp, y = (23).dp),
                            textAlign = TextAlign.Center
                        )

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (153).dp, y = (18).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back_icon_2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(30.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .offset(x = (-2).dp, y = (-3).dp)
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.White
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
                        .offset(x = (20).dp, y = (36).dp)
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
                                painter = painterResource(id = R.drawable.bg_icon_v2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(55.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Box(
                                modifier = modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .offset(x = (8).dp, y = (7).dp)
//                            .background(color = Color.Green)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_round_logout),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(start = 0.dp)
                                        .width(40.dp),
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }

                        Text(
                            text = "Keluar",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color.White,
                            modifier = modifier
                                .offset(x = (8).dp, y = (23).dp),
                            textAlign = TextAlign.Center
                        )

                        Box(
                            modifier = modifier
                                .width(40.dp)
                                .height(40.dp)
                                .offset(x = (222).dp, y = (18).dp)
//                                .background(color = Color.Green)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.back_icon_2),
                                contentDescription = null,
                                modifier = modifier
                                    .padding(start = 0.dp)
                                    .width(30.dp),
                                contentScale = ContentScale.FillWidth
                            )

                            Button(
                                modifier = Modifier
                                    .offset(x = (-2).dp, y = (-3).dp)
                                    .height(38.dp)
                                    .width(38.dp),
                                shape = RoundedCornerShape(8.dp),
                                enabled = true,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Transparent,
                                    contentColor = Color.White
                                ),
                                onClick = { }
                            ) {
                            }
                        }
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
                                    painter = painterResource(id = R.drawable.beranda_icon),
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
                                    painter = painterResource(id = R.drawable.profil___active_icon),
                                    contentDescription = "Home Profil",
                                    modifier = Modifier
                                        .size(37.dp)
                                        .offset(y = (-3.5).dp),
                                    tint = Color.Unspecified
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