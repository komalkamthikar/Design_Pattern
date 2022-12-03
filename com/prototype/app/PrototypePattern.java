package com.prototype.app;

import com.prototype.Prototype.ShapeCache;
import com.prototype.module.*;

public class PrototypePattern {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1=(Shape) ShapeCache.getShape("1");
        System.out.println("Shape: "+clonedShape1.getType());

        Shape clonedShape2=(Shape) ShapeCache.getShape("2");
       System.out.println("Shape: "+clonedShape2.getType());

        Shape clonedShape3=(Shape) ShapeCache.getShape("3");
        System.out.println("Shape: "+clonedShape3.getType());


    }
}