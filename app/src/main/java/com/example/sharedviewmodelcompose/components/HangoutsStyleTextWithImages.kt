package com.example.sharedviewmodelcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import com.example.sharedviewmodelcompose.Greeting
import com.example.sharedviewmodelcompose.ui.theme.SharedViewModelComposeTheme

@Composable
fun HangoutsStyleTextWithImages(modifier: Modifier = Modifier) {
    /*Text(
        text = "Caption Text",
        style = MaterialTheme.typography.subtitle2
    )*/

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),


        ) {

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }
        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/1.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://www.gstatic.com/webp/gallery/4.jpg",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

        item {
            AsyncImage(
                model = "https://picsum.photos/48",
                contentDescription = null,
                modifier = Modifier.size(48.dp, 48.dp)
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun HangoutsStyleTextWithImagesPreview() {
    HangoutsStyleTextWithImages()
}