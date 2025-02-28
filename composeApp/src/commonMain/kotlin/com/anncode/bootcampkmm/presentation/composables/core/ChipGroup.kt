package com.anncode.bootcampkmm.presentation.composables.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun <T> ChipGroup(
    shape: Shape = RoundedCornerShape(20.dp),
    modifier: Modifier = Modifier.size(50.dp),
    title: String? = null,
    elements: List<T>,
    initialState: Int,
    onChipSelected: (Int, T) -> Unit,
) {
    title?.let {
        Text(
            it,
            style = MaterialTheme.typography.titleMedium
        )
    }

    var chipSelectedState by rememberSaveable { mutableStateOf(0) }
    chipSelectedState = initialState
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    LazyRow (
        modifier = Modifier.fillMaxWidth().wrapContentHeight(),
        horizontalArrangement = Arrangement.spacedBy(3.dp),
        state = listState
    ) {

        itemsIndexed(
            items = elements
        ) { index, element ->
            FilterChip(
                selected = chipSelectedState == index,
                onClick = {
                    chipSelectedState = index
                    onChipSelected(index, element)
                },
                label = {
                    when {
                        element is ImageVector -> {
                            Icon(
                                painter = rememberVectorPainter(element),
                                contentDescription = "",
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        else -> {
                            Text(
                                text = element.toString(),
                                style = MaterialTheme.typography.titleSmall
                            )
                        }
                    }

                },
                shape = shape,
                modifier = modifier

            )
        }

        coroutineScope.launch {
            val element = if (chipSelectedState >= 3) chipSelectedState - 3 else 0
            listState.animateScrollToItem(index = element)
        }
    }

}


@Composable
fun <T> ChipGroupMultiselect(
    shape: Shape = RoundedCornerShape(20.dp),
    modifier: Modifier = Modifier.size(50.dp),
    title: String? = null,
    elements: List<T>,
    initialState: Set<Int> = setOf(),
    onChipSelected: (List<Int>) -> Unit,
) {
    var selectedChips by remember { mutableStateOf(initialState) }

    title?.let {
        Text(
            it,
            style = MaterialTheme.typography.titleMedium
        )
    }

    LazyRow (
        horizontalArrangement = Arrangement.spacedBy(3.dp)
    ) {

        elements.forEachIndexed { index, element ->
            item(index) {
                FilterChip(
                    selected = index in selectedChips,
                    onClick = {
                        if (index in selectedChips) {
                            selectedChips = selectedChips - setOf(index)
                        } else {
                            selectedChips = selectedChips + setOf(index)
                        }
                        onChipSelected(selectedChips.toList())
                    },
                    label = {
                        when {
                            element is ImageVector -> {
                                Icon(
                                    painter = rememberVectorPainter(element),
                                    contentDescription = "",
                                    modifier = Modifier.size(30.dp)
                                )
                            }

                            else -> {
                                Text(
                                    text = element.toString(),
                                    style = MaterialTheme.typography.titleSmall
                                )
                            }
                        }

                    },
                    shape = shape,
                    modifier = modifier

                )
            }
        }
    }

}