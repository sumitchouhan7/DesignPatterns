package org.example.design.pattern.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() +"  cost:"+simpleCoffee.getPrice());

        CoffeeDecorator coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println(coffeeWithMilk.getDescription() +"  cost:"+coffeeWithMilk.getPrice());

        CoffeeDecorator coffeeWithSugarAndMilk = new SugarDecorator(coffeeWithMilk);
        System.out.println(coffeeWithSugarAndMilk.getDescription() +"  cost:"+coffeeWithSugarAndMilk.getPrice());
    }
}
