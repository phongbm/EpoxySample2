package com.phongbm.epoxysample2

import android.util.Log
import com.phongbm.epoxysample2.databinding.HolderParentBinding
import com.phongbm.epoxysample2.epoxy.ViewBindingEpoxyModelWithHolder

data class ParentItemEpoxyHolder(
    private val parentItem: ParentItem
) : ViewBindingEpoxyModelWithHolder<HolderParentBinding>() {
    companion object {
        private const val TAG = "ParentItemEpoxyHolder"
    }

    override fun HolderParentBinding.bind() {
        Log.d(TAG, "bind()...")
        txtSection.text = parentItem.data
    }

    override fun getDefaultLayout() = R.layout.holder_parent

}