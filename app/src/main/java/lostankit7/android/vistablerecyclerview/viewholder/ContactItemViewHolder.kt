package lostankit7.android.vistablerecyclerview.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import lostankit7.android.vistablerecyclerview.R
import lostankit7.android.vistablerecyclerview.base.AbstractViewHolder
import lostankit7.android.vistablerecyclerview.entity.Contact

class ContactItemViewHolder(view: View) : AbstractViewHolder<Contact>(view) {
    override fun bind(element: Contact) {

    }

    companion object {
        @LayoutRes val LAYOUT = R.layout.rv_item_contact
    }
}