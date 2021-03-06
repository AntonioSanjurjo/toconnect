package com.example.recuperart.ui.ui.elije

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.recuperart.R
import com.example.recuperart.io.Constantes
import com.example.recuperart.io.model.PreviewMuseo
import com.example.recuperart.ui.descubre.Descubre

class PreviewMuseoRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<PreviewMuseoRecyclerViewAdapter.ViewHolder>() {
    
    private var museus : ArrayList<PreviewMuseo> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_item_pm, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = museus[position]
        holder.nom.text = item.nom
        holder.direccio.text = item.direccio
    }

    override fun getItemCount(): Int = museus.size

    fun setData(allMuseus: ArrayList<PreviewMuseo>?) {
        museus = allMuseus!!
        notifyDataSetChanged()
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nom: TextView = view.findViewById(R.id.museu_nom)
        val direccio: TextView = view.findViewById(R.id.museu_direccio)
        init {
            view.setOnClickListener{
                val adapterPosition = adapterPosition
                if (adapterPosition == RecyclerView.NO_POSITION) {
                    return@setOnClickListener
                }
                val item = museus[adapterPosition]
                Constantes.ID=item.id.toString()
                context?.startActivity(Intent(context, Descubre::class.java))
            }
        }
    }
}