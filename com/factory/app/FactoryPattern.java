package com.factory.app;

import com.factory.Factory.ShapeStore;
import com.factory.module.Shape;


public class FactoryPattern {

    public static void main(String[] args) {

               System.out.println("==Factory Pattern Demo==");
                ShapeStore shapeStore=new ShapeStore();
                Shape shape=shapeStore.getShape("rectangle");
                shape.draw();

            }
}
