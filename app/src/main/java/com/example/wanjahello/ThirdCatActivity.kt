package com.example.wanjahello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wanjahello.databinding.ActivityThirdCatBinding
import com.squareup.picasso.Picasso

class ThirdCatActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdCatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdCatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprev1.setOnClickListener {
            finish()
        }

        binding.btnnxt2.setOnClickListener {
            val intent = Intent(this,FourthCatActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://plus.unsplash.com/premium_photo-1667099522017-fefced781d08?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fGNhdHN8ZW58MHx8MHx8fDA%3D")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView9)
    }
}
