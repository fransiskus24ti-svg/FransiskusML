package com.example.saturn_frans.pertemuan_3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.saturn_frans.databinding.ActivityThirdBinding
import android.content.Intent

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnKirim.setOnClickListener {
            val intent = Intent(this, ThirdResultActivity::class.java)
            startActivity(intent)
        }
    }
}