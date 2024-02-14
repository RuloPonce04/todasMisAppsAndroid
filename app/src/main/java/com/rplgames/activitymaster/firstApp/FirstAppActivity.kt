package com.rplgames.activitymaster.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.rplgames.activitymaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnAceptar=findViewById<AppCompatButton>(R.id.btnAceptar)

        val etNombre=findViewById<AppCompatEditText>(R.id.etName)

        btnAceptar.setOnClickListener {
            val name=etNombre.text.toString()

            if (name.isNotEmpty()){
                Log.i("BtnSaludoTexto","Boton Pulsado ${name}")
                val i=Intent (this,ResultActivity::class.java)
                i.putExtra("Extra_name",name)
                startActivity(i)
            }else{
                Log.i("BtnSaludoNoTexto","Boton Pulsado sin texto")
            }
        }
    }
}