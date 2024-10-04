package com.tarun.composeui.login.loginscreen

import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tarun.composeui.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun LoginUi() {
        Image(painter =painterResource(R.drawable.splashview),
        contentDescription=null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop)
       Column {
           Text(
               text = "Login",
               fontSize = 30.sp,
               color = Color.White,
               textAlign = TextAlign.Center)
       }

}