package org.example.design.pattern.decorator;

public class SimpleCoffee implements Coffee {


    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getPrice() {
        return 50.0;
    }
}
