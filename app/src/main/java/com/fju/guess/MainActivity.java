package com.fju.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
int r =random.nextInt(100)+1;
    int min=1;
    int max=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void guess(View view){
        EditText ednumber = (EditText) findViewById(R.id.ed_number);
        boolean b = true;


        int n = Integer.parseInt(ednumber.getText().toString());
           if(n>100||n<0){
               b=false;
               Toast.makeText(this,"請輸入:"+min+"~"+max,Toast.LENGTH_SHORT).show();}


        if(b==true){
        if(n==r){
            new AlertDialog.Builder(this)
                    .setTitle("結果")
                    .setMessage("答對啦")
                    .setNeutralButton("OK",null)
                    .show();
        }
        if (n>r){
            max=n;
            Toast.makeText(this,"請輸入:"+min+"~"+max,Toast.LENGTH_SHORT).show();
        }
        if (n<r){
            min=n;
            Toast.makeText(this,"請輸入:"+min+"~"+max,Toast.LENGTH_SHORT).show();
    }}
}}
