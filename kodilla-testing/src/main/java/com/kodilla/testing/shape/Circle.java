package com.kodilla.testing.shape;

class Circle implements Shape {
   private double r;
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