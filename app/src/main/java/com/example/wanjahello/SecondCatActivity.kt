package com.example.wanjahello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wanjahello.databinding.ActivitySecondCatBinding
import com.squareup.picasso.Picasso

class SecondCatActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondCatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondCatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprev.setOnClickListener {
            finish()
        }
        binding.btnnxt1.setOnClickListener {
            val intent = Intent(this, ThirdCatActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1557246565-8a3d3ab5d7f6?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGNhdHN8ZW58MHx8MHx8fDA%3D")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView)
    }
}