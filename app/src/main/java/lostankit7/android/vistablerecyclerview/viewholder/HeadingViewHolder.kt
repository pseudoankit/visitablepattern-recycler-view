package lostankit7.android.vistablerecyclerview.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import lostankit7.android.vistablerecyclerview.R
import lostankit7.android.vistablerecyclerview.base.AbstractViewHolder
import lostankit7.android.vistablerecyclerview.entity.Heading

class HeadingViewHolder(view: View) : AbstractViewHolder<Heading>(view) {
    override fun bind(element: Heading) {
    }

    companion object {
        @LayoutRes val LAYOUT = R.layout.rv_item_heading
    }
}