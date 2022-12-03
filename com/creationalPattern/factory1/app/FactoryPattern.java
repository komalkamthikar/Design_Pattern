package com.creationalPattern.factory1.app;

import com.creationalPattern.factory1.Factory.ShapeStore;
import com.creationalPattern.factory1.module.Shape;


public class FactoryPattern {

    public static void main(String[] args) {

               System.out.println("==Factory Pattern Demo==");
                ShapeStore shapeStore=new ShapeStore();
                Shape shape=shapeStore.getShape("rectangle");
                shape.draw();

            }
}
