package com.myapplication.theguidecore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.myapplication.theguidecore.baseObservable.AdapterBaseObservable
import com.myapplication.theguidecore.baseObservable.StudentDetailBaseObservable
import com.myapplication.theguidecore.databinding.ActivityMainBinding
import com.theguide.monthPicker.MonthYearPickerDialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var currentYear = 0
    private var yearSelected = 0
    private var monthSelected = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
        setupview(binding)
    }

    private fun setupview(binding: ActivityMainBinding) {
        binding.data = AdapterBaseObservable(null).apply {
            adapter.addItem(StudentDetailBaseObservable("1", "ABC"))
            adapter.observingItem(StudentDetailBaseObservable("2", "AqweBC"))
            adapter.observingItem(StudentDetailBaseObservable("2", "AqweBC"))
            adapter.observingItem(StudentDetailBaseObservable("3", "qwe"))
            adapter.observingItem(StudentDetailBaseObservable("4", "ABqwedfC"))
            adapter.observingItem(StudentDetailBaseObservable("5", "AwqewqBC"))
        }
        search_close_btn.setOnClickListener {
            binding.data = AdapterBaseObservable(null).apply {
                for (i in 0 until 2){
                    adapter.observingItem(StudentDetailBaseObservable("7", "ABC"))
                    adapter.observingItem(StudentDetailBaseObservable("8", "ABC"))
                        adapter.observingItem(StudentDetailBaseObservable("9", "ABC"))
                    adapter.observingItem(StudentDetailBaseObservable("10", "ABC"))
                }
            }

        }
    }


}