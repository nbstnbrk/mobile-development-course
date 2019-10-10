package com.example.nickstonbrookassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String countUp
    public void countUp(View v){
        Log.i("message:", "In countUp Method");

        int x=1;

        while(true){

            x++;
            Log.i("x=", ""+x);
            if (x==10) {
                break;

            }
        }
    }

    public void countDown (View v){
        Log.i("message", "In countDown Method");

        int x=11;

        while (true) {

            x--;
            Log.i("x = ", "" +x);

            if (x == 1) {
                break;
            }}}
}
