package com.sample.mychatbot

data class Data (
    val message: String,
    val role: String,
)

enum class ChatRole (val role: String){
    USER("user"),
    MODEL("model"),

}