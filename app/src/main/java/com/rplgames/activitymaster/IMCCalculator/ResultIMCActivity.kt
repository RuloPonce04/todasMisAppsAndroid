package com.rplgames.activitymaster.IMCCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.rplgames.activitymaster.IMCCalculator.ImcCalculatorActivity.Companion.IMC_KEY
import com.rplgames.activitymaster.R

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView

    private lateinit var btnRecalculate: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resolt_imcactivity)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: - 1.0

        initComponent()
        initUI(result)
        initListeners()
    }

    private fun initListeners() {
        btnRecalculate.setOnClickListener{
            onBackPressed()
        }
    }

    private fun initUI(result: Double) {

        tvIMC.text = result.toString()

        when(result){
            in 0.00..18.50 -> { //Peso bajo
                tvResult.text = getString(R.string.title_low_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.low_weight))
                tvDescription.text = getString(R.string.decription_low_weight)
            }
            in 18.51..24.99 ->{ //Peso normal
                tvResult.text = getString(R.string.title_very_good_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.good_weight))
                tvDescription.text = getString(R.string.decription_very_good_weight)
            }
            in 25.00..29.99 ->{ //sobrepeso
                tvResult.text = getString(R.string.title_good_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.lot_weight))
                tvDescription.text = getString(R.string.decription_good_weight)
            }
            in 30.00..99.99 ->{ //obecidad
                tvResult.text = getString(R.string.title_very_lot_weight)
                tvResult.setTextColor(ContextCompat.getColor(this,R.color.very_lot_weight))
                tvDescription.text = getString(R.string.decription_very_lot_weight)
            }
            else -> { //error ResultIMCActivity
                tvResult.text = getString(R.string.error)
                tvIMC.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }
        }
    }

    private fun initComponent() {
        tvResult = findViewById(R.id.tvResult)
        tvIMC = findViewById(R.id.tvIMC)
        tvDescription = findViewById(R.id.tvDescription)

        btnRecalculate = findViewById(R.id.btnRecalculate)
    }



}