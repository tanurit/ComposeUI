package com.tarun.composeui.login.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.tarun.composeui.login.loginscreen.LoginUi


class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Compose UI
            LoginUi()
        }
    }
}