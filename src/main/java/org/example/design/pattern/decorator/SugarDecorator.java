package org.example.design.pattern.decorator;

public class SugarDecorator extends CoffeeDecorator {


    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",with sugar";
    }

    @Override
    public double getPrice() {
        return  coffee.getPrice() + 5.0;
    }
}
