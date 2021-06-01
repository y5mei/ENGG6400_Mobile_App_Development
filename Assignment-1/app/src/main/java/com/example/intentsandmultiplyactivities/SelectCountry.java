package com.example.intentsandmultiplyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
    GlobalField globalField;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_selected);
        Intent intent = getIntent();
        // check which continent was selected before, if this value is 0, which means we are

        globalField = (GlobalField) this.getApplication();
        int selectedContinenet = globalField.getContinentSelection();

        // 0) prepare the Header and prepare the spiner content list
        if (selectedContinenet==0){
            // something wrong, let's go back to the default page
            id = 1;
        }else{
            // recall the saved continenet information
            id = selectedContinenet;
//            id = intent.getIntExtra("num",selectedContinenet);
        }

        header = findViewById(R.id.textViewChooseCountry);
        myImageView = findViewById(R.id.imageButtonAsia);
        countrySpiner = findViewById(R.id.dynamic_spinner);
        List<CountryList.Country> counterList = new ArrayList<>();
        CountryList myCountryList = new CountryList();

        switch (id){
            case 1:{
                continentName = "Aisa";
                myImageView.setImageResource(R.drawable.asia);
                myCountryList.prepareAisaCountryList();
                break;}
            case 2:{
                continentName = "America";
                myImageView.setImageResource(R.drawable.america);
                myCountryList.prepareAmericaCountryList();
                break;}
            case 3: {
                continentName = "Australia";
                myImageView.setImageResource(R.drawable.australia);
                myCountryList.prepareAustriliaCountryList();
                break;}
            case 4: {
                continentName = "Europe";
                myImageView.setImageResource(R.drawable.europe);
                myCountryList.prepareEurpoeCountryList();
                break;}
        }
        counterList = myCountryList.countryList;

        header.setText("Choose a Country in "+continentName);




        // 2) assign the content to the spinner
        ArrayAdapter<CountryList.Country> adapter = new ArrayAdapter<CountryList.Country>(this,R.layout.support_simple_spinner_dropdown_item,counterList);
        countrySpiner.setAdapter(adapter);

        // 3) setup the listener to get which item is selected
        countrySpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CountryList.Country country = (CountryList.Country) parent.getSelectedItem();
                displayCountryData(country, adapter);
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
    private void displayCountryData(CountryList.Country country, ArrayAdapter<CountryList.Country>adapter){
        String countryName = country.getName();
        String schollName = country.getSchool().getName();
        String URL = country.getSchool().getUrl();
        String GPS = country.getSchool().getGPS();
        String wiki = country.getSchool().getWiki();
        toast = new Toast(this);


        if (schollName == "Please Select a Country"){
//            toast.makeText(this, schollName,Toast.LENGTH_SHORT).show();
        }else{
            Intent schoolSelectedIntent = new Intent(this, DispalySchool.class);
            schoolSelectedIntent.putExtra("country",countryName);
            schoolSelectedIntent.putExtra("School",schollName);
            schoolSelectedIntent.putExtra("URL",URL);
            schoolSelectedIntent.putExtra("GPS",GPS);
            schoolSelectedIntent.putExtra("WIKI",wiki);
            schoolSelectedIntent.putExtra("continentID",id);
            // Clear Adapter and toast message
            countrySpiner.setAdapter(adapter);
            startActivity(schoolSelectedIntent);
        }


    }
}