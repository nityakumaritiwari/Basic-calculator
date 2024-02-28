package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
      private Button button;

      private Button button2;

      private EditText editText1;
      private EditText editText2;
      private EditText editText3;
      private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);

         editText1=findViewById(R.id.editTextNumber);
         editText2=findViewById(R.id.editTextNumber2);
         editText3=findViewById(R.id.editTextNumber3);
         editText4=findViewById(R.id.editTextNumber4);
        editText5=findViewById(R.id.editTextNumber5);
        editText6=findViewById(R.id.editTextNumber6);
        editText7=findViewById(R.id.editTextNumber7);

         /*
          button.setOnClickListener(new OnClickListener() {
              @Override
              public void onClick(View v) {
                  String s1=editText1.getText().toString();//first number
                  int num1=Integer.parseInt(s1);//first number to int

                  String s2=editText2.getText().toString();//second number
                  int num2=Integer.parseInt(s2);//second number to int

                  int add=num1+num2;
                  textView.setText("addition "+add);

              }});*/

        }
        public void Add(View view)
        {
            String s1=editText1.getText().toString();//first number
            int num1=Integer.parseInt(s1);//first number to int

            String s2=editText2.getText().toString();//second number
            int num2=Integer.parseInt(s2);//second number to int
            int add=num1+num2;
            editText3.setText(String.valueOf(add));
        }
    public void sub(View view)
    {
        String s1=editText1.getText().toString();//first number
        int num1=Integer.parseInt(s1);//first number to int

        String s2=editText2.getText().toString();//second number
        int num2=Integer.parseInt(s2);//second number to int
        int sub=num1-num2;
        editText4.setText(String.valueOf(sub));

    }
    public void Mul(View view)
    {
        String s7=editText1.getText().toString();
        int a=Integer.parseInt(s7);

        String s8=editText2.getText().toString();
        int b=Integer.parseInt(s8);
        int mul=a*b;
        editText5.setText(String.valueOf(mul));

    }

    public void Divide(View view)
    {
        String s1=editText1.getText().toString();//first number
        int num1=Integer.parseInt(s1);//first number to int

        String s2=editText2.getText().toString();//second number
        int num2=Integer.parseInt(s2);//second number to int
        int Divi=num1/num2;
        editText6.setText(String.valueOf(Divi));

    }
    public void Remainder(View view)
    {
        String s1=editText1.getText().toString();//first number
        int num1=Integer.parseInt(s1);//first number to int

        String s2=editText2.getText().toString();//second number
        int num2=Integer.parseInt(s2);//second number to int
        int Remainder=num1%num2;
        editText7.setText(String.valueOf(Remainder));

    }
    // Inside your onCreate method in an Activity or onCreateView method in a Fragment

    // Get the root layout (e.g., RelativeLayout, LinearLayout, etc.)



}