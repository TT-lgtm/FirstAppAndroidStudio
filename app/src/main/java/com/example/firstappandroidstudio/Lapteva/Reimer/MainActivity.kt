package com.example.firstappandroidstudio.Lapteva.Reimer

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import com.example.firstappandroidstudio.Lapteva.Reimer.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val buttonRoll: Button = findViewById(R.id.button_start)
        val diceTextView: TextView = findViewById(R.id.textView_diceNum)
        buttonRoll.setOnClickListener {
            val randomNumber = Random.nextInt(1, 7)
            diceTextView.text = randomNumber.toString()
        }
        binding.textViewConst.text = getString(R.string.program_ex)
        binding.text.text = getString(R.string.text_text)
        binding.buttonStart.text = getString(R.string.text_button_start)

    }
}