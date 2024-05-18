package ua.frist008.n4k.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ua.frist008.n4k.ui.component.RootComponent
import ua.frist008.n4k.ui.theme.RootTheme

class SingleActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RootTheme {
                RootComponent()
            }
        }
    }
}
