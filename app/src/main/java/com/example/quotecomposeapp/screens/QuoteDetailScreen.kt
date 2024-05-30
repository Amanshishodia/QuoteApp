package com.example.quotecomposeapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.quotecomposeapp.DataManager
import com.example.quotecomposeapp.R
import com.example.quotecomposeapp.models.Quotes

@Composable
fun QuoteDetails(quote:Quotes){

    BackHandler(){
        DataManager.switchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFffffff),
                        Color(0xFFE3E3E3)
                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(32.dp),
            shape = RoundedCornerShape(8.dp) // Adding a rounded corner for better visual appeal
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally, // Centering content horizontally
                modifier = Modifier.padding(16.dp, 24.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.quote),
                    contentDescription = "Quote",
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.text,
                    fontFamily = FontFamily.Monospace,
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.author,
                    fontFamily = FontFamily.Monospace,
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
    }
}