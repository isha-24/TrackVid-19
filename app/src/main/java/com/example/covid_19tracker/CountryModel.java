package com.example.covid_19tracker;

public class CountryModel {
    private String flag,
            country,
            continent,
            cases,
            active,
            critical,
            recovered,
            tests,
            deaths,
            todayCases,
            todayDeaths;

    public CountryModel(){}

    public CountryModel(String flag, String country, String continent, String cases, String active, String critical, String recovered, String deaths, String tests, String todayCases, String todayDeaths) {
        this.flag = flag;
        this.country = country;
        this.continent = continent;
        this.cases = cases;
        this.active = active;
        this.critical = critical;
        this.recovered = recovered;
        this.tests = tests;
        this.deaths = deaths;
        this.todayCases = todayCases;
        this.todayDeaths = todayDeaths;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDeath() {
        return deaths;
    }

    public void setDeath(String death) {
        this.deaths = death;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getTodayTests() {
        return tests;
    }

    public void setTodayTests(String todayTests) {
        this.tests = todayTests;
    }
}
