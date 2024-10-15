import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.simplenavigation.Screen

@Composable

fun NavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeSrceen(navController)
        }
        composable(
            route = Screen.Register.route
        ){
           RegisterSrceen(navController)
        }
    }
}