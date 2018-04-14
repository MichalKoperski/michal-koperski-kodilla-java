package com.kodilla.testing.shape;

class Triangle implements Shape {
    private double b;
    private double h;
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