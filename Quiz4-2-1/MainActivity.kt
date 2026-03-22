package com.example.quiz01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioButton01 -> binding.textView.text = "사과"
                R.id.radioButton02 -> binding.textView.text = "바나나"
                R.id.radioButton03 -> binding.textView.text = "오렌지"
            }
        }
    }
}
