package com.example.neuternal_designapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.neuternal_designapplication.ui.theme.NeuternalDesignApplicationTheme
import androidx.navigation.compose.composable
import com.example.neuternal_designapplication.ForumPage1
import com.example.neuternal_designapplication.ui.theme.NeuternalDesignApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeuternalDesignApplicationTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "beginning_screen") {

                    //====================================== Login, Sign Up, Reset Password Screen ==================================================
                    //===============================================================================================================================
                    composable("beginning_screen") {
                        BeginningScreen(navController = navController)
                    }
                    composable("login_screen") {
                        LoginScreen(navController = navController)
                    }
                    composable("register_screen") {
                        RegisterScreen(navController = navController)
                    }
                    composable("forgot_password") {
                        ForgotPasswordScreen(navController = navController)
                    }
                    composable("otp_verification") {
                        OTPVerificationScreen(navController = navController)
                    }
                    composable("reset_password") {
                        BuatUlangPasswordScreen(navController = navController)
                    }

                    //===================================================== Dashboard ===============================================================
                    //===============================================================================================================================
                    composable("dashboard_fix") {
                        DashboardFix(navController = navController, modifier = Modifier)
                    }
                    composable("consult") {
                        ConsultActivity(navController = navController)
                    }
                    composable("booking") {
                        BookingActivity(navController = navController)
                    }
                    composable("payment") {
                        PaymentActivity(navController = navController)
                    }
                    composable("chat") {
                        ChatActivity(navController = navController)
                    }
                    composable("chatbot") {
                        Chatbot(navController = navController)
                    }

                    //===================================================== Aktivitas ===============================================================
                    //===============================================================================================================================
                    composable("activitas_page") {
                        AktivitasPage(navController = navController, modifier = Modifier)
                    }
                    composable("halaman_utama") {
                        HalamanUtama(navController = navController)
                    }

                    //======================================================= Forum =================================================================
                    //===============================================================================================================================
                    composable("forum_page1") {
                        ForumPage1(navController = navController, modifier = Modifier)
                    }
                    composable("forum_page2") {
                        ForumPage2(navController = navController, modifier = Modifier)
                    }

                    //===================================================== Profil ===============================================================
                    //===============================================================================================================================
                    composable("profil") {
                        Profil(navController = navController, modifier = Modifier)
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    NeuternalDesignApplicationTheme {
        RegisterScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    NeuternalDesignApplicationTheme {
        LoginScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun ForgotPasswordScreenPreview() {
    NeuternalDesignApplicationTheme {
        ForgotPasswordScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun OTPVerificationScreenPreview() {
    NeuternalDesignApplicationTheme {
        OTPVerificationScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun BuatUlangPasswordScreenPreview() {
    NeuternalDesignApplicationTheme {
        BuatUlangPasswordScreen(rememberNavController())
    }
}