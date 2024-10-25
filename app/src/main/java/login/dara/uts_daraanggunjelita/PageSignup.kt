package login.dara.uts_daraanggunjelita

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageSignup : AppCompatActivity() {
    private lateinit var btnlog :Button
    private lateinit var txtlogin :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_signup)
      btnlog=findViewById(R.id.btnlog)
       txtlogin=findViewById(R.id.txtlogin)

        btnlog.setOnClickListener {
            // Intent untuk pindah ke halaman LoginPage
           val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        txtlogin.setOnClickListener {
            // Intent untuk pindah ke halaman LoginPage
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}