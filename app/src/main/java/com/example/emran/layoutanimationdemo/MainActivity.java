package com.example.emran.layoutanimationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout ll2;
    private Button btnShow, btnHide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow= (Button) findViewById(R.id.btnShow);
        btnHide = (Button) findViewById(R.id.btnHide);
        ll2 = (LinearLayout) findViewById(R.id.ll2);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll2.setVisibility(View.VISIBLE);
            }
        });

        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll2.setVisibility(View.GONE);
            }
        });
    }
}
