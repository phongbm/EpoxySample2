package com.phongbm.epoxysample2.test2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.phongbm.epoxysample2.databinding.ViewHolderLineBinding

/**
 * Create by PhongBM on 04/27/2022
 */

class LineAdapter : RecyclerView.Adapter<LineAdapter.ViewHolder>() {
    private val data = ArrayList<Int>()

    init {
        for (i in 0..20) {
            data.add(i)
        }
    }

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewHolderLineBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ViewHolder(
        private val binding: ViewHolderLineBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            val value = data[position]
//            binding.edtTitle.setText("$value")
//            binding.edtValue.setText("$value")
        }
    }

}