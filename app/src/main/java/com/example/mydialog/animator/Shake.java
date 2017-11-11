package com.example.mydialog.animator;

import android.animation.ObjectAnimator;
import android.view.View;

import com.example.mydialog.BaseEffects;

/**
 * Created by 29579 on 2017/11/11.
 */

public class Shake extends BaseEffects {
    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view, "translationX", 0, .10f, -25, .26f, 25, .42f, -25, .58f, 25, .74f, -25, .90f, 1, 0).setDuration(mDuration)

        );
    }
}
