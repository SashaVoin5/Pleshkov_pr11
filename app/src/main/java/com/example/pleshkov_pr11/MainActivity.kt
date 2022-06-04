package com.example.pleshkov_pr11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onCheckboxClicked(view: View) {

        val checkBox = view as CheckBox
        // Получаем, отмечен ли данный флажок
        if (checkBox.isChecked) {
        }
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }



}
