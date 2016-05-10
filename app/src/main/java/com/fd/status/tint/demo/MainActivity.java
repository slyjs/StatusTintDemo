package com.fd.status.tint.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fd.status.tint.demo.utils.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //一句话搞定！别忘了布局里面添加
        //android:clipToPadding="true"
        // android:fitsSystemWindows="true"
        StatusBarUtil.setStatusBarColor(this, android.R.color.holo_blue_light);

    }

}
