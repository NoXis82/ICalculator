package com.example.icalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean point = false;
    TextView textView;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_0;
    Button pointBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void numberClick(View view) {
        Button button = (Button) view;
        String number = textView.getText().toString();
        if (number.length() == 0) {
            if (button.getText().equals(",")) {
                point = true;
                textView.setText(R.string.value);
                textView.append(button.getText());
            } else {
                textView.setText("");
            }
        }
        if (button.getText().equals(",")) {
            if (!point) {
                point = true;
                textView.append(button.getText());
            }
        } else {
            textView.append(button.getText());
        }
    }

    public void initView() {
        button_0 = findViewById(R.id.button_0);
        button_0.setText(R.string.button_0);
        button_1 = findViewById(R.id.button_1);
        button_1.setText(R.string.button_1);
        button_2 = findViewById(R.id.button_2);
        button_2.setText(R.string.button_2);
        button_3 = findViewById(R.id.button_3);
        button_3.setText(R.string.button_3);
        button_4 = findViewById(R.id.button_4);
        button_4.setText(R.string.button_4);
        button_5 = findViewById(R.id.button_5);
        button_5.setText(R.string.button_5);
        button_6 = findViewById(R.id.button_6);
        button_6.setText(R.string.button_6);
        button_7 = findViewById(R.id.button_7);
        button_7.setText(R.string.button_7);
        button_8 = findViewById(R.id.button_8);
        button_8.setText(R.string.button_8);
        button_9 = findViewById(R.id.button_9);
        button_9.setText(R.string.button_9);
        pointBt = findViewById(R.id.point);
        textView = findViewById(R.id.textView);
    }
}
