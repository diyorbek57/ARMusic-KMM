package uz.ayizor.armusic.android.ui.items

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun VerticalTrackItem(imageUrl: String, trackName: String, artistName: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentWidth(Alignment.CenterHorizontally)
            .wrapContentHeight(Alignment.CenterVertically)
            .padding(10.dp)
    ) {


        CoilImage(
            imageModel = { imageUrl }, // loading a network image or local resource using an URL.
            imageOptions = ImageOptions(
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            ), modifier = Modifier.size(120.dp).clip(shape = RoundedCornerShape(15.dp))

        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.Start)
                .widthIn(0.dp, 120.dp),
            contentAlignment = Alignment.BottomStart
        ) {

            Text(
                text = "$trackName - $artistName",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }


}

@Preview(name = "Item words")
@Composable
fun VerticalTrackItemPreview() {
}