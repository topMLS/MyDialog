各种弹出样式dialog
==================

# Usage
``` java
NiftyDialogBuilder dialogBuilder=NiftyDialogBuilder.getInstance(this);

dialogBuilder
    .withTitle("Modal Dialog")
    .withMessage("This is a modal Dialog.")
    .show();
```


# Configuration
``` java
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
```

