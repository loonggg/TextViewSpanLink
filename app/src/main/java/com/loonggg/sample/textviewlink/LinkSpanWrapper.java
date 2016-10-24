package com.loonggg.sample.textviewlink;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;

/**
 * 作者：loonggg on 2016/10/20 14:38
 */

public class LinkSpanWrapper extends ClickableSpan {
    private String clickString;
    private Context context;
    private String name;
    private String toName;
    private String content;
    private String color;

    public LinkSpanWrapper(String clickString, Context context, String name, String toName, String content, String color) {
        this.clickString = clickString;
        this.context = context;
        this.name = name;
        this.toName = toName;
        this.content = content;
        this.color = color;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(false);
        //给标记的部分 的文字 添加颜色
        if (clickString.equals("toName")) {
            ds.setColor(Color.parseColor(color));
        } else if (clickString.equals("name")) {
            ds.setColor(Color.parseColor(color));
        }
    }

    @Override
    public void onClick(View widget) {
        if (clickString.equals("toName")) {
            Toast.makeText(context, "点击了" + toName, Toast.LENGTH_SHORT).show();
        } else if (clickString.equals("name")) {
            Toast.makeText(context, "点击了" + name, Toast.LENGTH_SHORT).show();
        } else if (clickString.equals("content")) {
            Toast.makeText(context, "点击了" + content, Toast.LENGTH_SHORT).show();
        }
    }

}
