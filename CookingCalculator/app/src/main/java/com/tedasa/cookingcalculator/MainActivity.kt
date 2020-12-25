package com.tedasa.cookingcalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tedasa.cookingcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculateMeasurement() }
    }

    private fun calculateMeasurement(){
        val stringInTextField = binding.measuredUnit.text.toString()
        val measureUnit =stringInTextField.toDoubleOrNull()
        val measurementMethod = when (binding.convertOption.checkedRadioButtonId){
            R.id.ounce_to_gram -> 1
            else -> 0
        }
        if (measureUnit == null) {
            displayMeasurement(0.0, measurementMethod)
            return
        }
        var measurement = when (measurementMethod) {
            1 -> measureUnit * 28.35
            else -> measureUnit * 29.57
        }
        displayMeasurement(measurement, measurementMethod)
    }
    private fun displayMeasurement(measurement : Double, method : Int){
        if(method == 1) binding.measurementResult.text = getString(R.string.result_gr).format(measurement)
        else binding.measurementResult.text = getString(R.string.result_ml).format(measurement)
    }
}