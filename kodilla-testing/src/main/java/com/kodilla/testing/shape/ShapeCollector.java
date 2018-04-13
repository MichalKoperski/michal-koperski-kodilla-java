package com.kodilla.testing.shape;

import java.util.*;
interface Shape {

    String getShapeName();
    Double getField();
}
class Square implements Shape {
    double a;
    public Square(double a) {
        this.a=a;
    }
    public String getShapeName() {
        return "square";
    }
    public Double getField() {
        return a*a;
    }
}
class Triangle implements Shape {
    double b;
    double h;
    public Triangle(double b, double h) {
        this.b=b;
        this.h=h;
    }
    public String getShapeName() {
        return "triangle";
    }
    public Double getField() {
        return b*h/2;
    }
}
class Circle implements Shape {
    double r;
    public Circle(double r) {
        this.r=r;
    }
    public String getShapeName() {
        return "circle";
    }
    public Double getField() {
        return 3.14*r*r;
    }
}
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
        if(list.size()!=0) {
            list.remove(shape);
        }
        return true;
    }
    public Shape getFigure(int n) {
        return list.get(n);
    }
}