package com.giovanni.dotaapplication.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.giovanni.dotaapplication.R
import com.giovanni.dotaapplication.core.commons.State
import com.giovanni.dotaapplication.data.model.Hero
import com.giovanni.dotaapplication.presentation.model.HeroUiModel
import com.giovanni.dotaapplication.presentation.viewmodel.HomeViewModel
import com.giovanni.dotaapplication.ui.theme.DotaColor
import com.giovanni.dotaapplication.ui.theme.DotaTheme

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {

    val dotaState by viewModel.dotaState.collectAsState()

    Scaffold(
        backgroundColor = Color(0xFFF2F2F2),
        topBar = {
            DotaTopbar()
        },
        content = {
            DotaContent(dotaState, it)
        }
    )
}

@Composable
fun DotaTopbar() {
    TopAppBar(
        contentPadding = PaddingValues(start = 20.dp),
        backgroundColor = DotaColor
    ) {
        Text(
            text = stringResource(id = R.string.dota_title),
            color = Color(0xFFFFFFFF),
            style = DotaTheme.typography.bodyLarge,
        )
    }
}

@Composable
fun onLoading() {

}

@Composable
fun onError() {

}

@Composable
fun DotaContent(
    state: State<List<HeroUiModel>>,
    paddingValues: PaddingValues,
) {
    when (state) {
        is State.Loading -> onLoading()
        is State.Error -> onError()
        is State.Success -> HeroList(heroes = state.data)
    }
}

@Composable
fun HeroList(
    heroes: List<HeroUiModel>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(
            items = heroes
        ) {
            DotaHeroItem(modifier, it)
        }
    }
}