package com.example.smartdrinkdispenser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView amountTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


       amountTxt = findViewById(R.id.textView9);
        TextView amountTxt1=findViewById(R.id.textView10);
        TextView amountTxt2=findViewById(R.id.textView11);

       amountTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);

            }
        });
        amountTxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);

            }
        });
        amountTxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);

            }
        });

    }
}