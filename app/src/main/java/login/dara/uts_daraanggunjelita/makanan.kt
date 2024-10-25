package login.dara.uts_daraanggunjelita

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import login.dara.uts_daraanggunjelita.Adapter.makananAdapter
import login.dara.uts_daraanggunjelita.model.Mocklist1
import login.dara.uts_daraanggunjelita.model.modelMakanan

class makanan : AppCompatActivity() {
    private lateinit var rv_makanan:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_makanan)

         rv_makanan = findViewById(R.id.rv_favorites)

        rv_makanan.layoutManager = GridLayoutManager(this,2)
        val adapter = makananAdapter(Mocklist1.getmodel()as ArrayList<modelMakanan>,this)
        rv_makanan.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}