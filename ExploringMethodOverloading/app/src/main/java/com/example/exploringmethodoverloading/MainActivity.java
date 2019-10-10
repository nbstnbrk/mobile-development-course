package com.example.exploringmethodoverloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", printStuff(10));
        Log.i("info", printStuff("John Doe"));
        Log.i("info", printStuff(10, "John Doe"));
    }

    private String printStuff(int myInt) {
        return "The parameter for printStuff is Int =" + myInt;
    }

    private String printStuff(String myString){
        return "The parameter for printStuff is String" + myString;
    }

    private String printStuff(int myInt, String myString){
        return "The parameter for printStuff is myInt, myString" + myInt + "," + myString;

    }
}
