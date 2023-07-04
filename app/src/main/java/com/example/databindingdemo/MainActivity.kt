package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener{
            onButtonClicked()
        }
    }

    private fun onButtonClicked() =
        if (binding.progressCircular.visibility == View.GONE){
        binding.progressCircular.visibility = VISIBLE
        binding.button.text = "STOP"
    }
    else{
        binding.progressCircular.visibility = View.GONE
        binding.button.text = "START"
    }
}