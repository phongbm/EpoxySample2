package com.phongbm.epoxysample2

import java.util.*

data class ParentItem(
    var id: String = UUID.randomUUID().toString(),
    var data: String = "",
    var childItems: ArrayList<ChildItem> = ArrayList(),
    var expanded: Boolean = false
)