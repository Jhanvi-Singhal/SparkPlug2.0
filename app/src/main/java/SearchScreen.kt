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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SearchScreen(
    authViewModel: AuthViewModel,
    onNavigateToHost:()->Unit){
    Column(modifier= Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Search for nearby ports") }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onNavigateToHost() }) {
            Text(text = "Host a port")
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}