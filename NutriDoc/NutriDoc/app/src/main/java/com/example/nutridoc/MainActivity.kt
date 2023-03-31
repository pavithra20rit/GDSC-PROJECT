package com.example.nutridoc
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val second = findViewById<View>(R.id.button4)
        second.setOnClickListener() {
            val intent = Intent(this, loggs::class.java)
            startActivity(intent)

        }
        val second2 = findViewById<View>(R.id.button5)
        second2.setOnClickListener() {
            val intent = Intent(this,reg::class.java)
            startActivity(intent)

        }
    }
}