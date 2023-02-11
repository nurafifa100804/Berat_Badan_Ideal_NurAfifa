package com.example.beratbadanidealnurafifa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nama : EditText
    private lateinit var tinggiBadan : EditText
    private lateinit var jklaki_laki : RadioButton
    private lateinit var jkPerempuan : RadioButton
    private lateinit var Hitung : TextView
    private lateinit var Hasil : TextView
    private var tb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.InputNama)
        tinggiBadan = findViewById(R.id.InputTB)
        jklaki_laki = findViewById(R.id.rblakilaki)
        jkPerempuan = findViewById(R.id.rbperempuan)
        Hitung = findViewById(R.id.btnHitung)
        Hasil = findViewById(R.id.txtHasil)

        Hitung.setOnClickListener {

            var tinggi = tinggiBadan.text.toString().toInt()

            if (jklaki_laki.isChecked){
                tb =(tinggi - 100 ) - ((tinggi - 100) * 10/100)
                Hasil.setText(tb.toString()+"kg")

            } else{
                tb = (tinggi - 100) - ((tinggi- 100)* 15/100)
                Hasil.setText(tb.toString()+"kg")
            }
        }
    }
}