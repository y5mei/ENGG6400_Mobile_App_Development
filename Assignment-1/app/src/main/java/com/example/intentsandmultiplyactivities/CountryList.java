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
        School Guelph = new School("University of Guelph","https://www.uoguelph.ca/","geo:43.53279168281464, -80.22609457168723","https://en.wikipedia.org/wiki/University_of_Guelph");
        School MIT = new School("Massachusetts Institute of Technology","https://www.mit.edu/","geo:42.361081475731346, -71.09415589920329","https://en.wikipedia.org/wiki/Massachusetts_Institute_of_Technology");
        School UNAM = new School("Universidad Nacional Autónoma de México","https://www.unam.mx/","geo:19.439360581247882, -99.14537272498313","https://en.wikipedia.org/wiki/National_Autonomous_University_of_Mexico");
        School BRA = new School("Universidade de São Paulo","https://www5.usp.br/","geo:-23.55868758171243, -46.73049138719783","https://en.wikipedia.org/wiki/University_of_S%C3%A3o_Paulo");



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
    //     Set the field countryList for America
    public void prepareAustriliaCountryList(){
        School Dummy = new School("Please Select a Country","","","");
        School Sydney = new School("The University of Sydney","https://www.sydney.edu.au/","geo:-33.88863712434332, 151.18802531394167","https://en.wikipedia.org/wiki/University_of_Sydney");
        School Auckland = new School("The University of Auckland","https://www.auckland.ac.nz/en.html","geo:-36.85243221523394, 174.7695686373231","https://en.wikipedia.org/wiki/University_of_Auckland");
        School UPNG = new School("University of Papua New Guinea","https://www.upng.ac.pg/","geo:-9.408825181013773, 147.17130104505253","https://en.wikipedia.org/wiki/University_of_Papua_New_Guinea");
        School FIJI = new School("The University of Fiji","https://www.unifiji.ac.fj/","geo:-17.668057377560196, 177.40800443293804","https://en.wikipedia.org/wiki/University_of_Fiji");



        List<Country> newCountryList = new ArrayList<>();
        Country DummyCountry = new Country("Please Select a Country", Dummy);
        Country Austrilia = new Country("Austrilia",Sydney);
        Country New_Zealand = new Country("New Zealand",Auckland);
        Country Papua_New_Guinea = new Country("Papua_New_Guinea",UPNG);
        Country Fiji = new Country("Fiji",FIJI);

        newCountryList.add(DummyCountry);
        newCountryList.add(Austrilia);
        newCountryList.add(New_Zealand);
        newCountryList.add(Papua_New_Guinea);
        newCountryList.add(Fiji);

        countryList = newCountryList;
    }
    public void prepareEurpoeCountryList(){
        School Dummy = new School("Please Select a Country","","","");
        School MPG = new School("Max Planck Society","https://www.mpg.de/en","geo:48.18480115024921, 11.613619732957085","https://en.wikipedia.org/wiki/Max_Planck_Society");
        School ENS = new School("École normale supérieure","https://www.ens.psl.eu/","geo:48.825415848282965, 2.33001797818072","https://en.wikipedia.org/wiki/%C3%89cole_normale_sup%C3%A9rieure_(Paris)");
        School ICL = new School("Imperial College London","https://www.imperial.ac.uk/","geo:51.498591586668404, -0.17488028342836517","https://en.wikipedia.org/wiki/Imperial_College_London");
        School MSU = new School("Moscow State University","https://www.msu.ru/en/","geo:55.70407996914562, 37.52868569165778","https://en.wikipedia.org/wiki/Moscow_State_University");



        List<Country> newCountryList = new ArrayList<>();
        Country DummyCountry = new Country("Please Select a Country", Dummy);
        Country Germany = new Country("Germany",MPG);
        Country France = new Country("France",ENS);
        Country England = new Country("England",ICL);
        Country Russia = new Country("Russia",MSU);

        newCountryList.add(DummyCountry);
        newCountryList.add(Germany);
        newCountryList.add(France);
        newCountryList.add(England);
        newCountryList.add(Russia);

        countryList = newCountryList;
    }

}
