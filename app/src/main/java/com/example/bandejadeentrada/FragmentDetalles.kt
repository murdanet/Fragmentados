package com.example.bandejadeentrada

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentDetalle : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_detalle, container, false)
    }
    fun mostrarDetalle(texto: String) {
        val txtDetalle = view!!.findViewById(R.id.txtDetalle) as TextView
        txtDetalle.text = texto
    }
}
