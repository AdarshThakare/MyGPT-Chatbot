package com.sample.mychatbot

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sample.mychatbot.components.ChatFooter
import com.sample.mychatbot.components.ChatHeader
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sample.mychatbot.components.ChatList


@Composable
fun Chatbot(
    viewModel: ViewModel = viewModel() ){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        ChatHeader()

        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ){
            if (viewModel.list.isEmpty()) {
                Text(text = "  No messages yet!\nStart a conversation.",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
            }else {
                ChatList(list = viewModel.list)
            }
        }

        ChatFooter {
            if (it.isNotEmpty()) {
                viewModel.sendMessage(it)
            }
        }
    }
}