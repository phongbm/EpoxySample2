package com.phongbm.epoxysample2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager
import com.phongbm.epoxysample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding
        get() = _binding!!

    private val viewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }

    private lateinit var dataController: DataController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lstData.apply {
            layoutManager = StickyHeaderLinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }

        dataController = DataController()
        binding.lstData.setController(dataController)

        viewModel.dataLiveData.observe(this) {
            dataController.setData(it)
        }

        viewModel.getData()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}