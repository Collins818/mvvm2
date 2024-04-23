package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP

@Composable
fun HomeScreen(navController: NavHostController) {

    Box (modifier = Modifier
        .fillMaxSize()
    )


    {
        Image(painter = painterResource(id = R.drawable.vin) , contentDescription = "",
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.Crop)


        LazyColumn (modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()){
         item {

             Column(
                 modifier = Modifier
//                     .fillMaxHeight()
//                     .fillMaxSize()
//                     .fillMaxWidth()
//            .wrapContentHeight()
//            .padding(10.dp)
//            .padding(top = 10.dp)
//                     .background(color = Color.White)
             ){

                 LazyRow{
                     item {
                         Icon(
                             imageVector = Icons.Default.Home, contentDescription = "",
                             Modifier
                                 .padding(top = 20.dp)
                                 .size(20.dp)
                                 .background(Color.Gray),
                             Color.Blue
                         )
                         Spacer(modifier = Modifier
                             .width(40.dp))



                         Row {
                             Image(
                                 painter = painterResource(id = R.drawable.ab),
                                 contentDescription = "",
                                 modifier = Modifier
                                     .padding(top = 20.dp)
                                     .background(color = Color(0Xff0f3571))
                                     .size(19.dp)




                             )

                             Text(
                                 modifier = Modifier
                                     .padding(top = 20.dp)

                                     .clickable {
                                         navController.navigate(ROUTE_ABOUT) {
                                             popUpTo(ROUTE_HOME) { inclusive = true }
                                         }
                                     },
                                 text = "about",
                                 textAlign = TextAlign.Center,
                                 color = Color(0xff17d9d2 ),
                                 fontFamily = FontFamily.Cursive

                             )
                         }

                         Spacer(modifier = Modifier
                             .width(20.dp))

                         Row {
                             Image(
                                 painter = painterResource(id = R.drawable.eve),
                                 contentDescription = "",
                                 modifier = Modifier
                                     .padding(top = 20.dp)
                                     .background(color = Color(0Xff0f3571))
                                     .size(19.dp)

                             )

                             Text(
                                 modifier = Modifier
                                     .padding(top = 20.dp)

                                     .clickable {
                                         navController.navigate(ROUTE_EVENING) {
                                             popUpTo(ROUTE_HOME) { inclusive = true }
                                         }
                                     },
                                 text = "evening",
                                 textAlign = TextAlign.Center,
                                 color = Color(0xff17d9d2 ),
                                 fontFamily = FontFamily.Cursive
                             )

                         }
                         Spacer(modifier = Modifier
                             .width(20.dp))

                         Row {
                             Image(
                                 painter = painterResource(id = R.drawable.log),
                                 contentDescription = "",
                                 modifier = Modifier
                                     .padding(top = 20.dp)
                                     .background(color = Color(0Xff0f3571))
                                     .size(19.dp)

                             )



                             Text(
                                 modifier = Modifier
                                     .padding(top = 20.dp)

                                     .clickable {
                                         navController.navigate(ROUTE_LOGIN) {
                                             popUpTo(ROUTE_HOME) { inclusive = true }
                                         }
                                     },
                                 text = "Login",
                                 textAlign = TextAlign.Center,
                                 color = Color(0xff17d9d2 ),
                                 fontFamily = FontFamily.Cursive
                             )
                         }


                         Spacer(modifier = Modifier
                             .width(20.dp))


                         Row {
                             Image(
                                 painter = painterResource(id = R.drawable.sen),
                                 contentDescription = "",
                                 modifier = Modifier
                                     .padding(top = 20.dp)
                                     .background(color = Color(0Xff0f3571))
                                     .size(19.dp)

                             )


                             Text(
                                 modifier = Modifier
                                     .padding(top = 20.dp)

                                     .clickable {
                                         navController.navigate(ROUTE_SIGNUP) {
                                             popUpTo(ROUTE_HOME) { inclusive = true }
                                         }
                                     },
                                 text = "Sign up",
                                 textAlign = TextAlign.Center,
                                 color = Color(0xff17d9d2 ),
                                 fontFamily = FontFamily.Cursive,

                                 )
                         }












                     }










                 }
                 Spacer(modifier = Modifier
                     .height(10.dp))


                 Image(
                     painter = painterResource(id = R.drawable.logo),
                     contentDescription = "",
                     modifier = Modifier
                         .padding(top = 20.dp)
                         .background(color = Color(0Xff0f3571))
                         .size(500.dp)


                 )






             }

         }



        }








    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

