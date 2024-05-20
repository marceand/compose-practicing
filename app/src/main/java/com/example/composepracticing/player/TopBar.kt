package com.example.composepracticing.player

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.composepracticing.R
import com.example.composepracticing.ui.theme.AppBackground
import com.example.composepracticing.ui.theme.ArrowBackColor
import com.example.composepracticing.ui.theme.TitleTopBarColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        colors = topAppBarColors(
            containerColor = AppBackground
        ),
        title = { Text(text = stringResource(R.string.now_playing), color = TitleTopBarColor) },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = stringResource(R.string.back),
                    tint = ArrowBackColor
                )
            }
        }
    )

}