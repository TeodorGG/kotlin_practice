package md.endava.internship.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset =
            listOf(
                Model("Title1", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title2", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title3", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title4", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title5", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title6", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title7", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title8", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title6", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title5", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title4", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title3", "Text ssssssssssssssssssssssdadssssssssss"),
                Model("Title2", "Text ssssssssssssssssssssssdadssssssssss"),

                )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}