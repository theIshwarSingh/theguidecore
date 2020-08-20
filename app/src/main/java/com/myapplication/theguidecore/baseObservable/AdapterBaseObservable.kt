package com.myapplication.theguidecore.baseObservable

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.theguide.dataBoundAdapter.MultiTypeDataBoundAdapter

class AdapterBaseObservable(listener: MultiTypeDataBoundAdapter.ActionCallback?) :BaseObservable() {

    @Bindable
    val adapter = MultiTypeDataBoundAdapter(listener)

}