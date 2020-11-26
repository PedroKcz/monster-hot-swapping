package com.pedrokcz.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.ripple.RippleIndication
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.pedrokcz.domain.entity.Monster
import dev.chrisbanes.accompanist.coil.CoilImage
import org.koin.androidx.compose.getViewModel

@Composable
fun HomeView(
    viewModel: HomeViewModel = getViewModel()
) {
    viewModel.interact(HomeEvent.Opened)
    val state = viewModel.state.collectAsState()

    LazyColumnFor(items = state.value.monsters) { item ->
        MonsterCard(item)
    }
}

@Composable
private fun MonsterCard(item: Monster) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 4.dp,
        modifier = Modifier.padding(16.dp).fillMaxWidth().clickable(
            indication = RippleIndication(color = Color.Gray),
            onClick = { }
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(12.dp)) {
            CoilImage(item.photo, modifier = Modifier.preferredSize(40.dp, 40.dp))
            Text(
                text = item.name,
                fontSize = TextUnit(18),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}
