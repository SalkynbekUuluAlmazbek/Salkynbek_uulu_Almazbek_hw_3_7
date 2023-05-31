package com.geeks.salkynbek_uulu_almazbek_hw_3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geeks.salkynbek_uulu_almazbek_hw_3_7.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon = intent.getIntExtra("image", 0)
        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        val color = intent.getStringExtra("color")
        val sum = intent.getStringExtra("sum")

        binding.imageViewDetail.setImageResource(icon)
        binding.textViewTitle.text = title
        binding.textViewDescription.text = description
        binding.textViewColor.text = color
        binding.textViewSum.text = sum
    }
}