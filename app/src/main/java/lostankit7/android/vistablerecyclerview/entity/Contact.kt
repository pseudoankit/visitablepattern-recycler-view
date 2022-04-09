package lostankit7.android.vistablerecyclerview.entity

import lostankit7.android.vistablerecyclerview.base.BaseItemModel
import lostankit7.android.vistablerecyclerview.factory.ItemTypeFactory

data class Contact(val name: String, val rollNo: Int) : BaseItemModel {
    override fun type(typeFactory: ItemTypeFactory): Int {
        return typeFactory.type(this)
    }
}
