package com.example.continuada1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Cadastrar (componente:View) {
        when {
            text.text.isEmpty() || text2.text.isEmpty() || text3.text.isEmpty() -> {
                Toast.makeText(this, "Obrigatório preencher todos os campos", Toast.LENGTH_SHORT).show()
                return
            }
        }

        val email = text.text.toString()
        val priSenha = text2.text.toString().toInt()
        val segSenha = text3.text.toString().toInt()

        when{
            email == "@gmail.com" -> {
                Toast.makeText(this, "Digite seu e-mail completo!", Toast.LENGTH_SHORT).show()
                return
            }
            priSenha > 6 ->{
                Toast.makeText(this, "A senha deve conter mais de 6 caracteres!", Toast.LENGTH_SHORT).show()
                return
            }
            segSenha == priSenha -> {
                Toast.makeText(this, "As senhas devem ser iguais!", Toast.LENGTH_SHORT).show()
                return
            }
        }
    }
}