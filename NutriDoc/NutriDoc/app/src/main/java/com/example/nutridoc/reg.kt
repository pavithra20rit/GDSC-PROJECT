package com.example.nutridoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.*

class reg : AppCompatActivity() {
    private lateinit var mail: EditText
    private lateinit var btn: Button
    private val e="[a-z0-9]+[@gmail]{1}[.]{1}[com]"
    private lateinit var name: EditText
    private lateinit var pwd1:EditText
    private lateinit var pwd2:EditText
    private lateinit var d:EditText
    private lateinit var ps:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        //mail=findViewById(R.id.editTextTextEmailAddress) as EditText
        //btn=findViewById(R.id.button2) as Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
       mail=findViewById(R.id.editTextTextEmailAddress)
        btn=findViewById(R.id.button2)
        name=findViewById(R.id.editTextTextPersonName3)
        pwd1=findViewById(R.id.editTextTextPassword)
        pwd2=findViewById(R.id.editTextTextPassword2)
        d=findViewById(R.id.editTextDate)
        ps=findViewById(R.id.editTextPhone)
       btn.setOnClickListener{
            var m=mail.text.toString().trim()
           var n=name.text.toString().trim()
           var p1=pwd1.text.toString().trim()
           var p2=pwd2.text.toString().trim()
           var d1=d.text.toString().trim()
           var ph=ps.text.toString().trim()
           if(n.isEmpty()){
               name.error="Enter Valid Name"
               return@setOnClickListener
           }
           if(m.isEmpty() || m.matches(e.toRegex())) {
               mail.error = "Enter Valid Mail-ID!"
               return@setOnClickListener
           }
           if(p1.isEmpty()){
               pwd1.error="Enter Valid Password"
               return@setOnClickListener
           }
            if(p2.isEmpty()){
               pwd2.error="Password cannot be empty"
                return@setOnClickListener
           }
           if(!(p1==p2)){
               pwd2.error="Password Mismatch!"
               return@setOnClickListener
           }
            if(!d1.matches("[0-9]{2}[-][0-9]{2}[-][0-9]{4}".toRegex()) || d1.isEmpty()){
                d.error="Invalid DOB"
               return@setOnClickListener
            }
           if(!ph.matches("[9]+[0-9]{9}".toRegex()) || ph.isEmpty()){
               ps.error="Invalid Phone Number"
              return@setOnClickListener
           }

            else{
                Toast.makeText(this, "Registration Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, loggs::class.java)
                startActivity(intent)
            }
        }

    }
}
