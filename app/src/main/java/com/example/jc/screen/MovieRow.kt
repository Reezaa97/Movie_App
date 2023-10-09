package com.example.jc.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jc.R
import com.example.jc.data.MackData
import com.example.jc.ui.theme.AppGold
import com.example.jc.ui.theme.AppGray
import com.example.jc.ui.theme.AppWhite

@Composable
 fun MovieRow() {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(25.dp)
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(MackData.FilmList.size) {
                Box(
                    modifier = Modifier
                        .width(150.dp)
                        .height(230.dp)
                        .clip(
                            RoundedCornerShape(15.dp)
                        )
                ) {
                    Image(
                        painter = painterResource(id = MackData.FilmList[it].image),
                        contentDescription = "Film",
                        modifier = Modifier.fillParentMaxSize()
                    )

                    Box(
                        Modifier
                            .background(AppGray)
                            .padding(3.dp)
                            .align(Alignment.TopStart)
                    ) {
                        Row {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_star_24),
                                contentDescription = "", tint = AppGold,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(1.dp))
                            Text(
                                text = MackData.FilmList[it].rank.toString(),
                                color = AppWhite
                            )

                        }
                    }
                }
            }
        }
    }
}