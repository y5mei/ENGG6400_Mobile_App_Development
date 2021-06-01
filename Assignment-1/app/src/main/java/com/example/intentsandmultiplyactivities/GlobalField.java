package com.example.intentsandmultiplyactivities;

import android.app.Application;
// 0) In order to save global variables, need to declair a class that extend Application
public class GlobalField extends Application {

    private int ContinentSelection;

    public int getContinentSelection() {
        return ContinentSelection;
    }

    public void setContinentSelection(int continentSelection) {
        ContinentSelection = continentSelection;
    }
}
