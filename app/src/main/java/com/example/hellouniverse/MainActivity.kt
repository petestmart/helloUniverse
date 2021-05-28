package com.example.hellouniverse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.hellouniverse.databinding.ActivityMainBinding

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.myTV) as TextView
        var timesClicked = 0
        // set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Holy Smokes!", Toast.LENGTH_SHORT).show()
        }

//        val myTV = findViewById<TextView>(R.id.myTV)
//        myTV.text = "Hello Students"
        binding.myTV.text = "Hello Students again"
    }
}