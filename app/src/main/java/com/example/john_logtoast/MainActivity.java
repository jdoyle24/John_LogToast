package com.example.john_logtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button=findViewById(R.id.Button);
        textView=findViewById(R.id.textView);

        Button.SetOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Log.i("MonTag","Bonjour mon ami");
                Toast.makeText(MainActivity.this, "Bonjour mon ami", Toast.LENGTH_LONG).show();
            }
        }
    };
}