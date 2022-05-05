package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
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
        ArrayList<String> links = new ArrayList<>();

        SQLiteDatabase db = this.openOrCreateDatabase("finalDB", MODE_PRIVATE, null);
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS courses (CRN VARCHAR, name VARCHAR, link VARCHAR)"
        );

        db.execSQL(
                "INSERT INTO links(course_name, course_url) " +
                "VALUES ('CSC498G', 'Mobile Computing', 'https://ionic.io/docs'),"
                 + " ('EDU500','Seminar in Education', 'https://corridorri.com/')," +
                        "('NUT201', 'Nutrition', 'https://www.nutrition.gov/topics/basic-nutrition')");




    }
}