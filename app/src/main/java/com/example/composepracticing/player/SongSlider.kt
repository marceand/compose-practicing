package com.example.composepracticing.player

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx .compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepracticing.R
import com.example.composepracticing.ui.theme.SongActiveTrackColor
import com.example.composepracticing.ui.theme.SongInactiveTrackColor
import com.example.composepracticing.ui.theme.SongTextColor
import com.example.composepracticing.ui.theme.SongThumbColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SongSlider(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
    ) {

        Slider(
            value = 0.5f, onValueChange = {},
            colors = SliderDefaults.colors(
                thumbColor = SongThumbColor,
                activeTrackColor = SongActiveTrackColor,
                inactiveTrackColor = SongInactiveTrackColor
            ),
            modifier = Modifier.height(16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 0.dp)
        ) {
            Text(

                text = stringResource(R.string.start_duration),
                color = SongTextColor,
                fontSize = 11.sp,
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = stringResource(R.string.end_duration),
                color = SongTextColor,
                fontSize = 11.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
        }
    }
}


@Preview(widthDp = 412, heightDp = 915, showBackground = true)
@Composable
fun SongSliderPreview(modifier: Modifier = Modifier) {
    SongSlider()
}