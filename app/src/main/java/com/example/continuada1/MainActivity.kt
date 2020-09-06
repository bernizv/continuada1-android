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
    fun Cadastrar (componente:View){
        Toast.makeText(this, "Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show()

        
    }
}