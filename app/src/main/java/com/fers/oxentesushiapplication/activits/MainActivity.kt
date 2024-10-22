package com.fers.oxentesushiapplication.activits

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.Comida
import com.example.myapplication.data.ComidaViewModel
import com.fers.oxentesushiapplication.R
import com.fers.oxentesushiapplication.R.layout
import com.fers.oxentesushiapplication.fragments.MenuFragment
import com.fers.oxentesushiapplication.fragments.PromocoesFragment

class MainActivity : AppCompatActivity() {

    //data
    lateinit var comidaViewModel :  ComidaViewModel

    lateinit var titulo : TextView
    lateinit var button_Menu : Button
    lateinit var button_montar_Combo : Button
    lateinit var button_Promocoes : Button
    lateinit var button_Login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        inicializarElementos()
        var fragmentMenu = MenuFragment();
        var fragmentPromocoes = PromocoesFragment();
        button_Menu.setOnClickListener{
            val fragmentManager = supportFragmentManager.beginTransaction();
            fragmentManager.replace(R.id.fragmentContainerView, fragmentMenu)
            fragmentManager.commit();

        }

        comidaViewModel = ViewModelProvider(this).get(ComidaViewModel :: class.java)

        comidaViewModel.addComida(Comida(0, "Sushi de Lambari", "Um Sushi feito de Lambari"))
        comidaViewModel.addComida(Comida(0, "Temaki", "Arroz, salmão, enrolados em uma alga"))
        comidaViewModel.addComida(Comida(0, "Sushi Doce", "É sushi e é doce"))
        comidaViewModel.addComida(Comida(0, "Nigiri", "Peixe e arroz"))


        button_Promocoes.setOnClickListener{
            val fragmentManager = supportFragmentManager.beginTransaction();
            fragmentManager.replace(R.id.fragmentContainerView, fragmentPromocoes)
            fragmentManager.commit();

        }
        button_montar_Combo.setOnClickListener{
            val intent = Intent(
                this,
                MontarComboActivity::class.java
            )
            startActivity(intent)

        }

        //button_Cesta.setOnClickListener( vai para tela de cesta)
    }



    private fun inicializarElementos(){
        titulo = findViewById<TextView>(R.id.textView2)
        button_Menu = findViewById<Button>(R.id.button_menu)
        button_montar_Combo = findViewById<Button>(R.id.button_montar_combo)
        button_Promocoes = findViewById<Button>(R.id.button_promocoes)
        button_Login = findViewById<Button>(R.id.button_login)
    }
}