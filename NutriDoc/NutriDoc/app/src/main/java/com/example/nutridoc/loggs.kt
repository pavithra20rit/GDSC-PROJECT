package com.example.nutridoc
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//import kotlinx.Android.synthetic.main.activity_main.*;

class loggs : AppCompatActivity() {
    private lateinit var uname:EditText
    private lateinit var pwd:EditText
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggs)
        uname=findViewById(R.id.editTextTextPersonName)
        pwd=findViewById(R.id.editTextTextPersonName2)
        btn=findViewById(R.id.button)
        val second = findViewById<View>(R.id.button)
        btn.setOnClickListener{
            var u=uname.text.toString().trim()
            var p=pwd.text.toString().trim()
            var b=btn.text.toString().trim()
            if(u.isEmpty()){
                uname.error="Enter Username!"
                return@setOnClickListener
            }
            if(p.isEmpty()){
                pwd.error="Enter Password"
                return@setOnClickListener
            }
            if(!(u=="PaviNisha" && p=="1234")){
                Toast.makeText(this, "Invalid Login!", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, dashboard::class.java)
                startActivity(intent)
            }
        }

    }
}