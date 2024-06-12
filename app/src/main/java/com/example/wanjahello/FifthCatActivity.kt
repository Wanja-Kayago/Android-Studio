package com.example.wanjahello

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wanjahello.databinding.ActivityFifthCatBinding
import com.squareup.picasso.Picasso

class FifthCatActivity : AppCompatActivity() {

    lateinit var binding: ActivityFifthCatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityFifthCatBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnprev3.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1526336024174-e58f5cdd8e13?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGNhdHN8ZW58MHx8MHx8fDA%3D")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView8)
        }

    }
