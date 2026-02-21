package com.ezhar.jetpack_compose_android.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ezhar.jetpack_compose_android.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu icon",
                tint = Color(0xFF27214D),
                modifier = Modifier.size(24.dp)
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Image(
                    painter = painterResource(R.drawable.shopping_basket),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text("My Basket", fontSize = 12.sp, color = Color(0xFF272140))
            }
        }

        // Greetings
        Text(
            text = "Hello Tony, What Fruit Salad Combo Do You Want Today?",
            fontWeight = FontWeight.Medium,
            color = Color(0xFF272140),
            lineHeight = 28.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // SearchBar (Custom)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xFFF3F1F1),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Color(0xFF86869E),
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = "Search For Fruit Salad Combo",
                fontSize = 14.sp,
                color = Color(0xFF86869E)
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                painter = painterResource(R.drawable.filter_list),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )

        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Recommended Combo",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            items(count = 2) { index ->
                RecommendedComboCard(
                    name = if (index == 0) "Honey Limb Combo" else "Berry Mango Combo",
                    price = if (index == 0) "$100" else "$75",
                    imageRes = if (index == 0) R.drawable.food_1 else R.drawable.food_2
                )
            }
        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            items(listOf("Hottest", "Popular", "New Combo", "Top")) {category ->
                Text(
                    text = category,
                    fontSize = 14.sp,
                    fontWeight = if (category == "Hottest") FontWeight.Bold else FontWeight.Normal,

                )
            }
        }

    }
}

@Composable
fun RecommendedComboCard(modifier: Modifier = Modifier, name: String, price: String, imageRes: Int) {
    Card(
        modifier = Modifier.width(152.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier= Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = Modifier.size(20.dp)
                )
            }

            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterHorizontally)

            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = price,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8C42)
                )

                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = Modifier
                        .size(24.dp)
                        .background(color = Color(0xFFFFF2E7), shape = CircleShape)
                        .padding(4.dp)
                )
            }

        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun HomeScreenPrev(modifier: Modifier = Modifier) {
    HomeScreen()
//    RecommendedComboCard(
//        name = "FruitSalad",
//        price = "200",
//        imageRes = R.drawable.food_1
//    )
}