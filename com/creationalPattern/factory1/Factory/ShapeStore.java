package com.creationalPattern.factory1.Factory;

import com.creationalPattern.factory1.module.Circle;
import com.creationalPattern.factory1.module.Rectangle;
import com.creationalPattern.factory1.module.Shape;

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

