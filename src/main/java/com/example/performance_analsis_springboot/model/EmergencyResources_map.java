package com.example.performance_analsis_springboot.model;

public class EmergencyResources_map {
    private String site_name,lng,lat,value="50",site_type,ss_yljg;

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSite_type() {
        return site_type;
    }

    public void setSite_type(String site_type) {
        this.site_type = site_type;
    }

    public String getSs_yljg() {
        return ss_yljg;
    }

    public void setSs_yljg(String ss_yljg) {
        this.ss_yljg = ss_yljg;
    }
}
