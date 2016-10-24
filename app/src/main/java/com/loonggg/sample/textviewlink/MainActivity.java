package com.loonggg.sample.textviewlink;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv, tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv1 = (TextView) findViewById(R.id.tv1);
        TextViewLinkSpanUtil.linkSpanTextView(this, tv, "loonggg", "timmy", "我爱你", "#e2615e", "#888888");
        String html = "「非著名程序员」可能是东半球最好的技术分享公众号。每天，每周定时推送一些有关移动开发的原创文章和教程。 不信你可以<a href='http://www.baidu.com'>百度</a>一下， 哈哈，有意思吧！记住微信号是：smart_android 哦，其实我更喜欢<a href='http://www.google.com'>Google</a>一下。";
        TextViewLinkSpanUtil.textLinkClick(this,html, tv1);
    }
}
