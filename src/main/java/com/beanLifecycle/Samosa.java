package com.beanLifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Samosa(double price) {
        this.price = price;
    }

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init()
    {
        System.out.println("Inside Init method");
    }

    public void destroy()
    {
        System.out.println("Inside destroy method");
    }
}
