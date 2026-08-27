package com.example.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceState: Bunle?) {
          super.onCreate(savedInstanceState)

          val mensagem = TextVieW(this)
          mensagem.text = "Olá, Mobile!"
          mensagem.textSize = 24f

          setContentView(mensagem)
    }
}
