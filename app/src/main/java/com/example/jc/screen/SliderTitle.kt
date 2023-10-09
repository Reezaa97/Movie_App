package com.example.jc.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc.R
import com.example.jc.ui.theme.AppGray
import com.example.jc.ui.theme.AppRed

    @Composable
     fun SliderTitle() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(25.dp)
        ) {


            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Available Now", fontSize = 14.sp,
                    color = AppGray
                )
                Text(
                    text = "Watch Film", fontSize = 21.sp,
                    color = Color.White
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_play_circle_24),
                    contentDescription = "play",
                    modifier = Modifier.size(50.dp),
                    tint = AppRed
                )
            }
        }
    }


