package com.example.mydialog;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Effectstype effect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.fadein).setOnClickListener(this);
        findViewById(R.id.slideright).setOnClickListener(this);
        findViewById(R.id.slideleft).setOnClickListener(this);
        findViewById(R.id.slidetop).setOnClickListener(this);
        findViewById(R.id.slideBottom).setOnClickListener(this);
        findViewById(R.id.newspager).setOnClickListener(this);
        findViewById(R.id.fall).setOnClickListener(this);
        findViewById(R.id.sidefall).setOnClickListener(this);
        findViewById(R.id.fliph).setOnClickListener(this);
        findViewById(R.id.flipv).setOnClickListener(this);
        findViewById(R.id.rotatebottom).setOnClickListener(this);
        findViewById(R.id.rotateleft).setOnClickListener(this);
        findViewById(R.id.slit).setOnClickListener(this);
        findViewById(R.id.shake).setOnClickListener(this);
    }
    public void showDialog(Context context,boolean isTwoText){
        final NiftyDialogBuilder dialogBuilder=NiftyDialogBuilder.getInstance(this);
        if (isTwoText==true){
            dialogBuilder
                    .withTitle("Dialog")    //标题
                    .withTitleColor("#FFFFFF") //颜色
                    .withDividerColor("#11000000")//标题与内容分割线颜色
                    .withMessage("这是一个dialog") //内容1
                    .withMessageColor("#ffffff")//内容1颜色
                    .withDialogColor("#303F9F")//dialog背景颜色
                    .withIcon(getResources().getDrawable(R.drawable.icon))  //左上角icon
                    .isCancelableOnTouchOutside(true)                           //点击外部弹框是否消失
                    .withDuration(700)                                          //时长
                    .withEffect(effect)                                         //哪种动画
                    .withButton1Text("确定")                                      //确定
                    .withButton2Text("取消")                                //取消
                    .setCustomView(R.layout.custom_view,context)         //内容2
                    .setButton1Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(v.getContext(), dialogBuilder.getText()+"点击了确定", Toast.LENGTH_SHORT).show();
                            dialogBuilder.dismiss();
                        }
                    })
                    .setButton2Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(v.getContext(), "点击了取消", Toast.LENGTH_SHORT).show();
                            dialogBuilder.dismiss();
                        }
                    })
                    .show();
        }else {
            dialogBuilder
                    .withTitle("Dialog")    //标题
                    .withTitleColor("#FFFFFF") //颜色
                    .withDividerColor("#11000000")//标题与内容分割线颜色
                    .withMessage("这是一个dialog") //内容1
                    .withMessageColor("#ffffff")//内容1颜色
                    .withDialogColor("#303F9F")//dialog背景颜色
                    .withIcon(getResources().getDrawable(R.drawable.icon))  //左上角icon
                    .isCancelableOnTouchOutside(true)                           //点击外部弹框是否消失
                    .withDuration(700)                                          //时长
                    .withEffect(effect)                                         //哪种动画
                    .withButton1Text("确定")                                      //确定
                    .withButton2Text("取消")                                //取消
                    //.setCustomView(R.layout.custom_view,context)         //内容2
                    .setButton1Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(v.getContext(), dialogBuilder.getText()+"点击了确定", Toast.LENGTH_SHORT).show();
                            dialogBuilder.dismiss();
                        }
                    })
                    .setButton2Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(v.getContext(), "点击了取消", Toast.LENGTH_SHORT).show();
                            dialogBuilder.dismiss();
                        }
                    })
                    .show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fadein:
                effect=Effectstype.Fadein;
                showDialog(MainActivity.this,true);
                break;
            case R.id.slideright:
                effect=Effectstype.Slideright;
                showDialog(MainActivity.this,true);
                break;
            case R.id.slideleft:
                effect=Effectstype.Slideleft;
                showDialog(MainActivity.this,true);
                break;
            case R.id.slidetop:
                effect=Effectstype.Slidetop;
                showDialog(MainActivity.this,true);
                break;
            case R.id.slideBottom:
                effect=Effectstype.SlideBottom;
                showDialog(MainActivity.this,true);
                break;
            case R.id.newspager:
                effect= Effectstype.Newspager;
                showDialog(MainActivity.this,true);
                break;
            case R.id.fall:
                effect=Effectstype.Fall;
                showDialog(MainActivity.this,true);
                break;
            case R.id.sidefall:
                effect= Effectstype.Sidefill;
                showDialog(MainActivity.this,true);
                break;
            case R.id.fliph:
                effect=Effectstype.Fliph;
                showDialog(MainActivity.this,true);
                break;
            case R.id.flipv:
                effect=Effectstype.Flipv;
                showDialog(MainActivity.this,false);
                break;
            case R.id.rotatebottom:
                effect=Effectstype.RotateBottom;
                showDialog(MainActivity.this,false);
                break;
            case R.id.rotateleft:
                effect=Effectstype.RotateLeft;
                showDialog(MainActivity.this,false);
                break;
            case R.id.slit:
                effect=Effectstype.Slit;
                showDialog(MainActivity.this,false);
                break;
            case R.id.shake:
                effect=Effectstype.Shake;
                showDialog(MainActivity.this,false);
                break;
        }
    }
}
