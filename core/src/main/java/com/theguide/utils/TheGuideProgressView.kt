package com.theguide.utils

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.theguide.R
import kotlinx.android.synthetic.main.theguide_progess_view.view.*

class TheGuideProgressView  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr)  {


    init {
        LayoutInflater.from(context).inflate(R.layout.theguide_progess_view, this, true)
        attrs?.let{
            val typedArray = context.obtainStyledAttributes(
                it,
                R.styleable.TheGuideProgressView,
                0,
                0
            )
            val progressVisibility = typedArray.getInt(R.styleable.TheGuideProgressView_android_visibility, 0)
            progressBar.indeterminateDrawable.setColorFilter(Color.parseColor("#FFFFFFFF"),android.graphics.PorterDuff.Mode.MULTIPLY)
            typedArray.recycle()
        }
    }

}