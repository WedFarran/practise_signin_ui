package com.example.signsystem1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signsystem1.databinding.ActivitySignInScreenBinding
import com.example.signsystem1.databinding.ActivitySplashScreenBinding

class SignInScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignInScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}
        binding.txNewRegister.setOnClickListener{
            var intent = Intent(this,Registeration::class.java)
            startActivity(intent)}
        supportActionBar?.hide()

    }
}