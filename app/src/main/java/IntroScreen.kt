import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IntroScreen(
    authViewModel: AuthViewModel,
    onNavigateToSignUp:()->Unit,
    onNavigateToLogin:()->Unit){
    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("SPARK PLUG", fontSize = 50.sp, fontWeight = FontWeight.Bold, color=Color(129, 96, 255))
        Text("WELCOME", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("Have a better EV experience", fontSize = 15.sp,fontWeight = FontWeight.Bold)}
    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom){
        Button(onClick = { onNavigateToSignUp ()}) {
            Text(text = "Create an account") }
        Spacer(modifier = Modifier.height(16.dp))
        FilledTonalButton(onClick = { onNavigateToLogin() }) {
            Text(text = "Log In")
        }
        Spacer(modifier = Modifier.height(32.dp))
    }
}
