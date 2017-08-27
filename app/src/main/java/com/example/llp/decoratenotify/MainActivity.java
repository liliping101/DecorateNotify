package com.example.llp.decoratenotify;

import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Notify notify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button b = (Button) findViewById(R.id.send);
        b.setOnClickListener(this);
        Button db = (Button) findViewById(R.id.delaysend);
        db.setOnClickListener(this);

        notify = new NormalNotify(this);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            notify = new BigNotify(this, notify);
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            {
                notify = new HeadUpNotify(this, notify);
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send:
                notify.send();
                break;

            case R.id.delaysend:
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        notify.send();
                }
                }, 2000);
                break;
        }
    }
}
