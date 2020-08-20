package com.myapplication.theguidecore.baseObservable

import com.theguide.dataBoundAdapter.MultiTypeDataBoundAdapter


interface AdapterCallBack: MultiTypeDataBoundAdapter.ActionCallback{
    fun onItemClick()
}