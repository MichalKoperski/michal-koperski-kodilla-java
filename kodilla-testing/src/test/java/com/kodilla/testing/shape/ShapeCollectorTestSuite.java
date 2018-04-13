package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(circle);

        //Then
        Assert.assertEquals(1, collector.list.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle = new Circle(6);
        ShapeCollector collector = new ShapeCollector();
        collector.removeFigure(circle);

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.list.size());
    }
    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector();

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle(5);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);

        //When
        Shape retrievedFigure;
        retrievedFigure = collector.list.get(0);

        //Then
        Assert.assertEquals(circle, retrievedFigure);
    }
}