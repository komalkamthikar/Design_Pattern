package com.structuralPattern.coffeeShop.Menu.module;

public class Sugar extends AddOn{

    public Sugar(Beverage bev) {
        super("Sugar", bev);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }
}
