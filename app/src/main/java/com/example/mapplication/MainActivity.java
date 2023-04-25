package com.example.mapplication;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mapplication.SecondPageActivity;

public class MainActivity extends AppCompatActivity {

    Button open,send;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open=findViewById(R.id.btnbrowser);
        send=findViewById(R.id.btndata);


        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gunjeshbasnet.com.np"));
                startActivity(i);
            }
        });

    }

    public void SendMessage(View view) {
        Intent intent= new Intent(MainActivity.this, SecondPageActivity.class);
        EditText editText= (EditText)findViewById(R.id.text);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}