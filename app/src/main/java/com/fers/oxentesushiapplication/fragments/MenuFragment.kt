package com.fers.oxentesushiapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fers.oxentesushiapplication.R
import com.fers.oxentesushiapplication.adapter.ItemMenuAdapter


class MenuFragment : Fragment() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view =  inflater.inflate(R.layout.fragment_menu, container, false)
        recyclerView = view.findViewById(R.id.itens_recycle)
        val itens = listOf("descricao 1", "descricao 2")
        recyclerView.adapter = ItemMenuAdapter(itens)
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view;
    }

    private fun inicializarElementos(){

    }
}