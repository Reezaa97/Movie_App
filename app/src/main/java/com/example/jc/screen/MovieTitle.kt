package com.example.jc.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc.ui.theme.AppGray
import com.example.jc.ui.theme.AppWhite

@Composable
 fun MovieTitle() {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(25.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {


            Text(
                text = "Top Movie", fontSize = 21.sp, modifier = Modifier.weight(1f),
                color = AppWhite
            )
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "View All", fontSize = 14.sp, color = AppGray)

            }
        }
    }
}
