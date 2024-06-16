package com.constuctorInjection;

public class Certi {

    public String name;

    public Certi(String name)
    {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Certi :---" +'\n'+
                "Name = "+this.name;
    }
}
