package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");

        Log.v("NumbersActicity.java", "This is Number " + words.get(0));
        Log.v("NumbersActicity.java", "This is Number " + words.get(1));
        Log.v("NumbersActicity.java", "This is Number " + words.get(2));
        Log.v("NumbersActicity.java", "This is Number " + words.get(3));
        Log.v("NumbersActicity.java", "This is Number " + words.get(4));
        Log.v("NumbersActicity.java", "This is Number " + words.get(5));
        Log.v("NumbersActicity.java", "This is Number " + words.get(6));
        Log.v("NumbersActicity.java", "This is Number " + words.get(7));
        Log.v("NumbersActicity.java", "This is Number " + words.get(8));
        Log.v("NumbersActicity.java", "This is Number " + words.get(9));
        Log.v("NumbersActicity.java", "This is Number " + words.get(10));
        Log.v("NumbersActicity.java", "This is Number " + words.get(11));
    }
}
