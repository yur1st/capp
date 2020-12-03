package com.capp.tech.model.entity;

public class Address extends BaseEntity{

    private String city;
    private int postalIndex;
    private String address;

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalIndex() {
        return postalIndex;
    }

    public void setPostalIndex(int postalIndex) {
        this.postalIndex = postalIndex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
