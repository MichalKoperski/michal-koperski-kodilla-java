package com.kodilla.testing.shape;

import java.util.*;

class ShapeCollector {
    Shape shape;
    List<Shape> list;

    public ShapeCollector() {
        this.shape=shape;
        this.list=list;
    }
    public void addFigure(Shape shape) {
        list.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        if(list.contains(shape)) {
            list.remove(shape);
        }
        return true;
    }
    public Shape getFigure(int n) {
        return list.get(n);
    }
}