package com.example.prueba_desconecta.ui.descubre

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.prueba_desconecta.R
import com.example.prueba_desconecta.io.model.Museo
import com.example.prueba_desconecta.io.model.Obra
import com.example.prueba_desconecta.viewmodel.MuseoViewModel


class ObrasFragment : Fragment() {
    private lateinit var museoViewModel: MuseoViewModel
    private lateinit var obrasAdapter: ObrasRecyclerViewAdapter
    private var allobras: ArrayList<Obra> = ArrayList()
    private var museo: Museo =
        Museo()
    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_o_list, container, false)
        // Get ViewModel
        museoViewModel = ViewModelProvider(this).get(MuseoViewModel::class.java)
        obrasAdapter = activity?.let { ObrasRecyclerViewAdapter(it) }!!
        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adapter = obrasAdapter
            }
        }
        // Observer del museo
        museoViewModel.getallObras().observe(viewLifecycleOwner,    Observer {
            allobras = it
            obrasAdapter.setData(museo,allobras)
        })

        return view
    }

    companion object {
        
        const val ARG_COLUMN_COUNT = "column-count"

        @JvmStatic
        fun newInstance(columnCount: Int) =
            ObrasFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}