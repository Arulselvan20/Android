package com.example.newandroidproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

   private Button button;
   private EditText name;

   private final int request=10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        name=findViewById(R.id.name);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameStr;
                nameStr=name.getText().toString();

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
               intent.putExtra("Message", nameStr);
               startActivityForResult(intent,request);


            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==request){
            if(requestCode==RESULT_OK){
                String mgs=data.getStringExtra("Msg");
                button.setText(mgs);
            }
        }
        else {
            //defult mgs
        }
    }
}