package com.clicks.yogi.expandablelistview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NewActivity extends AppCompatActivity {

    Spinner spn;
    ArrayAdapter<String> MyArrayList;
    String IPL[] = {"Select team","Chennai Super Kings",
            "Royal Challengers Bangalore","Kolkatta Knight Rider",
            "Rajasthan Royals","Delhi Daredevils","Kings XI Punjab",
            "Sunrisers Hyderabad","Mumbai Indians"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        spn = (Spinner)findViewById(R.id.spn);

        MyArrayList = new ArrayAdapter<String>(NewActivity.this,
                android.R.layout.simple_spinner_dropdown_item,IPL);
        spn.setAdapter(MyArrayList);

    }
}