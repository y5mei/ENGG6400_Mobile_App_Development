package com.example.intentsandmultiplyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectContinent extends AppCompatActivity {
    GlobalField globalField;
//    https://www.flaticon.com/packs/geography-17?k=1622052213318
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vertical_country_search);
    }

    public void selectCountinent(View view){
        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(1);
        Intent scintent = new Intent(this, SelectCountry.class);
        scintent.putExtra("Continent","Country");
        scintent.putExtra("num",1);
        startActivity(scintent);

    }

    public void selectAisaCountinent(View view){
        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(1);
        Intent scintent = new Intent(this, SelectCountry.class);
        scintent.putExtra("Continent","Aisa");
        scintent.putExtra("num",1);
        startActivity(scintent);
    }
    public void selectAmericaCountinent(View view){
        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(2);
        Intent scintent = new Intent(this, SelectCountry.class);
        scintent.putExtra("Continent","America");
        scintent.putExtra("num",2);
        startActivity(scintent);
    }
    public void selectAustriliaCountinent(View view){
        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(3);
        Intent scintent = new Intent(this, SelectCountry.class);
        scintent.putExtra("Continent","Austrilia");
        scintent.putExtra("num",3);
        startActivity(scintent);
    }
    public void selectEuropeCountinent(View view){
        globalField = (GlobalField) this.getApplication();
        globalField.setContinentSelection(4);
        Intent scintent = new Intent(this, SelectCountry.class);
        scintent.putExtra("Continent","Europe");
        scintent.putExtra("num",4);
        startActivity(scintent);
    }
}