package com.rplgames.activitymaster.IMCCalculator

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.rplgames.activitymaster.R
import java.text.DecimalFormat
import kotlin.contracts.Returns
import kotlin.math.log

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean=true;
    private var isFemaleSelected: Boolean=false;
    private var currentWeight: Int = 65;
    private var currentAge: Int = 25;

    private var currentHeight: Int = 120

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private lateinit var tvHeight: TextView
    private lateinit var rsHeight: RangeSlider

    private lateinit var btnSubtractWeight: FloatingActionButton
    private lateinit var btnPlusWeight: FloatingActionButton
    private lateinit var tvWeight: TextView

    private lateinit var btnSubtractAge: FloatingActionButton
    private lateinit var btnPlusAge: FloatingActionButton
    private lateinit var tvAge: TextView

    private lateinit var btnCalculate:Button

    companion object{
        const val IMC_KEY = "IMC_RESULT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)
        initComponents();
        initListeners();
        initUI()
    }

    private fun initComponents(){
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFamale)
        tvHeight=findViewById(R.id.tvHeight)
        rsHeight=findViewById(R.id.rsHeight)



        btnSubtractWeight=findViewById(R.id.btnSubtractWeight)
        btnPlusWeight=findViewById(R.id.btnPlusWeight)
        tvWeight=findViewById(R.id.tvWeight)

        btnSubtractAge=findViewById(R.id.btnSubtractAge)
        btnPlusAge=findViewById(R.id.btnPlusAge)
        tvAge=findViewById(R.id.tvAge)

        btnCalculate=findViewById(R.id.btnCalculate)
    }


    private fun initListeners(){
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        viewFemale.setOnClickListener{
            changeGender()
            setGenderColor()
        }

        rsHeight.addOnChangeListener{_, value, _ ->

            val df = DecimalFormat("#.##")
            currentHeight = df.format(value).toInt()
            tvHeight.text="$currentHeight cm"
        }

        btnPlusWeight.setOnClickListener{
            currentWeight += 1
            setWeight()
        }
        btnSubtractWeight.setOnClickListener{
            currentWeight -= 1
            setWeight()
        }

        btnPlusAge.setOnClickListener{
            currentAge += 1
            setAge()
        }
        btnSubtractAge.setOnClickListener{
            currentAge -= 1
            setAge()
        }

        btnCalculate.setOnClickListener{

            val result = calculateIMC()
            navigateToResultIMC(result)
        }
    }

    private fun navigateToResultIMC(result: Double) {
        val intent = Intent(this, ResultIMCActivity::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }

    private fun calculateIMC():Double{
        val df = DecimalFormat("#.##")
        val resultIMC = df.format(currentWeight/(currentHeight.toDouble()/100 * currentHeight.toDouble()/100))
        return resultIMC.toDouble()
    }


    private fun setWeight(){
        tvWeight.text = currentWeight.toString()
    }

    private fun setAge(){
        tvAge.text = currentAge.toString()
    }

    private fun changeGender(){
        isMaleSelected=!isMaleSelected
        isFemaleSelected=!isFemaleSelected
    }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))

        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))

    }

    private fun getBackgroundColor(isSelectedComponent:Boolean):Int{
        val colorRefence = if(isSelectedComponent){
            R.color.background_component_selected

        }else{
            R.color.background_component

        }

        return ContextCompat.getColor(this,colorRefence)

    }

    private fun initUI(){
        setGenderColor()
        setWeight()
        setAge()
    }

}