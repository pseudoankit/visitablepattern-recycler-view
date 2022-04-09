package lostankit7.android.vistablerecyclerview.factory

import android.view.View
import lostankit7.android.vistablerecyclerview.base.AbstractViewHolder
import lostankit7.android.vistablerecyclerview.entity.Heading
import lostankit7.android.vistablerecyclerview.entity.Contact

interface ItemTypeFactory {
    fun type(contact: Contact): Int
    fun type(heading: Heading): Int
    fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*>
}