package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1: Button = findViewById(R.id.button1);
        var button2: Button = findViewById(R.id.button2);
        var firstFragment=FirstFragment();
        var secondFragment=FragementSecond();
        var homepage=homepage();

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragement_container,homepage)
            commit()
        }

        button1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragement_container,firstFragment)
                commit()
            }
        }

        button2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragement_container,secondFragment)
                commit()
            }
        }

    }
}