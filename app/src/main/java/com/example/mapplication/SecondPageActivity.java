package com.example.mapplication;


import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        Intent intent =getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView= findViewById(R.id.textview);
        textView.setText(message);
    }
}
