package com.example.composepracticing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepracticing.player.AlbumCover
import com.example.composepracticing.player.Controller
import com.example.composepracticing.player.SongSlider
import com.example.composepracticing.player.TopBar
import com.example.composepracticing.player.VolumeSlider
import com.example.composepracticing.ui.theme.ComposePracticingTheme


class PlayerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticingTheme(dynamicColor = false) {
                // A surface container using the 'background' color from the theme
                PlayerScreen(Modifier.fillMaxSize())
            }
        }
    }
}


@Composable
fun PlayerScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { TopBar(Modifier.fillMaxWidth()) }
    ) {
        PlayerContent(it)
    }
}

@Preview(widthDp = 412, heightDp = 915, showBackground = true, backgroundColor = 0xFF6650a4)
@Composable
fun PlayerScreenPreview(modifier: Modifier = Modifier) {
    ComposePracticingTheme(dynamicColor = false) {
        PlayerScreen()
    }
}

@Composable
fun PlayerContent(paddingValues: PaddingValues) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(
            top = paddingValues.calculateTopPadding(),
            start = 16.dp,
            end = 16.dp
        )
    ) {
        AlbumCover(modifier = Modifier.padding(top = 20.dp))
        SongSlider(modifier = Modifier.padding(top = 20.dp))
        Controller(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp)
        )
        VolumeSlider(modifier = Modifier.padding(top = 28.dp, start = 8.dp, end = 8.dp))
    }

}

