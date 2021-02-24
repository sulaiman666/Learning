package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        makeColored(findViewById(R.id.constraint_layout))
    }

    fun makeColored(view: View){
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable._280px_albert_gleizes__1914__paysage_cubiste__oil_on_canvas__97_x_130_cm__published_in_der_sturm__5_october_1920)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<TextView>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<TextView>(R.id.box_five_text).setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}