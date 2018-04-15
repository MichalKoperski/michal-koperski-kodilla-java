package com.kodilla.testing.shape;

import java.util.*;

class ShapeCollector {
    List<Shape> list = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        list.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(list.contains(shape)) {
            list.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        return list.get(n);
    }
}