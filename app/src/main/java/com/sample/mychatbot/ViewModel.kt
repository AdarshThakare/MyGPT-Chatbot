package com.sample.mychatbot

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.ai.client.generativeai.Chat
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.launch

class ViewModel : ViewModel() {
    val list by lazy{
        mutableStateListOf<Data>()
    }
    private val genAi by lazy{
        GenerativeModel(
            modelName = "gemini-pro",
            apiKey = "AIzaSyCPW368z4YcBYsGHAjiO3BA6ngEJHj9bRU"
        )
    }
    fun sendMessage(message : String) = viewModelScope.launch{
//        var response : String? = genAi.startChat().sendMessage(prompt = message).text
//        Log.d("AI_RESPONSE", response.toString())

        val chat : Chat = genAi.startChat()
        list.add(Data(message,ChatRole.USER.role))

        chat.sendMessage(
            content(ChatRole.USER.role){text(message)}
        ).text?.let {
            list.add(Data(it,ChatRole.MODEL.role))
        }
    }
}