package com.tnsoft.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue("major")
public class Major extends StudentEntity{
    private String cin;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
