package com.example.visualnovelcat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.visualnovelcat.ui.theme.VisualNovelCatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualNovelCatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeNavigation()
                }
            }
        }
    }
}

//Navigation---------------------------------------------------------------------------------------
@Composable
fun ComposeNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "S_1"){
        composable("S_1"){
            Android_1(navController)
        }
        composable("S_2"){
            Android_2(navController)
        }
        composable("S_3"){
            Android_3(navController)
        }
        composable("S_4"){
            Android_4(navController)
        }
        composable("S_5"){
            Android_5(navController)
        }
        composable("S_6"){
            Android_6(navController)
        }
        composable("S_7"){
            Android_7(navController)
        }
        composable("S_8"){
            Android_8(navController)
        }
        composable("S_9"){
            Android_9(navController)
        }
        composable("S_10"){
            Android_10(navController)
        }
        composable("S_11"){
            Android_11(navController)
        }
        composable("S_12"){
            Android_12(navController)
        }
        composable("S_13"){
            Android_13(navController)
        }
        composable("S_14"){
            Android_14(navController)
        }
    }

}

//Android - 1---------------------------------------------------------------------------------------
@Composable
fun Android_1(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )

        Text(
            modifier = Modifier
                .background(Color(0xFF73AAC7))
                .fillMaxWidth()
                .padding(40.dp)
                .offset(x = 60.dp),
            text = "My Visual Novel",
            fontSize = 30.sp,
            color = White
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 200.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),

            onClick = { navHostController.navigate("S_2") }
        ) {
            Text(
                "Start",
                fontWeight = FontWeight.Bold,
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Android_1_Preview() {
    val navController = rememberNavController()
    VisualNovelCatTheme {
        Android_1(navController)
    }
}

//Android - 2---------------------------------------------------------------------------------------
@Composable
fun Android_2(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Image(
            painter = painterResource(id = R.drawable.stand_cat),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .offset(y = 120.dp, x = (-70).dp),
        )

        Text(
            modifier = Modifier
                .background(Color(0xFF73AAC7))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 30.dp),
            text = "Hello! My name is Jack. And you?",
            color = White
        )

        var text by remember { mutableStateOf("") }

        TextField(
            value = "Input your name...",
            onValueChange = { newText -> text = newText },
            singleLine = true,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(56.dp)
                .offset(y = 220.dp)
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_3") }

        ) {
            Text(
                "Accept",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_2_Preview() {
    val navController = rememberNavController()
    VisualNovelCatTheme {
        Android_2(navController)
    }
}

//Android - 3---------------------------------------------------------------------------------------
@Composable
fun Android_3(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Image(
            painter = painterResource(id = R.drawable.stand_cat),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .offset(y = 120.dp, x = (-70).dp),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 10.dp),
            text = "Great, <username>! What we are going to do?",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 180.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_4") }

        ) {
            Text(
                "Walking",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_5") }

        ) {
            Text(
                "Hiking",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_6") }

        ) {
            Text(
                "Go to the field",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_3_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_3(navController)
    }
}

//Android - 4---------------------------------------------------------------------------------------
@Composable
fun Android_4(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_cats_run),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 110.dp),
            text = "May be, go home?",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_7") }

        ) {
            Text(
                "Hiking",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_8") }

        ) {
            Text(
                "Go to the field",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_4_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_4(navController)
    }
}


//Android - 5---------------------------------------------------------------------------------------
@Composable
fun Android_5(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 110.dp),
            text = "May be, go home?",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_7") }

        ) {
            Text(
                "Hiking",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_8") }

        ) {
            Text(
                "Go to the field",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_5_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_5(navController)
    }
}

//Android - 6---------------------------------------------------------------------------------------
@Composable
fun Android_6(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_grand_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 80.dp),
            text = "You are sad... Let’s go home?",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_7") }

        ) {
            Text(
                "May be, let’s watch the film?",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_8") }

        ) {
            Text(
                "Yes, let’s celebrate the Halloween",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_6_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_6(navController)
    }
}


//Android - 7---------------------------------------------------------------------------------------
@Composable
fun Android_7(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_watching_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 100.dp),
            text = "Do you like this film?",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_9") }

        ) {
            Text(
                "I like it!",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_10") }

        ) {
            Text(
                "No...",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_7_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_7(navController)
    }
}


//Android - 8---------------------------------------------------------------------------------------
@Composable
fun Android_8(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_helping_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 130.dp),
            text = "Very beautiful!",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_7") }

        ) {
            Text(
                "Yes! Let’s watch the film!",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_11") }

        ) {
            Text(
                "Yes! Let’s create costume!",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_8_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_8(navController)
    }
}

//Android - 9---------------------------------------------------------------------------------------
@Composable
fun Android_9(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_watching_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 110.dp),
            text = "Great! It’s time to sleep...",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_14") }

        ) {
            Text(
                "Yes, it’s too late...",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_9_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_9(navController)
    }
}

//Android - 10--------------------------------------------------------------------------------------
@Composable
fun Android_10(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_watching_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 110.dp),
            text = "May be go sleep?",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_14") }

        ) {
            Text(
                "Yes, it’s too late...",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_10_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_10(navController)
    }
}

//Android - 11--------------------------------------------------------------------------------------
@Composable
fun Android_11(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_drinking_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 130.dp),
            text = "I like your costume.",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_12") }

        ) {
            Text(
                "Your costume is beautiful too!",
                fontWeight = FontWeight.Bold,
            )
        }
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 300.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_13") }

        ) {
            Text(
                "To tell you the truth, I don’t like your...",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_11_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_11(navController)
    }
}

//Android - 12--------------------------------------------------------------------------------------
@Composable
fun Android_12(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_drinking_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(x = 100.dp),
            text = "Thank you! Let’s go to sleep.",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_14") }

        ) {
            Text(
                "Yes, it’s too late...",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_12_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_12(navController)
    }
}

//Android - 13--------------------------------------------------------------------------------------
@Composable
fun Android_13(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.two_drinking_cats),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )
        Text(
            modifier = Modifier
                .background(Color(0xFF275168))
                .fillMaxWidth()
                .padding(10.dp)
                .offset(10.dp),
            text = "It’s ok, i’m not taking offence. Let’s go to sleep!",
            color = White
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 240.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF73AAC7)),
            shape = RoundedCornerShape(0),
            onClick = { navHostController.navigate("S_14") }

        ) {
            Text(
                "Yes, it’s too late...",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_13_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_13(navController)
    }
}

//Android - 14--------------------------------------------------------------------------------------
@Composable
fun Android_14(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize(),
        )

        Text(
            modifier = Modifier
                .background(Color(0xFF73AAC7))
                .fillMaxWidth()
                .padding(40.dp)
                .offset(x = 20.dp),
            text = "Thank you for playing!",
            fontSize = 30.sp,
            color = White
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = 200.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF275168)),
            shape = RoundedCornerShape(0),

            onClick = { navHostController.navigate("S_1") }
        ) {
            Text(
                "Repeat the game",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Android_14_Preview() {
 val navController = rememberNavController()
 VisualNovelCatTheme {
        Android_14(navController)
    }
}
//--------------------------------------------------------------------------------------------------