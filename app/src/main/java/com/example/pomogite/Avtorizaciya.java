package com.example.pomogite;

import static com.example.pomogite.DatabaseHelper.COLUMN_ID;
import static com.example.pomogite.DatabaseHelper.COLUMN_NAME;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;

public class Avtorizaciya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtorizaciya);
    }

}