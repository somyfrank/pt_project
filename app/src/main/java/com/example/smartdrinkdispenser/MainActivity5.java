package com.example.smartdrinkdispenser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        TextView payTxt= findViewById(R.id.textView13);
        TextView payTxt1=findViewById(R.id.textView14);
        TextView payTxt2=findViewById(R.id.textView15);
        TextView payTxt3=findViewById(R.id.textView16);

        payTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);

            }
        });

        payTxt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);

            }
        });
        payTxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);

            }
        });
        payTxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);

            }
        });
    }

}