package com.example.composepracticing.ControlPlayer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepracticing.R
import com.example.composepracticing.ui.theme.PauseBackground


@Composable
fun Control(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_shuffle_24),
                contentDescription = "Shuffle",
                tint = Color.Unspecified,
                modifier = Modifier.size(30.dp)
            )
        }

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_skip_previous_24),
                contentDescription = "Previous",
                tint = Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )
        }

        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(PauseBackground)
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_pause_24),
                contentDescription = "Pause",
                tint = Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_skip_next_24),
                contentDescription = "Next",
                tint = Color.Unspecified,
                modifier = Modifier.size(40.dp)
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_repeat_24),
                contentDescription = "Repeat",
                tint = Color.Unspecified,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Preview(widthDp = 412, heightDp = 915, showBackground = true)
@Composable
fun ControlPreview(modifier: Modifier = Modifier) {
    Control()
}