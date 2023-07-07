package com.tnsoft.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String avenue;
    private String number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
