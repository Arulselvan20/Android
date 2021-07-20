package com.example.myradio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RadioGroup rg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.sumbit);

        rg=findViewById(R.id.rg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder s=new StringBuilder();

                s.append("Year Of Study: ");

                int id=rg.getCheckedRadioButtonId();

                RadioButton rb1=findViewById(id);

                if(rb1!=null) {

                    s.append(rb1.getText().toString());

                    Toast.makeText(MainActivity.this, s.toString(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Select Any one!!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}