package uz.ayizor.armusic.android.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import uz.ayizor.armusic.android.models.Track
import uz.ayizor.armusic.android.theme.AppTheme
import uz.ayizor.armusic.android.ui.items.VerticalTrackItem


@Composable
fun HomeScreen() {
   AppTheme(darkTheme = false) {
       Surface {
           Column {
               RecentlyPlayedLazy()
           }
       }


   }




}
fun trackList(): ArrayList<Track> {
    val wordsList: ArrayList<Track> = ArrayList()
    val test_image_url = "https://firebasestorage.googleapis.com/v0/b/vodiy-polymer.appspot.com/o/07d6ed14-4c3b-4b3b-99bc-70e346020478?alt=media&token=aef458fc-6ac5-4b4b-81a1-bc7ab406f66a"
    for (i in 0..30) {
        wordsList.add(
            Track(
                "$i",
                "track artist$i",
                "track name$i",
                test_image_url
            )
        )
    }

    return wordsList
}

@Composable
fun RecentlyPlayedLazy() {
    LazyRow(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(trackList()) { lazyPosition, lazyItem ->
            VerticalTrackItem(
                lazyItem.track_image_url,
                lazyItem.track_name,
                lazyItem.track_artist
            )

        }
    }
}