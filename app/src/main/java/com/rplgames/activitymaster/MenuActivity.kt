package com.rplgames.activitymaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.rplgames.activitymaster.IMCCalculator.ImcCalculatorActivity
import com.rplgames.activitymaster.firstApp.FirstAppActivity
import com.rplgames.activitymaster.superheroapp.SuperHeroListActivity
import com.rplgames.activitymaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludar=findViewById<Button>(R.id.btnSaludar)
        btnSaludar.setOnClickListener { navigateToSaludApp() }

        val btnIMC=findViewById<Button>(R.id.btnIMCApp)
        btnIMC.setOnClickListener { navigateToIMC() }

        val btnTodo=findViewById<Button>(R.id.btnTODO)
        btnTodo.setOnClickListener { navigateToTODO() }

        val btnSuperhero=findViewById<Button>(R.id.btnSuperhero)
        btnSuperhero.setOnClickListener { navigateToSuperHeroApp() }

    }

    private fun navigateToSuperHeroApp(){
        val intent=Intent(this,SuperHeroListActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODO(){
        val intent=Intent(this,TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp(){
        val intent=Intent(this,FirstAppActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToIMC(){
        val intent=Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }



}