package com.factory.Factory;

import com.factory.module.Circle;
import com.factory.module.Rectangle;
import com.factory.module.Shape;

public class ShapeStore {
    public Shape getShape(String shapeType) {

        if(shapeType == null)
            return null;
        if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        if(shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        return null;

    }

}

