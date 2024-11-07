package com.umut.intentkotlin

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.umut.intentkotlin.databinding.ActivityMainBinding
import android.content.Intent as Intent1

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun next(view: View){
        val gecis = Intent(this@MainActivity,nextActivity::class.java)
        val userInput = binding.edit1.text.toString()
        intent.putExtra("name", binding.edit1.text.toString())

        startActivity(gecis)

    }
}