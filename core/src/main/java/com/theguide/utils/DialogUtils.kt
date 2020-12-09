package com.theguide.utils

import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object DialogUtils {

    fun showDialogWithPositiveButton(
        context: Context,
        title: String,
        message: String,
        positiveText: String,
        positiveClickEvent: DialogInterface.OnClickListener
    ) {
        val dialog = MaterialAlertDialogBuilder(context)
        dialog.setTitle(title)
        dialog.setMessage(message)
        dialog.setPositiveButton(positiveText, positiveClickEvent)
        dialog.show()
    }

    fun showDialogWithNegativeButton(
        context: Context,
        title: String,
        message: String,
        positiveText: String,
        positiveClickEvent: DialogInterface.OnClickListener,
        negativeText: String,
        negativeClickListener: DialogInterface.OnClickListener
    ) {
        val dialog = MaterialAlertDialogBuilder(context)
        dialog.setTitle(title)
        dialog.setMessage(message)
        dialog.setPositiveButton(positiveText, positiveClickEvent)
        dialog.setNegativeButton(negativeText, negativeClickListener)
        dialog.show()
    }

    fun showCustomDialog(context: Context, @LayoutRes customLayout: Int): Pair<AlertDialog, View> {
        val customLayoutView = LayoutInflater.from(context).inflate(customLayout, null)
        val dialog = MaterialAlertDialogBuilder(context).setView(customLayoutView).create()
        dialog.setCanceledOnTouchOutside(false)
        dialog.show()
        return Pair(dialog, customLayoutView)
    }
}