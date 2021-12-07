package com.example.stih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Page1<View> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
    }
    fun button(view: View) {
        val myToast = Toast.makeText(this, "Начинаем!", Toast.LENGTH_SHORT)
        myToast.show()
        val randomIntent = Intent(this, Page1::class.java)
        startActivity(randomIntent)
    }

}