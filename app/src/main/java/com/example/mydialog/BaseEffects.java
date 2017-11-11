package com.example.mydialog;

import android.animation.AnimatorSet;
import android.view.View;

/**
 * Created by 29579 on 2017/11/11.
 */

public abstract class BaseEffects {
    private static final int DURATION = 700;

    protected long mDuration = DURATION;

    private AnimatorSet mAnimatorSet;

    {
        mAnimatorSet = new AnimatorSet();
    }

    protected abstract void setupAnimation(View view);

    public void start(View view) {
        reset(view);
        setupAnimation(view);
        mAnimatorSet.start();
    }

    private void reset(View view) {
        view.setPivotX(view.getMeasuredWidth() / 2.0f);
        view.setPivotY(view.getMeasuredHeight() / 2.0f);
    }


    public AnimatorSet getAnimatorSet() {
        return mAnimatorSet;
    }

    public void setDuration(long duration) {
        this.mDuration = duration;
    }
}
