package com.example.performance_analsis_springboot.model;

public class EmergencyResources {
    private String site_name,cars, city_jhc, ncity_jhc, doctors, drivers, nurses,site_type;

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getCars() {
        return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public String getCity_jhc() {
        return city_jhc;
    }

    public void setCity_jhc(String city_jhc) {
        this.city_jhc = city_jhc;
    }

    public String getNcity_jhc() {
        return ncity_jhc;
    }

    public void setNcity_jhc(String ncity_jhc) {
        this.ncity_jhc = ncity_jhc;
    }

    public String getDoctors() {
        return doctors;
    }

    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }

    public String getDrivers() {
        return drivers;
    }

    public void setDrivers(String drivers) {
        this.drivers = drivers;
    }

    public String getNurses() {
        return nurses;
    }

    public void setNurses(String nurses) {
        this.nurses = nurses;
    }

    public String getSite_type() {
        return site_type;
    }

    public void setSite_type(String site_type) {
        this.site_type = site_type;
    }

}
