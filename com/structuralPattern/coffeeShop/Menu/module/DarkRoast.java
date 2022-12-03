package com.structuralPattern.coffeeShop.Menu.module;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("Dark roast");
    }

    @Override
    public double cost() {
        return 300;
    }
}
