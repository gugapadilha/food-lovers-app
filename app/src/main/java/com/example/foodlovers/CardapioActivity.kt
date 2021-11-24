package com.example.foodlovers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cardapio.*

class CardapioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardapio)

        cv_pizza.setOnClickListener {
            startActivity(Intent(this@CardapioActivity, PizzaActivity::class.java))
        }
    }
}