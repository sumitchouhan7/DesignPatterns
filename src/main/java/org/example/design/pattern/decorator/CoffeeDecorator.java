package org.example.design.pattern.decorator;

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getPrice() {
        return  coffee.getPrice();
    }

}
