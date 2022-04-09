package lostankit7.android.vistablerecyclerview.factory

import android.view.View
import lostankit7.android.vistablerecyclerview.base.AbstractViewHolder
import lostankit7.android.vistablerecyclerview.entity.Heading
import lostankit7.android.vistablerecyclerview.entity.Contact
import lostankit7.android.vistablerecyclerview.viewholder.HeadingViewHolder
import lostankit7.android.vistablerecyclerview.viewholder.ContactItemViewHolder

class ItemTypeFactoryImp : ItemTypeFactory {

    override fun type(contact: Contact): Int {
        return ContactItemViewHolder.LAYOUT
    }

    override fun type(heading: Heading): Int {
        return HeadingViewHolder.LAYOUT
    }

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when(type) {
            ContactItemViewHolder.LAYOUT -> ContactItemViewHolder(parent)
            HeadingViewHolder.LAYOUT -> HeadingViewHolder(parent)
            else -> createViewHolder(parent, type)
        }
    }
}