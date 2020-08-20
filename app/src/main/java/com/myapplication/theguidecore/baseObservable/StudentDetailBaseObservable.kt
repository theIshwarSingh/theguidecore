package com.myapplication.theguidecore.baseObservable

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.myapplication.theguidecore.R
import com.theguide.dataBoundAdapter.LayoutBinding

class StudentDetailBaseObservable(
    @Bindable val studentID: String,
    @Bindable val studentName: String
) : BaseObservable(), LayoutBinding {

    override fun getLayoutId(): Int {
        return R.layout.item_student
    }
}
