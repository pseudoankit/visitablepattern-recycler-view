package lostankit7.android.vistablerecyclerview.base

import lostankit7.android.vistablerecyclerview.factory.ItemTypeFactory

interface BaseItemModel {
    fun type(typeFactory: ItemTypeFactory) : Int
}