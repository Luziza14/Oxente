package com.fers.oxentesushiapplication.activits

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fers.oxentesushiapplication.R
import com.fers.oxentesushiapplication.fragments.MenuFragment
import com.fers.oxentesushiapplication.fragments.PromocoesFragment

class MontarComboActivity : AppCompatActivity() {


    lateinit var titulo : TextView
    lateinit var button_telaInicial : Button
    lateinit var button_montar_Combo_noCombo: Button
    lateinit var button_cesta2: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_montar_combo)

        inicializarElementos()


        button_telaInicial.setOnClickListener{
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)

        }



        //button_Cesta.setOnClickListener( vai para tela de cesta)
    }
    private fun inicializarElementos(){
        titulo = findViewById<TextView>(R.id.textView6)
        button_telaInicial = findViewById<Button>(R.id.button_telaInicial)

        button_cesta2 = findViewById<Button>(R.id.button_cesta2)
        button_montar_Combo_noCombo = findViewById<Button>(R.id.button_montar_combo_nocombo)

    }
}