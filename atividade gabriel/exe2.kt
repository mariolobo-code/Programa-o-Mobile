packge com.example.meuapp

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceAtate: Bunle?) {
          super.onCreate(savedInstanceState)

          val informações = """
            fabricante: ${Build.MANUFACTURER}
            Modelo: ${Build.MODEL}
            Android: ${Build.VERSION.RELEASE}
            SDK: ${Build.VERSION.SDK_INT}
            """,trimIndent()

                val texto = TextView(this)
                texto.text + informaçoes
                text0.textSize + 18f
                text0.setPadding(32, 32, 32, 32)

                setContentView(texto)
    }
}
            