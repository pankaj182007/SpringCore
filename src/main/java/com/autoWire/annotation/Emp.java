package com.autoWire.annotation;


import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    private Address addres;

    public Address getAddres() {
        return addres;
    }
    @Autowired
    public void setAddres(Address address) {
        System.out.println("in setter");
        this.addres = address;
    }

    public Emp() {

    }

    public Emp(Address address) {
        System.out.println("in constructor");
        this.addres = address;
    }

    @Override
    public String toString() {
        return "Emp address: -------------"  + addres ;
    }
}
