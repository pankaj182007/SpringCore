package com.constuctorInjection;

import java.util.List;

public class Person {

    private String name;
    private int personId;

    private Certi certi;

    private List<String> list;

    public Person(String name, int personId, Certi certi, List<String> list)
    {
        this.personId=personId;
        this.name=name;
        this.certi=certi;
        this.list=list;
    }

    @Override
    public String toString() {
        return "Person:--- "+'\n'+ "Person Name = "+ this.name+'\n'+
                "Person Id = "+ this.personId+'\n'+
                "Certi = "+this.certi.name+'\n'+
                "List = "+this.list;
    }
}
