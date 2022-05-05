package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
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
        ArrayList<String> courses = new ArrayList<>();
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

        //Creating cursor to loop over the results of the query and add them to the lists
        Cursor c = db.rawQuery("SELECT name, link FROM courses", null);

        int nameIdx = c.getColumnIndex("name");
        int linkIdx = c.getColumnIndex("link");

        c.moveToFirst();

        //creating the loop and adding the elements to the lists

        while(c != null){
            String name = c.getString(nameIdx);
            String link = c.getString(linkIdx);

            courses.add(name);
            links.add(link);
        }






    }
}