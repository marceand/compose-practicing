package com.example.composepracticing.player

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepracticing.R
import com.example.composepracticing.ui.theme.AlbumTextColor


@Composable
fun AlbumCover(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.album_cover),
            contentDescription = stringResource(
                R.string.album
            ),
            modifier = Modifier
                .size(340.dp)
                .clip(RoundedCornerShape(40.dp))
        )
        Text(
            text = stringResource(R.string.album_title),
            modifier = Modifier.padding(top = 20.dp),
            color = AlbumTextColor,
            fontSize = 32.sp
        )
        Text(
            text = stringResource(R.string.podcast_title),
            modifier = Modifier.padding(top = 8.dp),
            color = AlbumTextColor,
            fontSize = 20.sp
        )
    }
}

@Preview(widthDp = 412, heightDp = 915, showBackground = true)
@Composable
fun AlbumCoverPreview() {
    AlbumCover()
}