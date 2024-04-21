sealed class Screen(val route:String){
    object LoginScreen:Screen("loginscreen")
    object SignupScreen:Screen("signupscreen")
    object IntroScreen:Screen("introscreen")
    object HostScreen:Screen("hostscreen")
    object SearchScreen:Screen("searchscreen")

}