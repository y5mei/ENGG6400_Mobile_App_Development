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

## General Setup
### How to setup a website on a Synology NAS without public ip address:
1) get a domain name, then get a free DDNS service, so that the domain name always represent the public ip address of the NAS
2) Install the DDNS updator2 on the NAS
3) Active Port forwarding on the Router to port exteral port 80 to internal port 80 on the NAS
4) If you still have question, you can watch this youtube video: https://www.youtube.com/watch?v=NxDcI2X4kL0&t=301s  

### How to setup Firebase database in Android Studio?

1) delete the following code from build.gradle (Project) file
``` xml
repositories {
        jcenter()
}
```
2) Connect to Firebase from Tool -> Firebase assistance

### How to setup and use a Global Variable?

https://stackoverflow.com/questions/1944656/android-global-variable

``` java
public class MyApplication extends Application {

    private String someVariable;

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }
}
```
In your android manifest you must declare the class implementing android.app.Application (add the android:name=".MyApplication" attribute to the existing application tag).

Then in your activities you can get and set the variable like so:
``` java
// set
((MyApplication) this.getApplication()).setSomeVariable("foo");

// get
String s = ((MyApplication) this.getApplication()).getSomeVariable();
```

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
```Java
countrySpiner = findViewById(R.id.dynamic_spinner);
```

1) You need to parepare a list of content, List<T>, for the spinner to display:
  
```Java
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
  
  ```Java
   ArrayAdapter<CountryList.Country> adapter = new ArrayAdapter<CountryList.Country>(this,R.layout.support_simple_spinner_dropdown_item,counterList);
   countrySpiner.setAdapter(adapter);
  ```
  
 3) Setup a listener to get which item is selected:
  
  ```Java
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
  
  ## Add upward navigation
 "Each screen in your app that's not the main entry point, which are all the screens that aren't the home screen, must provide navigation that directs the user to the logical parent screen in the app's hierarchy. To do this, add an Up button in the app bar.

To add an Up button, you need to declare which activity is the logical parent in the AndroidManifest.xml file. Open the file at app > manifests > AndroidManifest.xml, locate the <activity> tag for DisplayMessageActivity, and replace it with the following:"
  https://developer.android.com/training/basics/firstapp/starting-activity
  
  ```xml
  <activity android:name=".DisplayMessageActivity"
          android:parentActivityName=".MainActivity">
    <!-- The meta-data tag is required if you support API level 15 and lower -->
    <meta-data
        android:name="android.support.PARENT_ACTIVITY"
        android:value=".MainActivity" />
</activity>
  ```
## Add a Scrollview
  
  In order to have a scrollview, we need to put a TableLayout inside of a SCROLLVIEW:
  
  ```xml
      <TableLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:stretchColumns="1">
     </TableLayout>
  ```
  
## What I have Learned from Assignment-2 Fragment
### How to use Fragment:
```xml
  <frag
        android:name = "the name of the Java Class" [must to have]
        android:layout = "the name of the fragment_layout" [optional]
   />
```
### How to use linear layout to seperate a screen by two, regardless of the length of the screen:
  ```xml
      <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="@color/black"
        app:srcCompat="@drawable/popular_machine"
        />
        <ImageView
            android:id="@+id/imageView4"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:background="@color/purple_200"
            app:srcCompat="@drawable/popular_machine"
            />
    </LinearLayout>
  ```
  ### How to make Toast Message:
  
 ```Java
  Toast.makeText(getApplicationContext(), "No Button clicked", Toast.LENGTH_SHORT).show(); //This is for Activity
  Toast.makeText(getActivity(), "No Button clicked", Toast.LENGTH_SHORT).show(); //This is for fragment
  ```

  
