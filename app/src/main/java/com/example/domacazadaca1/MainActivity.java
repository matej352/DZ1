package com.example.domacazadaca1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt1);
        button = findViewById(R.id.btn1);

        button.setOnClickListener((v) -> {
            if (flag) {
                textView.setVisibility(View.INVISIBLE);
                button.setText(R.string.show);
            } else {
                textView.setVisibility(View.VISIBLE);
                button.setText(R.string.hide);
            }
            flag = !flag;
        });

    }
}