package com.tnsoft.entities;

import javax.persistence.Entity;

//@Entity
public class Minor extends StudentEntity{
    private boolean isAuthorized;

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
