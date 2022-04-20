package com.phongbm.epoxysample2

import android.util.Log
import com.phongbm.epoxysample2.databinding.HolderChildBinding
import com.phongbm.epoxysample2.epoxy.ViewBindingEpoxyModelWithHolder

data class ChildItemEpoxyHolder(
    private val childItem: ChildItem
) : ViewBindingEpoxyModelWithHolder<HolderChildBinding>() {
    companion object {
        private const val TAG = "ChildItemEpoxyHolder"
    }

    override fun HolderChildBinding.bind() {
        Log.d(TAG, "bind()...")
    }

    override fun getDefaultLayout() = R.layout.holder_child

}