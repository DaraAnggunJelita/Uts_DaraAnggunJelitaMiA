package login.dara.uts_daraanggunjelita

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    private lateinit var btnlogin:Button
    private lateinit var  txtSignup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
       btnlogin=findViewById(R.id.buttonlogin)
        txtSignup=findViewById(R.id.btnsignup)

        btnlogin.setOnClickListener {
            // Intent untuk pindah ke halaman LoginPage
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        txtSignup.setOnClickListener {
            // Intent untuk pindah ke halaman LoginPage
            val intent = Intent(this, PageSignup::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}