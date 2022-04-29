package com.phongbm.epoxysample2.test2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import com.phongbm.epoxysample2.databinding.ActivityMain2Binding

/**
 * Create by PhongBM on 04/27/2022
 */

class Main2Activity : AppCompatActivity() {
    private var _binding: ActivityMain2Binding? = null
    private val binding: ActivityMain2Binding
        get() = _binding!!

    private lateinit var adapter: SectionBlockAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lstSectionBlock.setHasFixedSize(true)

        val decor = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        binding.lstSectionBlock.addItemDecoration(decor)

        adapter = SectionBlockAdapter()
        binding.lstSectionBlock.adapter = adapter
    }

}