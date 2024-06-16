package com.stereotype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("Pankaj singh")
    private String sName;

    @Value("Lucknow")
    private String sCity;

     @Value("#{temp}")
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student :----------------------" +
                "\n sName= " + sName +
                "\n sCity= " + sCity+
                "\n Address= " + address;
    }
}
