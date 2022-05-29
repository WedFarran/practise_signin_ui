package com.example.signsystem1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signsystem1.databinding.ActivityRegisterationBinding
import com.example.signsystem1.databinding.ActivitySplashScreenBinding

class Registeration : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txLogin.setOnClickListener{
            var intent = Intent(this,SignInScreen::class.java)
            startActivity(intent)
        }
        binding.btnRegister.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        supportActionBar?.hide()
    }
}