package com.example.upes.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1= (EditText) findViewById(R.id.editText1);
        String n1= editText1.getText().toString();

        EditText editText2= (EditText) findViewById(R.id.editText2);
        String n2= editText2.getText().toString();

        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        final int c=a+b;

        final TextView textView=(TextView) findViewById(R.id.textView);

        Button add= (Button) findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                textView.setText(String.valueOf(c));

            }
        });
    }
}
