package com.myapplication.theguidecore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.myapplication.theguidecore.baseObservable.AdapterBaseObservable
import com.myapplication.theguidecore.baseObservable.StudentDetailBaseObservable
import com.myapplication.theguidecore.databinding.ActivityMainBinding
import com.theguide.monthPicker.MonthYearPickerDialog
import com.theguide.monthPicker.MonthYearPickerDialogFragment
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
        }
        val calendar = Calendar.getInstance()
        currentYear = calendar.get(Calendar.YEAR)
        yearSelected = currentYear
        monthSelected = calendar.get(Calendar.MONTH)
        binding.date.setOnClickListener {
          val dialog = MonthYearPickerDialogFragment.getInstance(
              monthSelected,
              yearSelected, null)
              dialog.setOnDateSetListener { year, monthOfYear ->
                  monthSelected = monthOfYear
                  yearSelected = year
                  binding.date.text = "Month ${monthSelected+1} Year : $yearSelected"
              }
            dialog.show(supportFragmentManager, null)
        }
    }



}