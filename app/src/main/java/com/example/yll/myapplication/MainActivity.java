package com.example.yll.myapplication;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.example.yll.myapplication.views.DrawViewActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private LinearLayout ll_draw_view;
    private Activity act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = MainActivity.this;
        initView();
    }

    private void initView(){
        ll_draw_view = (LinearLayout) findViewById(R.id.ll_draw_view);
        ll_draw_view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.ll_draw_view:
                intent = new Intent();
                intent.setComponent(new ComponentName(act, DrawViewActivity.class));
                startActivity(intent);
                break;

        }
    }
}
