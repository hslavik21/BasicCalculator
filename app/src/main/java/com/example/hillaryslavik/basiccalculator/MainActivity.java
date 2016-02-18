package com.example.hillaryslavik.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button)  findViewById(R.id.add);
        Button subtractButton = (Button)  findViewById(R.id.subtract);




        addButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                try {
                    EditText firstNum = (EditText) findViewById(R.id.firstNum);
                    String num1 = firstNum.getText().toString();
                    double n1 = Double.parseDouble(num1);

                    EditText secondNum = (EditText) findViewById(R.id.secondNum);
                    String num2 = secondNum.getText().toString();
                    double n2 = Double.parseDouble(num2);

                    double sum = n1 +n2;

                    TextView total = (TextView) findViewById(R.id.total);
                    total.setText("Total: "+ sum);
                } catch(NumberFormatException e)
                {
                    TextView total = (TextView) findViewById(R.id.total);
                    total.setText("Not a number: Try again!");
                }

            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    EditText firstNum = (EditText) findViewById(R.id.firstNum);
                    String num1 = firstNum.getText().toString();
                    double n1 = Double.parseDouble(num1);

                    EditText secondNum = (EditText) findViewById(R.id.secondNum);
                    String num2 = secondNum.getText().toString();
                    double n2 = Double.parseDouble(num2);

                    double sum = n1 - n2;

                    TextView total = (TextView) findViewById(R.id.total);
                    total.setText("Total: " + sum);
                } catch (NumberFormatException e)
                {
                    TextView total = (TextView) findViewById(R.id.total);
                    total.setText("Not a number: Try again!");

                }

            }
        });
    }
}
