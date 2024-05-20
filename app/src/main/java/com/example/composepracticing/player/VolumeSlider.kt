package com.example.composepracticing.player

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composepracticing.ui.theme.VolumeActiveTrackColor
import com.example.composepracticing.ui.theme.VolumeInactiveTrackColor
import com.example.composepracticing.ui.theme.VolumeThumbColor


@Composable
fun VolumeSliderImpl(
    modifier: Modifier = Modifier,
    value: Float = 0.5f,
    trackHeight: Dp = 24.dp,
    thumbRadius: Dp = 24.dp,
    thumbInVector: ImageVector = Icons.Filled.VolumeUp,
    activeColor: Color = Color(0xFF4A90E2),
    inactiveColor: Color = Color(0xFFD3D3D3),
    thumbTint: Color = Color.Unspecified
) {

    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .height(trackHeight)
    ) {
        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()
        val density = LocalDensity.current
        //val thumbRadius = constraints.maxHeight.to

        val thumbRadiusPx = with(density) { thumbRadius.toPx() }

        Canvas(modifier = Modifier.fillMaxSize()) {
            // Inactive track
            drawRoundRect(
                color = inactiveColor,
                cornerRadius = CornerRadius(x = height / 2, y = height / 2),
                size = this.size
            )

            // Active track
            drawRoundRect(
                color = activeColor,
                cornerRadius = CornerRadius(x = height / 2, y = height / 2),
                size = Size(width * value, height)
            )
        }


        // Thumb
        Box(
            modifier = Modifier
                .offset(
                    x = ((width * value - (thumbRadiusPx + height) / 2).coerceIn(
                        0f,
                        width - thumbRadiusPx
                    ) / density.density).dp
                )
                .size(width = thumbRadius, height = height.dp)
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = thumbInVector,
                contentDescription = null,
                modifier = Modifier.size(thumbRadius),
                tint = thumbTint
            )
        }
    }
}

@Composable
fun VolumeSlider(modifier: Modifier = Modifier) {
    VolumeSliderImpl(
        modifier = modifier,
        value = 0.9f,
        trackHeight = 80.dp,
        activeColor = VolumeActiveTrackColor,
        inactiveColor = VolumeInactiveTrackColor,
        thumbTint = VolumeThumbColor,
        thumbRadius = 34.dp
    )
}

@Preview
@Composable
fun VolumeSliderPreview(modifier: Modifier = Modifier) {
    VolumeSlider()
}
