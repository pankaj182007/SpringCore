package com.collections;

import javafx.scene.layout.Priority;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phone;
    private Set<String> address;
    private Map<String,String> courses;

    private Properties prop;


    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
    }

    public Emp(String name, List<String> phone, Set<String> address, Map<String, String> courses, Properties prop) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.courses = courses;
        this.prop= prop;
    }

    @Override
    public String toString() {
        return "Emp:----" +
                "name='" + name + '\n' +
                " phone=" + phone +'\n' +
                " address=" + address+'\n' +
                " properties=" + prop +'\n' +
                " courses=" + courses
                ;
    }
}
