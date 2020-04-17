package com.example.testapp

import android.R.layout
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // + 버튼
        BtnAdd.setOnClickListener {
            if (Edit1.text.toString() == "" || Edit2.text.toString() == ""){
                Result.text = "숫자를 입력해주세요"
            } else {
                val x = Edit1.text.toString().toInt()
                val y = Edit2.text.toString().toInt()
                val result = x + y
                Result.text = result.toString()
            }
        }
        // - 버튼
        BtnSub.setOnClickListener {
            if (Edit1.text.toString() == "" || Edit2.text.toString() == ""){
                Result.text = "숫자를 입력해주세요"
            } else {
                val x = Edit1.text.toString().toInt()
                val y = Edit2.text.toString().toInt()
                val result = x - y
                Result.text = result.toString()
            }
        }
        // * 버튼
        BtnMulti.setOnClickListener {
            if (Edit1.text.toString() =="" || Edit2.text.toString()==""){
                Result.text="숫자를 입력해주세요"
            }else{
                val x = Edit1.text.toString().toInt()
                val y = Edit2.text.toString().toInt()
                val result = x * y
                Result.text = result.toString()
            }
        }

        // /버튼
        BtnDiv.setOnClickListener {
            if (Edit1.text.toString()=="" || Edit2.text.toString()==""){
                Result.text = "숫자를 입력해주세요"
            }else{
                val x = Edit1.text.toString().toDouble()
                val y = Edit2.text.toString().toDouble()
                val result = x / y
                Result.text = result.toString()
            }
        }

    }
}


