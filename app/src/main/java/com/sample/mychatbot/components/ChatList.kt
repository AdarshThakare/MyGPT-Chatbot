package com.sample.mychatbot.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sample.mychatbot.ChatRole
import com.sample.mychatbot.Data
import com.sample.mychatbot.R

@Composable
fun ChatList (
    list : MutableList<Data>
){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(list){
            if(it.role== ChatRole.USER.role){
                Row(modifier = Modifier.fillMaxWidth()
                    ) {
                    Text(
                        modifier = Modifier.padding(top=5.dp,bottom = 6.dp, end = 12.dp)
                            .weight(1f),
                        text = it.message,
                        textAlign = TextAlign.End,
                        color = Color.Yellow,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Image(painter = painterResource(R.drawable.user_profile_32), contentDescription = null,
                        modifier = Modifier.size(37.dp).clip(shape = CircleShape).weight(0.1f).padding(end=12.dp))
                }
            }else{
                Row (modifier = Modifier.fillMaxWidth()) {
                    Image(painter = painterResource(R.drawable.chatbot_logo), contentDescription = null,
                        modifier = Modifier.size(37.dp).clip(shape = CircleShape).weight(0.1f).padding(start=12.dp))
                    Text(
                        text = it.message,
                        modifier = Modifier.fillMaxWidth()
                            .padding(start = 6.dp, end = 8.dp).weight(1f),
                        color = Color.Black,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }
    }
}