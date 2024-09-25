package pl.lambada.songsync.ui.screens.about.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import pl.lambada.songsync.R
import pl.lambada.songsync.ui.components.AboutItem
import pl.lambada.songsync.ui.components.SwitchItem

@Composable
fun MultiPersonSwitch(selected: Boolean, onToggle: (Boolean) -> Unit) {
    AboutItem(label = stringResource(id = R.string.multi_person_word_by_word)) {
        SwitchItem(
            label = stringResource(id = R.string.multi_person_word_by_word_summary),
            selected = selected,
            onClick = { onToggle(!selected) }
        )
    }
}