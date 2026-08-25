packge com.example.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceAtate: Bunle?) {
          super.onCreate(savedInstanceState)

          val mensagem + TextVieW(this)
          mensagem.text = "ola, Mobile!"
          mensagem.textSize = 24f

          setContentView(mensagem)
    }
}