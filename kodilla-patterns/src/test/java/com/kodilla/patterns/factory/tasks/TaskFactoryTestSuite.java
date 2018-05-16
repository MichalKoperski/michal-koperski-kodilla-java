package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        ///Assert.assertEquals("groceries", shopping.getWhatToBuy());
       // Assert.assertEquals(4, shopping.getQuantity());

    }

    @Test
    public void testFactorySquare() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving", driving.getTaskName());
        //Assert.assertEquals("Warsaw", driving.getWhere());
        //Assert.assertEquals("car", driving.getUsing());
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
       // Assert.assertEquals("red", painting.getColor());
      //  Assert.assertEquals("wall", painting.getWhatToPaint());
    }
}
