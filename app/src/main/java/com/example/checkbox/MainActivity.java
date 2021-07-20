package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CheckBox c1,c2,c3,c4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);

        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Language Known !!");
                stringBuilder.append("\n");

                if (c1.isChecked()) {
                    a=1;
                    stringBuilder.append(c1.getText());
                    stringBuilder.append("\n");
                }
                if (c2.isChecked()) {
                    a=1;
                    stringBuilder.append(c2.getText());
                    stringBuilder.append("\n");
                }
                if (c3.isChecked()) {
                    a=1;
                    stringBuilder.append(c3.getText());
                    stringBuilder.append("\n");
                }
                if (c4.isChecked()) {
                    a=1;
                    stringBuilder.append(c4.getText());
                    stringBuilder.append("\n");
                }

                if (a==0) {
                    stringBuilder.append("None");
                }

                Toast.makeText(MainActivity.this,stringBuilder.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}