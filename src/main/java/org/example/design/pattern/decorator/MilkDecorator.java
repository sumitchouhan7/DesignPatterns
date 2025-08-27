package org.example.design.pattern.decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +", with milk";
    }
}
