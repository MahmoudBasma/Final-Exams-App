package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView coursesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesList = (ListView) findViewById(R.id.list);
        ArrayList<String> CRN = new ArrayList<>();
        ArrayList<String> date = new ArrayList<>();




    }
}