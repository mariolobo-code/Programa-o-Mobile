packge com.example.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceAtate: Bunle?) {
          super.onCreate(savedInstanceState)

          val texto = TextView(this)
          texto.text = getString(R.string.mensagem_principal)
          texto.textSize = 22f
          texto.setPadding(32, 32, 32,32)

          setContentView(texto)
    }
}
