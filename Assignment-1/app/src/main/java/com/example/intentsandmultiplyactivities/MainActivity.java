package com.example.intentsandmultiplyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    All the pictures in this App is from this website:
//    https://pixabay.com/zh/photos/books-students-library-university-1281581/
Button exist_button;
Button search_button;
GlobalField globalField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_land);
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        exist_button = findViewById(R.id.button_exist);
        search_button= findViewById(R.id.button_search);

        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(0);
    }

    public void existMain(View view){
        exist_button.setText("Existing");
        this.finish();
        System.exit(0);
    }
    public void chooseContinents(View view){
        Intent newintent = new Intent(this, SelectContinent.class);
        startActivity(newintent);
    }
}