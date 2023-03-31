package com.example.nutridoc
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val second=findViewById<View>(R.id.button10)
        val second1=findViewById<View>(R.id.imageView2)
        second.setOnClickListener(){
            val intent = Intent(this,act::class.java)
            startActivity(intent)

        }

        second1.setOnClickListener(){
            Toast.makeText(this, "Logging out...", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,loggs::class.java)
            startActivity(intent)

        }
    }
}
