package com.example.daojishi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class second extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private int count = 30;

    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    Log.d("jkjk", String.valueOf(count));
                    textView.setText(String.valueOf(count));
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
}