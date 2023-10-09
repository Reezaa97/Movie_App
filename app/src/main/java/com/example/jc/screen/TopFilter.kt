import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.jc.ui.theme.AppGray

@Composable
 fun TopFilter(filter: List<String>) {
    var selectedFilter by remember { mutableStateOf(0) }
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        item {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
        items(filter.size) {
            TextButton(onClick = { selectedFilter = it }) {
                Text(
                    text = filter[it],
                    color = if (selectedFilter == it) Color.White
                    else AppGray
                )
            }

        }
    }
}

