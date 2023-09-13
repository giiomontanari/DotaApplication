package com.giovanni.dotaapplication.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.giovanni.dotaapplication.presentation.model.HeroUiModel
import com.giovanni.dotaapplication.ui.theme.DotaTheme

@Composable
fun DotaHeroItem(
    modifier: Modifier = Modifier,
    model: HeroUiModel
) {
    Surface(
        modifier = modifier
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 20.dp,)
            .padding(top = 16.dp, bottom = 8.dp)
    ) {
        Column {
            TopPart(model)
//            MiddlePart(Modifier.padding(top = 16.dp), model)
//            BottomPart(Modifier.padding(top = 16.dp), model)
        }
    }
}

@Composable
fun TopPart(model: HeroUiModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column {
            AsyncImage(
                model = "https://cdn.dota2.com/apps/dota2/images/heroes/${model.name}_full.png",
                contentDescription = null,
            )
            Text(
                text = model.name,
                style = DotaTheme.typography.body,
            )
        }
    }
}