package com.example.neuternal_designapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.neuternal_designapplication.ui.theme.BlueGradient
import com.example.neuternal_designapplication.ui.theme.GrayWhite

// Tombol backnya nanti bisa diarahin ke home atau section khusus message

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chatbot(navController: NavController) {
    var message by remember { mutableStateOf(TextFieldValue("")) }
    var messages by remember { mutableStateOf(listOf<Pair<Boolean, String>>()) } // Pair to differentiate between user (true) and doctor (false)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier .offset(y = (20).dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.back_icon),
                            contentDescription = "Back",
                            modifier = Modifier.size(45.dp)
                        )
                        Button(
                            modifier = Modifier
                                .height(45.dp)
                                .width(45.dp)
                                .offset(x = (-45).dp, y = (-2).dp),
                            shape = RoundedCornerShape(10.dp),
                            enabled = true,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = BlueGradient
                            ),
                            onClick = {navController.navigate("dashboard_fix")}
                        ) {
                        }
//                        Spacer(modifier = Modifier.width(8.dp))
                        Image(
                            painter = painterResource(id = R.drawable.tabler_message_chatbot_filled_o),
                            contentDescription = "Doctor",
                            modifier = Modifier
                                .size(45.dp)
                                .offset(y = (-3).dp)
                                .clip(CircleShape)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text("NeuternAI", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = BlueGradient, modifier = Modifier .offset(y = (2).dp))
                            Text("Powered by ChatGPT", fontSize = 12.sp, color = Color.Gray, modifier = Modifier .offset(y = (-7).dp))
                        }
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle call action */ },
                        modifier = Modifier
                            .offset(x = (-10).dp, y = (24).dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.question_square_svgrepo_com),
                            modifier = Modifier
                                .size(30.dp),
                            contentDescription = "Need Help",
                            tint = Color.Unspecified

                        )
                    }
                },
                modifier = Modifier.background(Color.White) .height(80.dp),
            )
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = GrayWhite)
                    .padding(padding)
            ) {
                LazyColumn(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                ) {
                    items(messages) { messagePair ->
                        if (messagePair.first) {
                            UserMessages(messagePair.second)
                        } else {
                            DoctorMessages(messagePair.second)
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .background(Color.White, RoundedCornerShape(16.dp)),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    BasicTextField(
                        value = message,
                        onValueChange = { message = it },
                        modifier = Modifier
                            .weight(1f)
                            .padding(8.dp),
                        singleLine = true,
                        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Send),
                        keyboardActions = KeyboardActions(
                            onSend = {
                                if (message.text.isNotBlank()) {
                                    messages = messages + (true to message.text)
                                    message = TextFieldValue("")
                                    // Simulate doctor's response
                                    messages = messages + (false to "Penyakit Alzheimer adalah penyakit otak yang menyebabkan penurunan daya ingat, menurunnya kemampuan berpikir dan berbicara, serta perubahan perilaku.\n\nPenyakit ini bisa memburuk seiring waktu sehingga membuat penderitanya tidak mampu lagi melakukan pekerjaan sehari-hari.")
                                }
                            }
                        ),
                        textStyle = LocalTextStyle.current.copy(fontSize = 16.sp)
                    )
                    IconButton(onClick = {
                        if (message.text.isNotBlank()) {
                            messages = messages + (true to message.text)
                            message = TextFieldValue("")
                            // Simulate doctor's response
                            messages = messages + (false to "Penyakit Alzheimer adalah penyakit otak yang menyebabkan penurunan daya ingat, menurunnya kemampuan berpikir dan berbicara, serta perubahan perilaku. Penyakit ini bisa memburuk seiring waktu sehingga membuat penderitanya tidak mampu lagi melakukan pekerjaan sehari-hari.")
                        }
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.send),
                            modifier = Modifier
                                .size(25.dp),
                            contentDescription = "Send",
                            tint = Color.Unspecified
                        )
                    }
                }
            }
        }
    )
}

@Composable
fun UserMessages(message: String) {
    Box(
        contentAlignment = Alignment.CenterEnd,
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(
            text = message,
            modifier = Modifier
                .background(Color(0xFFCFCFCF), RoundedCornerShape(8.dp))
                .padding(8.dp)
        )
    }
}

@Composable
fun DoctorMessages(message: String) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(
            text = message,
            modifier = Modifier
                .background(Color(0xFFE9E9E9), RoundedCornerShape(8.dp))
                .padding(8.dp)
        )
    }
}