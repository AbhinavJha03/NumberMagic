package com.example.numbermagic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number
    {
        int numb;
        public int SumofNumb()
        {
            int sum= ((numb*(numb+1))/2);
            return sum;
        }
        public int SumofSquare()
        {
            int sum= (((numb)*(numb+1)*(2*numb+1))/6);
            return sum;

        }
        public int SumofCube()
        {
            int sum= ((numb*(numb+1))/2);
            int pow= sum*sum;
            return pow;
        }
    }

    public void calculateSumofN(View view)
    {
        Log.i("Info","Button Pressed");
        EditText editText= (EditText) findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show();
        }
        else
        {

            Number no= new Number();
            int n= Integer.parseInt(editText.getText().toString());
            no.numb=n;
            TextView SumofNTextView= (TextView) findViewById(R.id.SumofNTextView);
            int a= no.SumofNumb();
            String str4 = new Integer(a).toString();
            SumofNTextView.setText(str4);
             }
    }

    public void calculateSumofNSq(View view)
    {
        Log.i("Info","Button Pressed of N^2");
        EditText editText= (EditText) findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show();
        }
        else {

            Number no = new Number();
            int n = Integer.parseInt(editText.getText().toString());
            no.numb = n;
            TextView SumofNSQTextView= (TextView) findViewById(R.id.SumofSQTextView);
            int a= no.SumofSquare();
            String str4 = new Integer(a).toString();
            SumofNSQTextView.setText(str4);
        }
            }
    public void calculateSumofNCu(View view)
    {
        Log.i("Info","Button Pressed of N^3");
        EditText editText= (EditText) findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }
        else {

            Number no = new Number();
            int n = Integer.parseInt(editText.getText().toString());
            no.numb = n;
            TextView SumofCUTextView= (TextView) findViewById(R.id.SumofCUTextView);
            int a= no.SumofCube();
            String str4 = new Integer(a).toString();
            SumofCUTextView.setText(str4);

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
