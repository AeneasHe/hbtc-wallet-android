package com.bhex.lib.uikit.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;

import com.bhex.lib.uikit.util.TypefaceUtils;

/**
 * Created by BHEX.
 * User: zhou chang
 * Date: 2020/4/14
 */
public class CustomTextView extends AppCompatTextView {
    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context) {
        super(context);
    }

    @Override
    public void setTypeface(Typeface tf, int style) {
        if (style == Typeface.BOLD) {
            TypefaceUtils.setTextWeightTypeface(getContext(),this);
        } else {
            TypefaceUtils.setTextTypeface(getContext(),this);
        }
    }
}
