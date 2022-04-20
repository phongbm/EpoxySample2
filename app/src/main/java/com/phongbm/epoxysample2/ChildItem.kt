package com.phongbm.epoxysample2

import java.util.*

data class ChildItem(
    var id: String = UUID.randomUUID().toString(),
    var data: Int = 0
)