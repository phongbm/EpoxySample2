package com.phongbm.epoxysample2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _dataLiveData = MutableLiveData<List<ParentItem>>()
    val dataLiveData: LiveData<List<ParentItem>>
        get() = _dataLiveData

    fun getData() {
        val data = ArrayList<ParentItem>()

        for (i in 1..5) {
            val childItems = ArrayList<ChildItem>()
            for (j in 1..10) {
                val childItem = ChildItem(data = j)
                childItems.add(childItem)
            }

            val parentItem = ParentItem(
                data = "Section $i",
                childItems = childItems,
                expanded = true
            )
            data.add(parentItem)
        }

        _dataLiveData.value = data
    }

}