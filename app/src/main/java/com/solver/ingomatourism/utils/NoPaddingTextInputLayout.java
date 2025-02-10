package com.solver.ingomatourism.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputLayout;

public class NoPaddingTextInputLayout extends TextInputLayout {
    public NoPaddingTextInputLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setError(@Nullable CharSequence error) {
        super.setError(error);

        try {
            // Get the error TextView dynamically
            TextView errorTextView = (TextView) getChildAt(1).findViewById(com.google.android.material.R.id.textinput_error);
            if (errorTextView != null) {
                errorTextView.setTextAlignment(TEXT_ALIGNMENT_VIEW_END); // Align text to end
            }

            // Adjust layout parameters
            LinearLayout linearLayout = (LinearLayout) getChildAt(1);
            if (linearLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.gravity = 8388613; // END (right)
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setPadding(10, 10, 10, 10);
            }

            setErrorIconDrawable(null); // Remove error icon
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setErrorTextAppearance(int resId) {
        super.setErrorTextAppearance(resId);
    }
}
