import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(
    navController: NavHostController,
    authViewModel: AuthViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screen.IntroScreen.route
    ) {
        composable(Screen.IntroScreen.route){
            IntroScreen(
                authViewModel = authViewModel,
                onNavigateToSignUp = { navController.navigate(Screen.SignupScreen.route) },
                onNavigateToLogin = { navController.navigate(Screen.LoginScreen.route)})
        }
        composable(Screen.SignupScreen.route) {
            SignUpScreen(
                authViewModel = authViewModel,
                onNavigateToLogin = { navController.navigate(Screen.LoginScreen.route) }
            )
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(
                authViewModel = authViewModel,
                onNavigateToSignUp = { navController.navigate(Screen.SignupScreen.route)},
                onSignInSuccess= { navController.navigate(Screen.SearchScreen.route)}
            )
        }
        composable(Screen.SearchScreen.route) {
            SearchScreen(
                authViewModel = authViewModel,
                onNavigateToHost = { navController.navigate(Screen.HostScreen.route)}
            )
        }
        composable(Screen.HostScreen.route) {
            HostScreen(
                authViewModel = authViewModel

            )
        }
    }
}