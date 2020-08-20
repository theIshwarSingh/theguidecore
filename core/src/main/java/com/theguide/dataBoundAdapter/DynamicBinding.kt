package com.myapplication.theguideschool.customViews

import com.theguide.dataBoundAdapter.DataBoundViewHolder

interface DynamicBinding {

    /**
     * Gives the item an opportunity to do work during binding.
     */
    fun bind(holder: DataBoundViewHolder<*>)

}