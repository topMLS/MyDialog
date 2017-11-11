package com.example.mydialog;

import com.example.mydialog.animator.FadeIn;
import com.example.mydialog.animator.Fall;
import com.example.mydialog.animator.FlipH;
import com.example.mydialog.animator.FlipV;
import com.example.mydialog.animator.NewsPaper;
import com.example.mydialog.animator.RotateBottom;
import com.example.mydialog.animator.RotateLeft;
import com.example.mydialog.animator.Shake;
import com.example.mydialog.animator.SideFall;
import com.example.mydialog.animator.SlideBottom;
import com.example.mydialog.animator.SlideLeft;
import com.example.mydialog.animator.SlideRight;
import com.example.mydialog.animator.SlideTop;
import com.example.mydialog.animator.Slit;

/**
 * Created by 29579 on 2017/11/11.
 */

public enum Effectstype {
    Fadein(FadeIn.class),
    Slideleft(SlideLeft.class),
    Slidetop(SlideTop.class),
    SlideBottom(SlideBottom.class),
    Slideright(SlideRight.class),
    Fall(Fall.class),
    Newspager(NewsPaper.class),
    Fliph(FlipH.class),
    Flipv(FlipV.class),
    RotateBottom(RotateBottom.class),
    RotateLeft(RotateLeft.class),
    Slit(Slit.class),
    Shake(Shake.class),
    Sidefill(SideFall.class);
    private Class<? extends BaseEffects> effectsClazz;

    private Effectstype(Class<? extends BaseEffects> mclass) {
        effectsClazz = mclass;
    }

    public BaseEffects getAnimator() {
        BaseEffects bEffects = null;
        try {
            bEffects = effectsClazz.newInstance();
        } catch (ClassCastException e) {
            throw new Error("Can not init animatorClazz instance");
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            throw new Error("Can not init animatorClazz instance");
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            throw new Error("Can not init animatorClazz instance");
        }
        return bEffects;
    }
}
