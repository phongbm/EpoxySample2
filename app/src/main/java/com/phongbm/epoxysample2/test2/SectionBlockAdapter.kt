package com.phongbm.epoxysample2.test2

import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.phongbm.epoxysample2.databinding.ViewHolderBlockBinding

/**
 * Create by PhongBM on 04/27/2022
 */

class SectionBlockAdapter : RecyclerView.Adapter<SectionBlockAdapter.ViewHolder>() {
    private val data = ArrayList<Int>()

    init {
        for (i in 0..5) {
            data.add(i)
        }
    }

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewHolderBlockBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ViewHolder(
        private val binding: ViewHolderBlockBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        private lateinit var adapter: LineAdapter

        init {
            binding.lstLine.setHasFixedSize(false)

            val listener = object : RecyclerView.SimpleOnItemTouchListener() {
                override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
                    when (e.action and MotionEvent.ACTION_MASK) {
                        MotionEvent.ACTION_DOWN -> Unit
                        MotionEvent.ACTION_MOVE -> rv.parent.requestDisallowInterceptTouchEvent(true)
                        MotionEvent.ACTION_UP -> Unit
                    }
                    return false
                }
            }
            binding.lstLine.addOnItemTouchListener(listener)
        }

        fun bind(position: Int) {
            adapter = LineAdapter()
            binding.lstLine.adapter = adapter
        }
    }

}