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
import androidx.compose.ui.res.stringResource
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
            text = stringResource(R.string.my_visual_novel),
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
                stringResource(R.string.start),
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
            text = stringResource(R.string.hello_my_name_is_jack_and_you),
            color = White
        )

        var text by remember { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
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
                stringResource(R.string.accept),
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
            text = stringResource(R.string.great_username_what_we_are_going_to_do),
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
                stringResource(R.string.walking),
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
                stringResource(R.string.hiking),
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
                stringResource(R.string.go_to_the_field),
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
            text = stringResource(R.string.may_be_go_home),
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
                stringResource(R.string.hiking),
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
                stringResource(R.string.go_to_the_field),
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
            text = stringResource(R.string.may_be_go_home),
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
                stringResource(R.string.hiking),
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
                stringResource(R.string.go_to_the_field),
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
            text = stringResource(R.string.you_are_sad_let_s_go_home),
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
                stringResource(R.string.may_be_let_s_watch_the_film),
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
                stringResource(R.string.yes_let_s_celebrate_the_halloween),
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
            text = stringResource(R.string.do_you_like_this_film),
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
                stringResource(R.string.i_like_it),
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
                stringResource(R.string.no),
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
            text = stringResource(R.string.very_beautiful),
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
                stringResource(R.string.yes_let_s_watch_the_film),
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
                stringResource(R.string.yes_let_s_create_costume),
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
            text = stringResource(R.string.great_it_s_time_to_sleep),
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
                stringResource(R.string.yes_it_s_too_late),
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
            text = stringResource(R.string.may_be_go_sleep),
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
                stringResource(R.string.yes_it_s_too_late),
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
            text = stringResource(R.string.i_like_your_costume),
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
                stringResource(R.string.your_costume_is_beautiful_too),
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
                stringResource(R.string.to_tell_you_the_truth_i_don_t_like_your),
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
            text = stringResource(R.string.thank_you_let_s_go_to_sleep),
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
                stringResource(R.string.yes_it_s_too_late),
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
            text = stringResource(R.string.it_s_ok_i_m_not_taking_offence_let_s_go_to_sleep),
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
                stringResource(R.string.yes_it_s_too_late),
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
            text = stringResource(R.string.thank_you_for_playing),
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
                stringResource(R.string.repeat_the_game),
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