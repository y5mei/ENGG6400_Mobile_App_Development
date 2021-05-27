package com.example.intentsandmultiplyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectCountry extends AppCompatActivity {
    Spinner countrySpiner;
    String continentName;
    TextView header;
    ImageButton myImageView;
    Integer id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_selected);
        Intent intent = getIntent();


        // 0) prepare the Header
        continentName = intent.getStringExtra("Continent");
        id = intent.getIntExtra("num",100);
        header = findViewById(R.id.textViewChooseCountry);
        myImageView = findViewById(R.id.imageButtonAsia);
        header.setText("Choose a Country in "+continentName);


        countrySpiner = findViewById(R.id.dynamic_spinner);

        // 1) prepare the spiner content list
        List<CountryList.Country> counterList = new ArrayList<>();
        CountryList myCountryList = new CountryList();

        switch (id){
            case 1:{
                myImageView.setImageResource(R.drawable.asia);
                myCountryList.prepareAisaCountryList();
                break;}
            case 2:{
                myImageView.setImageResource(R.drawable.america);
                myCountryList.prepareAmericaCountryList();
                break;}
            case 3: {
                myImageView.setImageResource(R.drawable.australia);
                break;}
            case 4: {
                myImageView.setImageResource(R.drawable.europe);
                break;}
        }
        counterList = myCountryList.countryList;




        // 2) assign the content to the spinner
        ArrayAdapter<CountryList.Country> adapter = new ArrayAdapter<CountryList.Country>(this,R.layout.support_simple_spinner_dropdown_item,counterList);
        countrySpiner.setAdapter(adapter);

        // 3) setup the listener to get which item is selected
        countrySpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryList.Country country = (CountryList.Country) parent.getSelectedItem();
                displayCountryData(country);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

//    public void getSelectedCountry(View view){
//        CountryList.Country country = (CountryList.Country) countrySpiner.getSelectedItem();
//        displayCountryData(country);
//    }
    // 4) show a toast message if anything is selected
    private void displayCountryData(CountryList.Country country){
        String countryName = country.getName();
        String schollName = country.getSchool().getName();
        String URL = country.getSchool().getUrl();
        String GPS = country.getSchool().getGPS();
        String wiki = country.getSchool().getWiki();


        if (schollName == "Please Select a Country"){
            Toast.makeText(this, schollName,Toast.LENGTH_SHORT).show();
        }else{
            Intent schoolSelectedIntent = new Intent(this, DispalySchool.class);
            schoolSelectedIntent.putExtra("country",countryName);
            schoolSelectedIntent.putExtra("School",schollName);
            schoolSelectedIntent.putExtra("URL",URL);
            schoolSelectedIntent.putExtra("GPS",GPS);
            schoolSelectedIntent.putExtra("WIKI",wiki);
            startActivity(schoolSelectedIntent);
        }


//        Toast.makeText(this, schollName+"\n"+URL,Toast.LENGTH_LONG).show();

    }
}