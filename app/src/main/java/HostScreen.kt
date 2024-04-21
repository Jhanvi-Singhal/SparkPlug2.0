import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.firebase.auth.ktx.auth
import com.google.firebase.auth.userProfileChangeRequest
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


@Composable
fun HostScreen(
    authViewModel: AuthViewModel
){

    var portname by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }

    var price by remember { mutableStateOf("50") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = portname,
            onValueChange = { portname = it },
            label = { Text("Name of port") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        OutlinedTextField(
            value = address,
            onValueChange = { address = it },
            label = { Text("Address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )

        OutlinedTextField(
            value = price,
            onValueChange = { price = it },
            label = { Text("Price/Unit") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)

        )

        Button(
            onClick = {
                val db = Firebase.firestore

                val data = hashMapOf("firstName" to portname)
                db.collection("users").document("abc@gmail.com")
                    .set(data, SetOptions.merge())

                portname = ""
                address = ""
                price = ""



            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("Host")
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}