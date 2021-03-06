package com.longge.thirdpartdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.longge.thirdpartdemo.dagger2.view.Dagger2Activity;
import com.longge.thirdpartdemo.eventbus.EventBusActivity;
import com.longge.thirdpartdemo.greendao.GreenDaoActivity;
import com.longge.thirdpartdemo.util.IntentHelper;
import com.longge.thirdpartdemo.websocket.WebSocket2Activity;
import com.longge.thirdpartdemo.websocket.WebSocketActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_eventBus)
    Button mBtnEventBus;
    @BindView(R.id.btn_greenDAO)
    Button mBtnGreenDAO;
    @BindView(R.id.activity_main)
    LinearLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_eventBus, R.id.btn_greenDAO, R.id.btn_dagger2, R.id.btn_webSocket, R.id.btn_webSocket2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_eventBus:
                IntentHelper.startAct(this, EventBusActivity.class);
                break;
            case R.id.btn_greenDAO:
                IntentHelper.startAct(this, GreenDaoActivity.class);
                break;
            case R.id.btn_dagger2:
                IntentHelper.startAct(this, Dagger2Activity.class);
                break;
            case R.id.btn_webSocket:
                IntentHelper.startAct(this, WebSocketActivity.class);
                break;
            case R.id.btn_webSocket2:
                IntentHelper.startAct(this, WebSocket2Activity.class);
                break;
        }
    }
}
