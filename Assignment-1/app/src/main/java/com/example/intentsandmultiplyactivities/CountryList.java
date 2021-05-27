package com.example.intentsandmultiplyactivities;

import java.util.ArrayList;
import java.util.List;

public class CountryList {
    public static List<Country> countryList;

    public CountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
    public CountryList() {
        this.countryList = null;
    }

    public class Country{
        public String name;
        public School school;

        public Country(String name, School school) {
            this.name = name;
            this.school = school;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public School getSchool() {
            return school;
        }

        public void setSchool(School school) {
            this.school = school;
        }

        @Override
        public String toString() {
            return name;

        }
    }
    public class School{
        public String name;
        public String url;
        public String GPS;
        public String wiki;

        public School(String name, String url, String GPS,String wiki) {
            this.name = name;
            this.url = url;
            this.GPS = GPS;
            this.wiki = wiki;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getGPS() {
            return GPS;
        }

        public void setGPS(String GPS) {
            this.GPS = GPS;
        }

        public String getWiki() {
            return wiki;
        }
    }
//    Set the field countryList to be AisaCountryList
    public void prepareAisaCountryList(){
        School Dummy = new School("Please Select a Country","","","");
        School THU = new School("Tsinghua University","https://www.tsinghua.edu.cn/en/","geo:39.99983175532476, 116.32651899923793","https://en.wikipedia.org/wiki/Tsinghua_University");
        School TKU = new School("The University of Tokyo","https://www.u-tokyo.ac.jp/en/","geo:35.712616500890675, 139.76198899744338","https://en.wikipedia.org/wiki/University_of_Tokyo");
        School IIT = new School("Indian Institutes of Technology","https://www.iitm.ac.in/","geo:12.993106745705406, 80.23438356920953","https://en.wikipedia.org/wiki/Indian_Institutes_of_Technology");
        School NUS = new School("National University of Singapore","https://www.zju.edu.cn/english/","1.296599694706494, 103.77654410072641","https://en.wikipedia.org/wiki/National_University_of_Singapore");



        List<Country> newCountryList = new ArrayList<>();
        Country DummyCountry = new Country("Please Select a Country", Dummy);
        Country China = new Country("China",THU);
        Country Japan = new Country("Japan",TKU);
        Country India = new Country("India",IIT);
        Country Singapore = new Country("Singapore",NUS);

        newCountryList.add(DummyCountry);
        newCountryList.add(China);
        newCountryList.add(Japan);
        newCountryList.add(India);
        newCountryList.add(Singapore);

        countryList = newCountryList;
    }
//     Set the field countryList for America
    public void prepareAmericaCountryList(){
        School Dummy = new School("Please Select a Country","","","");
        School Guelph = new School("University of Guelph","https://www.uoguelph.ca/","geo:39.99983175532476, 116.32651899923793","https://en.wikipedia.org/wiki/Tsinghua_University");
        School MIT = new School("Massachusetts Institute of Technology","https://www.mit.edu/","geo:35.712616500890675, 139.76198899744338","https://en.wikipedia.org/wiki/University_of_Tokyo");
        School UNAM = new School("Universidad Nacional Autónoma de México","https://www.unam.mx/","geo:12.993106745705406, 80.23438356920953","https://en.wikipedia.org/wiki/Indian_Institutes_of_Technology");
        School BRA = new School("Universidade de São Paulo","https://www5.usp.br/","1.296599694706494, 103.77654410072641","https://en.wikipedia.org/wiki/National_University_of_Singapore");



        List<Country> newCountryList = new ArrayList<>();
        Country DummyCountry = new Country("Please Select a Country", Dummy);
        Country Canada = new Country("Canada",Guelph);
        Country USA = new Country("USA",MIT);
        Country Mexico = new Country("Mexico",UNAM);
        Country Brasil = new Country("Brasil",BRA);

        newCountryList.add(DummyCountry);
        newCountryList.add(Canada);
        newCountryList.add(USA);
        newCountryList.add(Mexico);
        newCountryList.add(Brasil);

        countryList = newCountryList;
    }

}
