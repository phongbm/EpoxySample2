package com.phongbm.epoxysample2

import com.airbnb.epoxy.TypedEpoxyController

class DataController : TypedEpoxyController<List<ParentItem>>() {
    override fun buildModels(data: List<ParentItem>) {
        data.forEach { parentItem ->
            ParentItemEpoxyHolder(parentItem)
                .id(parentItem.id)
                .addTo(this)

            if (parentItem.expanded) {
                parentItem.childItems.forEach { childItem ->
                    ChildItemEpoxyHolder(childItem)
                        .id(childItem.id)
                        .addTo(this)
                }
            }
        }
    }

    override fun isStickyHeader(position: Int) =
        adapter.getModelAtPosition(position) is ParentItemEpoxyHolder

}