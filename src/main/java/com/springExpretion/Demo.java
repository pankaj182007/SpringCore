package com.springExpretion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{20+45}")
    private int x;

    @Value("#{demo.x+(demo.y=10)}")
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Demo() {
    }

    @Override
    public String toString() {
        return "Demo:-------------------" +
                "\n x = " + x +
                "\n y = " + y ;
    }
}
