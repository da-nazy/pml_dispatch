package com.pml_dispatch;

public class pickup_model {
    private String name;
    private int pricing;
    private String date_time;
    private String terminal;
    private String location;
    private String parcel_name;

    public pickup_model(String name, int pricing, String date_time, String terminal, String location, String parcel_name) {
        this.name = name;
        this.pricing = pricing;
        this.date_time = date_time;
        this.terminal = terminal;
        this.location = location;
        this.parcel_name = parcel_name;
    }

    public pickup_model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricing() {
        return pricing;
    }

    public void setPricing(int pricing) {
        this.pricing = pricing;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getParcel_name() {
        return parcel_name;
    }

    public void setParcel_name(String parcel_name) {
        this.parcel_name = parcel_name;
    }
}