package com.theguide.utils

import android.app.Activity
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.FragmentActivity
object KeyboardUtils {

    @JvmStatic
    fun hideKeyboard (activity: FragmentActivity?) {
        val view = if (activity?.currentFocus != null) activity.currentFocus else View(activity)
        (activity?.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?)?.hideSoftInputFromWindow(view?.windowToken, 0)
        view?.clearFocus()
    }

    @JvmStatic
    fun showKeyboard(activity: FragmentActivity?){
        if (activity?.currentFocus != null) {
            (activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?)?.
                    toggleSoftInput(InputMethodManager.SHOW_FORCED or WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE,
                            InputMethodManager.HIDE_IMPLICIT_ONLY)
        }
    }

    @JvmStatic
    fun hideKeyBoardForSpecificView(focusableView: View, activity: FragmentActivity) {
        (activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?)?.
                hideSoftInputFromWindow(focusableView.windowToken, 0)

    }

    @JvmStatic
    fun showKeyBoardForSpecificView(focusableView: View, activity: FragmentActivity) {
        (activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?)?.
                showSoftInput(focusableView, InputMethodManager.SHOW_IMPLICIT)
    }
}
