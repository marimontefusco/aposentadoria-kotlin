package com.example.proj01

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //chamando layout
        setContentView(R.layout.activity_main)

        // Objetos -> componentes da tela:
                ////////val radioFemale = findViewById<RadioButton>(R.id.radio_female)
                /////////val radioMale = findViewById<RadioButton>(R.id.radio_male)
        val spinnerSex = findViewById<Spinner>(R.id.spinner_sex)
        val inputAge = findViewById<EditText>(R.id.input_age)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)

        val outputResult = findViewById<TextView>(R.id.txt_output)

        // -----------------------------------------

        // ---- Campo feminino/masculino

        // Adaptador -> definindo campos
        val adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_dropdown_item,
            listOf("Feminino", "Masculino")
        )

        //Colocando responsabilidade para o objeto -> definindo variável
        spinnerSex.adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_spinner_dropdown_item,
            listOf("Feminino", "Masculino")
        )

        // Definindo para poder fazer a utilização
        spinnerSex.adapter = adapter

                ///////////////////////////////
                //perguntar pro prof: as linhas estão praticamente iguais!!!
                // (33-37) é igual à (39-42)!! é isso mesmo ou foi pensamento duplo
                // e somente a linha 45 é suficiente após a 36????

        // -----------------------------------------

        // ---- Btn Calcular
        btnCalculate.setOnClickListener {
            val spinChoosed = spinnerSex.selectedItem as String
            val age =  inputAge.text.toString().toInt()
            var result = 0

            if (spinChoosed == "Feminino") {
                result = 62 - age
            } else {
                result = 65 - age
            }

            outputResult.text = "Falta apenas $result anos!"
        }

        // -----------------------------------------

        // ---- Mudando de tela -> btn +
        val btnPlus = findViewById<Button>(R.id.btn_plus)
        btnPlus.setOnClickListener {
            val intent = Intent (
                this,
                SegundaTelaActivity::class.java
            )
            startActivity(intent)

        }

    }

}