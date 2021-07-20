package com.example.newandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView disp;

    private Button secondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondBtn=findViewById(R.id.secondBtn);

        disp=findViewById(R.id.secondText);

        String name=getIntent().getStringExtra("Message");

        disp.setText(name);

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="I am from second activity";

                Intent i=new Intent();

                i.putExtra("Msg",str);
                setResult(RESULT_OK,i);

                finish();
            }
        });
    }
}