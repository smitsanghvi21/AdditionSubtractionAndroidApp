package com.example.smitsanghvi.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstField=(EditText)findViewById(R.id.first);
                EditText secondField=(EditText)findViewById(R.id.second);

                TextView results=(TextView)findViewById(R.id.result);

                int num1=Integer.parseInt(firstField.getText().toString());
                int num2=Integer.parseInt(secondField.getText().toString());
                int total=num1+num2;

                results.setText("" +total);

                Toast.makeText(getApplicationContext(), "Total is:"+total, Toast.LENGTH_LONG).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(newActivity);
            }
        });


    }
}
