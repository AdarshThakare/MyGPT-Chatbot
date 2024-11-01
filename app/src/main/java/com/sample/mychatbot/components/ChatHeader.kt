package com.sample.mychatbot.components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ChatHeader (){
    Column(modifier = Modifier.fillMaxWidth().background(Color.Black)) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "MyGPT ChatBot",
            fontSize = 20.sp,
            fontWeight = FontWeight(800),
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().background(Color.Black)
        )
        Spacer(modifier = Modifier.height(3.dp))
    }
}