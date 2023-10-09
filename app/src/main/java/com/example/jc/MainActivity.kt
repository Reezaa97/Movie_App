package com.example.jc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jc.data.ButtonApp
import com.example.jc.model.Menu
import com.example.jc.screen.AppTopBox
import com.example.jc.screen.MovieRow
import com.example.jc.screen.MovieTitle
import com.example.jc.ui.theme.AppDark
import com.example.jc.ui.theme.AppLightGray
import com.example.jc.ui.theme.AppMenuGray
import com.example.jc.ui.theme.AppRed
import com.example.jc.ui.theme.AppWhite
import com.example.jc.ui.theme.JcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainView()
                }
            }
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun MainView() {
    val filter = listOf("Movies", "Tv Shows", "Trailers", "series")
    val menuList = listOf(
        ButtonApp.Home, ButtonApp.Movie,
        ButtonApp.Favorites, ButtonApp.Profile
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppDark)
    ) {
        Column(Modifier.fillMaxSize()) {
            AppTopBox(filter)
            Spacer(modifier = Modifier.height(10.dp))
            MovieTitle()
            MovieRow()

        }
        Box(
            Modifier
                .fillMaxWidth()
                .height(75.dp)
                .clip(
                    RoundedCornerShape(50, 50, 0, 0)
                )
                .align(Alignment.BottomCenter)
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(AppLightGray)
            ) {
                var selectedMenu by mutableStateOf(0)
                LazyRow(
                    Modifier
                        .fillMaxSize()
                        .padding(25.dp, 15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    items(menuList.size) {
                        IconButton(
                            onClick = { selectedMenu = it }, modifier = Modifier.clip(
                                RoundedCornerShape(50.dp)
                            )
                        ) {
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .background(if (selectedMenu == it) AppRed else Color.Transparent)
                                    .padding(10.dp), verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    painter = painterResource(id = menuList[it].icon),
                                    contentDescription = menuList[it].title,
                                    tint = if (selectedMenu == it) Color.White else AppMenuGray,
                                    modifier = Modifier.size(25.dp)
                                )
                                Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
                                if (selectedMenu == it) {
                                    Text(
                                        text = menuList[it].title,
                                        fontSize = 15.sp, color = Color.White
                                    )
                                }


                            }

                        }
                    }


                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JcTheme {
        MainView()
    }
}