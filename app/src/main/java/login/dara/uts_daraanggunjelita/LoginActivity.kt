package login.dara.uts_daraanggunjelita

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    private lateinit var txtup: TextView
    private lateinit var buttonlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Pastikan layout yang benar dipanggil sebelum memanggil findViewById
        setContentView(R.layout.activity_login)

        // Inisialisasi elemen UI setelah setContentView
        buttonlogin = findViewById(R.id.buttonlogin)
        txtup = findViewById(R.id.txtup)

        // Set listener untuk buttonlogin
        buttonlogin.setOnClickListener {
            // Intent untuk pindah ke halaman LoginPage
            val intent = Intent(this, makanan::class.java)
            startActivity(intent)
        }

        // Set listener untuk txtup
        txtup.setOnClickListener {
            // Intent untuk pindah ke halaman SignUpPage
            val intent = Intent(this, PageSignup::class.java)
            startActivity(intent)
        }

        // Atur insets agar layout mengikuti sistem insets (seperti status bar dan navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
