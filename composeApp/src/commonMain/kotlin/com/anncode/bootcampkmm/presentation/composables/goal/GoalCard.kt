package com.anncode.bootcampkmm.presentation.composables.goal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.anncode.bootcampkmm.presentation.goal.UIEvent

@Composable
fun GoalCard(
    icon: ImageVector,
    title: String,
    description: String,
    isCompleted: Boolean,
    onComplete: (isCompleted: Boolean) -> Unit
) {
    var checkedState by rememberSaveable { mutableStateOf(false) }
    checkedState = isCompleted
    Card (
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.fillMaxWidth().padding(8.dp).wrapContentHeight(),
        onClick = {
            checkedState = !checkedState
            onComplete(checkedState)
        }
    ) {
        Row(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = rememberVectorPainter(icon),
                contentDescription = title,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))
            Column (
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    title,
                    style = MaterialTheme.typography.titleLarge,
                    textDecoration = if (checkedState) TextDecoration.LineThrough else null
                )
                Text(
                    description,
                    style = MaterialTheme.typography.bodyLarge,
                    textDecoration = if (checkedState) TextDecoration.LineThrough else null
                )
            }
            Checkbox(
                modifier = Modifier.size(18.dp),
                checked = checkedState,
                onCheckedChange = {
                    checkedState = it
                }
            )

        }
    }

}