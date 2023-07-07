package com.tnsoft.models;

public class AddressDto {
    private String street;
    private String avenue;
    private String number;

    public AddressDto(String street, String avenue, String number) {
        this.street = street;
        this.avenue = avenue;
        this.number = number;
    }
    public AddressDto(){}
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

    @Override
    public String toString() {
        return "AddressDto{" +
                "street='" + street + '\'' +
                ", avenue='" + avenue + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
