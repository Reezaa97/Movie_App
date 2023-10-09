package com.example.jc.screen

import TopFilter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jc.ui.theme.AppDark

@Composable
 fun AppTopBox(filter: List<String>) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(340.dp)
    ) {


        TopSlider()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(340.dp)
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color.Transparent,
                            AppDark
                        )
                    )
                )
                .align(Alignment.BottomCenter)
        ) {
            TopFilter(filter)

        }
        Box(
            Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ) {
            SliderTitle()
        }
    }
}