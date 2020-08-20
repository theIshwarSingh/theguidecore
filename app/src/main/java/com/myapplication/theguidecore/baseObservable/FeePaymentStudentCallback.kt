package com.myapplication.theguidecore.baseObservable

import com.theguide.dataBoundAdapter.MultiTypeDataBoundAdapter


interface FeePaymentStudentCallback: MultiTypeDataBoundAdapter.ActionCallback {
    fun onStudentCallBack(studentDB: StudentDetailBaseObservable)
}