# ENGG6400
This is the Course Project for ENGG6400 Mobile App Development

The current goal is to build a Machine Learning Android App to automatically recognize something, say, different equipment in a chemical lab. When you camera is facing the equipment, it  can tell you what it is, where to find the SOP, when is the last calibrate date and the status for the last calibration.

Subject|Date
------------ | -------------
Approval|June 1st (Today)
*First-Assgnment*|June 8, 11:59 pm Tu
Proposal|June 7th
Interim |June 15th
Final PPT |June 24th

## What I have Learned from Assignment-1
### How to make a picture full fill a layout:
```xml
android:layout_width="match_parent"
android:layout_height="match_parent"
android:scaleType="centerCrop"
```
### How to Listen to a Spinner:
There are 3 steps to listen to a spinner:

0) You need to get access to the spinner inside of your onCreate method:
```xml
countrySpiner = findViewById(R.id.dynamic_spinner);
```

1) You need to parepare a list of content, List<T>, for the spinner to display:
  
```xml
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
        }
        counterList = myCountryList.countryList;
```
 
2) You need to construct a adapter, ArrayAdapter<T>, from your List<T>, then use setAdapter method to assign this adapter to your spinner object:
  
  ```xml
   ArrayAdapter<CountryList.Country> adapter = new ArrayAdapter<CountryList.Country>(this,R.layout.support_simple_spinner_dropdown_item,counterList);
   countrySpiner.setAdapter(adapter);
  ```
  
 3) Setup a listener to get which item is selected:
  
  ```xml
  countrySpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // get the selected item, and cast it to "Country" 
                CountryList.Country country = (CountryList.Country) parent.getSelectedItem();
                someFunctionYouNeedtoDo(country)
            }

            @Override // Do something if nothing is selected
            public void onNothingSelected(AdapterView<?> parent) {

            }
        })
  ```
  
  
