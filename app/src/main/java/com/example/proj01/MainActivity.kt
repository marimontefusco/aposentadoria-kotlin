package com.example.proj01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn_mais: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //chamando layout
        setContentView(R.layout.activity_main)

        // Objetos -> componentes da tela:
        val radioFemale = findViewById<RadioButton>(R.id.radio_female)
        val radioMale = findViewById<RadioButton>(R.id.radio_male)
        val inputAge = findViewById<EditText>(R.id.input_age)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)
        val btnPlus = findViewById<Button>(R.id.btn_plus)
        val output = findViewById<TextView>(R.id.txt_output)


    }


}