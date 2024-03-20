package com.example.homework34;

public class Country {
    String countryName;
    String flag;

    public Country(String countryName, String flag) {
        this.countryName = countryName;
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
