package com.example.intentsandmultiplyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DispalySchool extends AppCompatActivity {
    TextView header;
    String url;
    String gps;
    String wiki;
    GlobalField globalField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly_school);
        header = findViewById(R.id.textViewSchool);
        Intent intent = getIntent();
        String schoolname = intent.getStringExtra("School");
        String countryname = intent.getStringExtra("country");
        header.setText(schoolname + " is a institute in "+countryname);

        url = intent.getStringExtra("URL");
        gps = intent.getStringExtra("GPS");
        wiki = intent.getStringExtra("WIKI");

        // save the continent information
        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(intent.getIntExtra("continentID",0));
    }
    public void openWiki(View view){
        Uri webpage = Uri.parse(wiki);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void openHomePage(View view){
        Uri webpage = Uri.parse(url);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void openMap(View view){
        Uri location = Uri.parse(gps);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
}