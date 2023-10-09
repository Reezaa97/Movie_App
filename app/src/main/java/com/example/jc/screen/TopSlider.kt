package com.example.jc.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jc.data.MackData

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun TopSlider() {
    val lazyListState = rememberLazyListState()
    LazyRow(
        state = lazyListState,
        flingBehavior = rememberSnapFlingBehavior(
            lazyListState = lazyListState
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(340.dp)
    ) {
        items(MackData.sliderList.size) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = MackData.sliderList[it].image),
                    contentDescription = "Slider",
                    modifier = Modifier.fillParentMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }

    }
}