package net.ezra.ui.evening



import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME

@Composable
fun EveningScreen(navController: NavHostController) {
    Box {


        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxSize()
                .fillMaxWidth()
//            .wrapContentHeight()
//            .padding(10.dp)
//            .padding(top = 10.dp )

        ){

            Text(
                modifier = Modifier

                    .clickable {
                        navController.navigate(ROUTE_ABOUT) {
                            popUpTo(ROUTE_EVENING) { inclusive = true }
                        }
                    },
                text = "about",
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )

            Text(
                modifier = Modifier

                    .clickable {
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_EVENING) { inclusive = true }
                        }
                    },
                text = "Home",
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onSurface
            )






        }






    }


}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

