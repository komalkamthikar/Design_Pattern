package com.behavioralPattern.Resturant.module;

public class Order {
    private Chef chef;
    private String food;

    public Order(Chef chef, String food) {
        this.chef = chef;
        this.food = food;
    }


    public void execute(){
        if (this.food.equals("Pasta")) {
            this.chef.cookPasta();
        } else {
            this.chef.bakeCake();
        }
    }

}
