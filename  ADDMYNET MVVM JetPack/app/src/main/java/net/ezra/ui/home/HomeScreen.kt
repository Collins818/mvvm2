package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_VIEW_STUDENTS

@Composable
fun HomeScreen(navController: NavHostController) {


    Box (modifier = Modifier
        .fillMaxWidth()
        .fillMaxSize()
        .background(color = Color.Black)
        .padding(50.dp),
        contentAlignment = Alignment.Center){


//        Image(painter = painterResource(id = R.drawable.xx) , contentDescription = "",
//            modifier = Modifier
//                .fillMaxSize(),
//            contentScale = ContentScale.Crop)




        Column(



            modifier = Modifier
//                .fillMaxSize()
////                .fillMaxWidth()
////                .wrapContentHeight()
//                .padding(50.dp)
////                .padding(top = 0.dp)

        ){

            Image(
                painter = painterResource(id = R.drawable.pic),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier
                .height(50.dp))




//            Text(text = stringResource(id = R.string.mit))

               Text(text = "Manage your financial future", color = Color(0xff209fbe ), fontSize = 30.sp)
            Row {
                Text(text = "A reliable tool to manage your personal finance", color = Color(0xff209fbe ), fontSize = 10.sp)
            }
            Row {

                Image(
                    painter = painterResource(id = R.drawable.on),
                    contentDescription ="High 2",
                    modifier = Modifier

                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )
                Image(
                    painter = painterResource(id = R.drawable.on),
                    contentDescription ="High 2",
                    modifier = Modifier

                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )

                Image(
                    painter = painterResource(id = R.drawable.on),
                    contentDescription ="High 2",
                    modifier = Modifier

                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop

                )




            }



            Spacer(modifier = Modifier
                .height(20.dp))
            Button(onClick = {
                navController.navigate(ROUTE_ABOUT) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            },
                colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
                )


            {

                Text(text = "Get started",color= Color.Black)

                Image(
                    painter = painterResource(id = R.drawable.aro),
                    contentDescription = "",
                    modifier = Modifier
                        .background(color = Color(0xff209fbe))
                        .size(20.dp)
                        .clip(shape = CircleShape)


                )

            }




//            Text(
//                modifier = Modifier
//                    .clickable {
//                        navController.navigate(ROUTE_ABOUT) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                text = "about"
//            )


//
//            Text(
//                modifier = Modifier
//                    .clickable {
//                        navController.navigate(ROUTE_CONTACT) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                text = "Contact"
//            )
//
//            Card(
//                colors = CardDefaults.cardColors(Color(0xffE52C04)),
//                elevation = CardDefaults.cardElevation(5.dp)
//
//            ) {
//
//
//
//            }
//
//
//            Text(
//                modifier = Modifier
//                    .clickable {
//                        navController.navigate(ROUTE_PRODUCTS) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                text = "go to products screen"
//
//            )
//
//            Button(onClick = {
//                navController.navigate(ROUTE_MIT) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }}) {
//
//                Text(text = "fuurye")
//
//            }
//
//            Text(
//                modifier = Modifier
//
//                    .clickable {
//                        navController.navigate(ROUTE_MIT) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                text = "go to mit",
//                textAlign = TextAlign.Center,
//                color = MaterialTheme.colorScheme.onSurface
//            )
//
//            Text(
//                modifier = Modifier
//                    .clickable {
//                        navController.navigate(ROUTE_SHOP) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//                    },
//                text = "go to shop screen",
//                textAlign = TextAlign.Center,
//                color = MaterialTheme.colorScheme.onSurface
//            )
//
//            Spacer(modifier = Modifier.height(10.dp))
//
//
//
//            OutlinedButton(onClick = {
//
//                navController.navigate(ROUTE_ADD_STUDENTS) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            }) {
//
//                Text(text = "Add Students")
//
//            }
//
//
//            OutlinedButton(onClick = {
//
//                navController.navigate(ROUTE_VIEW_STUDENTS) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            }) {
//
//                Text(text = "STUE")
//
//            }







        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

