package com.example.quiz02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val updateTextView = {
            val selectedItems = mutableListOf<String>()

            if (binding.checkBox1.isChecked) selectedItems.add("사과")
            if (binding.checkBox2.isChecked) selectedItems.add("바나나")
            if (binding.checkBox3.isChecked) selectedItems.add("오렌지")

            binding.textView.text = if (selectedItems.isEmpty()) "선택값" else selectedItems.joinToString(", ")
        }

        binding.checkBox1.setOnCheckedChangeListener { _, isChecked -> updateTextView() }
        binding.checkBox2.setOnCheckedChangeListener { _, isChecked -> updateTextView() }
        binding.checkBox3.setOnCheckedChangeListener { _, isChecked -> updateTextView() }
    }
}
