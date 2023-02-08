package com.ircarren.jaumeexamen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ircarren.jaumeexamen.ui.theme.JaumeExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JaumeExamenTheme {
                // A surface container using the 'background' color from the theme
                TheApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TheApp() {
    Scaffold(bottomBar = { BottomBarNavigation() }) { paddingValues ->
        HomeScreen(paddingValues)
    }
}

@Composable
fun BottomBarNavigation() {

    var selectedItem by remember { mutableStateOf(0) }
    val items = MenuProvider.menuItems
    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.name) },
                label = { Text(item.name) },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
            )
        }
    }
}

@Composable
fun HomeScreen(paddingValues: PaddingValues) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
        Column {
            Header()
            StoriesBody()
            CoinBody()


        }


    }
}


@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center
    )
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "TOTAL BALANCE",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
            Text(text = "€ 26.966,80", style = MaterialTheme.typography.displaySmall)
            Text(
                text = "€ 325.80 (1.41%)",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.background
            )
        }
    }
}

@Composable
fun StoriesBody() {
    LazyRow() {
        items(CoinProvider.Crypto.size) { index ->
            StoriesItem(CoinProvider.Crypto[index])

        }
    }
}

@Composable
fun StoriesItem(crypto: Moneda) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = crypto._coinIcon),
            contentDescription = crypto._coinName,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
        )

        Text(text = crypto._coinName, textAlign = TextAlign.Center)

    }
}


@Composable
fun CoinBody() {
    LazyColumn() {
        items(CoinProvider.Crypto.size) { index ->
            CoinItem(CoinProvider.Crypto[index])

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoinItem(crypto: Moneda) {
    Card(
        modifier = Modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = crypto._coinIcon),
                contentDescription = crypto._coinName,
                modifier = Modifier.padding(8.dp)
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = crypto._coinName,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(text = crypto._coinSymbol, style = MaterialTheme.typography.bodySmall)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp), horizontalArrangement = Arrangement.End
            ) {
                Column(modifier = Modifier, horizontalAlignment = Alignment.End) {
                    Text(
                        text = crypto._coinPrice + " €",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = crypto._coinChange.toString() + "%",
                        style = MaterialTheme.typography.bodySmall,
                        color = if (crypto._coinChange >= 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error
                    )
                }

            }

        }
    }
}

