package com.creationalPattern.prototype.Prototype;

import java.util.Hashtable;

import com.creationalPattern.prototype.module.Circle;
import com.creationalPattern.prototype.module.Rectangle;
import com.creationalPattern.prototype.module.Shape;
import com.creationalPattern.prototype.module.Square;


public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap= new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape =shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle=new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square =new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }


}
