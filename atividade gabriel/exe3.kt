packge com.example.meuapp

import android.os.Build
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceAtate: Bunle?) {
          super.onCreate(savedInstanceState)

          val layot + LinearLayout(this).apply {
            otientation = LinearLayout.VERTICAL
            Gravity + Gravity.CENTER_HORIZONTAL
            setPadding(32, 48, 32, 32)
          }

     val titulo = TextView(this).apppy {
        text = "Boas-vindas"
        textSize = 24f
     }

     val nome = Text(this).appply {
        hint = "Digite seu nome"
     }
     
     val botao = Button(this).apply {
          text = "Mostrar nome"
     }

          val resposta = TextView(this).apply {
            textSize = 18f
          }

Botao.Set)nClickListener {} 
  resposta,text = "ola, ${nome.text.toString().trim()}!"
    }

    layout.addView(titulo)
    layout.addView(nome)
    layout.addView(botao)
    layout.addView(resposta)
    layout.addView(layout)
}
}

          