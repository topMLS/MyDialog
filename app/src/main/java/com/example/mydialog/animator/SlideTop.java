package com.example.mydialog.animator;

import android.animation.ObjectAnimator;
import android.view.View;

import com.example.mydialog.BaseEffects;

/**
 * Created by 29579 on 2017/11/11.
 */

public class SlideTop extends BaseEffects {
    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationY", -300, 0).setDuration(mDuration),
                ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(mDuration * 3 / 2)

        );
    }
}
