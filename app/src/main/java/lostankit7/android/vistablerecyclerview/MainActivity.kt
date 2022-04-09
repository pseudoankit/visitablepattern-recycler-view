package lostankit7.android.vistablerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import lostankit7.android.vistablerecyclerview.adapter.ContactAdapter
import lostankit7.android.vistablerecyclerview.factory.ItemTypeFactoryImp

class MainActivity : AppCompatActivity() {

    private val adapter by lazy {
        ContactAdapter(ItemTypeFactoryImp())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.recyclerView).apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}