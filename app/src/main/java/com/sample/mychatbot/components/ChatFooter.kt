package com.sample.mychatbot.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatFooter(
    onClick: (text:String)->Unit,
    ){
    var inputText by remember{ mutableStateOf("") }
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
    OutlinedTextField(
        label = {Text("Enter your message")},
        value = inputText,
        onValueChange = {inputText = it},
        singleLine = false,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedLabelColor = Color.Black,
            unfocusedLabelColor = Color.Black,
            focusedBorderColor = Color.DarkGray,
            unfocusedBorderColor = Color.Black,
            focusedTextColor = Color.Black
        ),
        modifier = Modifier.padding(start = 4.dp ,bottom = 12.dp)
    )
        Spacer(modifier = Modifier.width(5.dp))
        IconButton(onClick ={
            onClick(inputText)
            inputText = "" }) {
            Icon(Icons.Rounded.Send, contentDescription = null,
                modifier = Modifier.size(40.dp).clip(shape = CircleShape)
                    .background(Color.Black).padding(start=8.dp,end =4.dp,bottom = 12.dp, top = 8.dp),
                tint = Color.Cyan)
        }
    }
}