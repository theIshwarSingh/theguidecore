package com.myapplication.theguidecore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.myapplication.theguidecore.baseObservable.AdapterBaseObservable
import com.myapplication.theguidecore.baseObservable.StudentDetailBaseObservable
import com.myapplication.theguidecore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        setupview(binding)
    }

    private fun setupview(binding: ActivityMainBinding) {
        binding.data = AdapterBaseObservable(null).apply {
            adapter.addItem(StudentDetailBaseObservable("1", "ABC"))
        }}


}