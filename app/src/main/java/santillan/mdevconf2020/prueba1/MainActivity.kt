package santillan.mdevconf2020.prueba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


const val EXTRA_MESSAGE = "santillan.mdevconf2020.prueba1.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Los nombres de las activitys sera en CamelCase: ArielSantillan

        botonIngresar.setOnClickListener{
            val intent =Intent(this, MainMenu::class.java)
            startActivity(intent)
        }


    }


    /** Called when the user taps the Send button */
//    fun sendMessage(view: View) {
//        val editText = findViewById<EditText>(R.id.Name)
//        val message = editText.text.toString()
//        val intent = Intent(this, MenuActivity2::class.java).apply {
//            putExtra(EXTRA_MESSAGE, message)
//        }
//        startActivity(intent)
//    }
}