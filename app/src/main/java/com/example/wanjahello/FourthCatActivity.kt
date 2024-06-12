package com.example.wanjahello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wanjahello.databinding.ActivityFourthCatBinding
import com.squareup.picasso.Picasso

class FourthCatActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthCatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthCatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprev2.setOnClickListener {
            finish()
        }

        binding.btnnxt3.setOnClickListener {
            val intent = Intent(this,FifthCatActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1517331156700-3c241d2b4d83?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGNhdHN8ZW58MHx8MHx8fDA%3D")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView2)
    }
}