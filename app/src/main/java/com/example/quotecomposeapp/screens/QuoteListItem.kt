package com.example.quotecomposeapp.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp


import androidx.compose.ui.draw.rotate

import androidx.compose.ui.graphics.ColorFilter

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.quotecomposeapp.R
import com.example.quotecomposeapp.models.Quotes

@Preview
@Composable
fun QuoteListItem(quote:Quotes,onClick:(quote:Quotes)->Unit) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.padding(8.dp).clickable { onClick(quote) }

    )
    {

        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(R.drawable.quote),
                contentDescription = "Quote",
                colorFilter = ColorFilter.tint(
                    Color.White
                ),
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180F)
                    .background(Color.Black)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = quote.text,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp)
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Thin,
                    modifier = Modifier.padding(top = 4.dp)


                )

            }
        }

    }
}



