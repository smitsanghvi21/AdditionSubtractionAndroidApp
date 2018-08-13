package com.example.smitsanghvi.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button3=(Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstField=(EditText)findViewById(R.id.input1);
                EditText secondField=(EditText)findViewById(R.id.input2);

                TextView results=(TextView)findViewById(R.id.result2);

                int num1=Integer.parseInt(firstField.getText().toString());
                int num2=Integer.parseInt(secondField.getText().toString());
                int total=num1-num2;

                results.setText("" +total);

                Toast.makeText(getApplicationContext(), "Total is:"+total, Toast.LENGTH_LONG).show();

            }
        });

    }
}
