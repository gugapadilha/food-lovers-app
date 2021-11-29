package com.example.foodlovers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_cardapio.*
import kotlinx.android.synthetic.main.activity_pizza.*

class PizzaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        cb_pizza4_queijos.setOnClickListener {

                if (cb_pizza4_queijos.isChecked){
                    val snackbar: Snackbar =
                        Snackbar.make(cb_pizza4_queijos, "Adicionado ao carrinho!", Snackbar.LENGTH_LONG)
                    snackbar.show()

                }else {
                    cb_pizza4_queijos.setOnCheckedChangeListener {
                            buttonView, isChecked ->
                        Snackbar.make(cb_pizza4_queijos, "Removido do carrinho!", Snackbar.LENGTH_LONG).show()

                    }
                }
        }
        cb_pizza_portuguesa.setOnClickListener {

            if (cb_pizza_portuguesa.isChecked){
                val snackbar: Snackbar =
                    Snackbar.make(cb_pizza_portuguesa, "Adicionado ao carrinho!", Snackbar.LENGTH_LONG)
                snackbar.show()

            }else {
                cb_pizza_portuguesa.setOnCheckedChangeListener {
                        buttonView, isChecked ->
                    Snackbar.make(cb_pizza_portuguesa, "Removido do carrinho!", Snackbar.LENGTH_LONG).show()

                }
            }
        }
        cb_pizza_calabresa.setOnClickListener {

            if (cb_pizza_calabresa.isChecked){
                val snackbar: Snackbar =
                    Snackbar.make(cb_pizza_calabresa, "Adicionado ao carrinho!", Snackbar.LENGTH_LONG)
                snackbar.show()

            }else {
                cb_pizza_calabresa.setOnCheckedChangeListener {
                        buttonView, isChecked ->
                    Snackbar.make(cb_pizza_calabresa, "Removido do carrinho!", Snackbar.LENGTH_LONG).show()

                }
            }
        }
        cb_pizza_frango.setOnClickListener {

            if (cb_pizza_frango.isChecked){
                val snackbar: Snackbar =
                    Snackbar.make(cb_pizza_frango, "Adicionado ao carrinho!", Snackbar.LENGTH_LONG)
                snackbar.show()

            }else {
                cb_pizza_frango.setOnCheckedChangeListener {
                        buttonView, isChecked ->
                    Snackbar.make(cb_pizza_frango, "Removido do carrinho!", Snackbar.LENGTH_LONG).show()

                }
            }
        }
        cb_pizza_strogonoff.setOnClickListener {

            if (cb_pizza_strogonoff.isChecked){
                val snackbar: Snackbar =
                    Snackbar.make(cb_pizza_strogonoff, "Adicionado ao carrinho!", Snackbar.LENGTH_LONG)
                snackbar.show()

            }else {
                cb_pizza_strogonoff.setOnCheckedChangeListener {
                        buttonView, isChecked ->
                    Snackbar.make(cb_pizza_strogonoff, "Removido do carrinho!", Snackbar.LENGTH_LONG).show()

                }
            }
        }

        tv_irCarrinho.setOnClickListener {
            startActivity(Intent(this@PizzaActivity, CarrinhoActivity::class.java))
        }

    }
}