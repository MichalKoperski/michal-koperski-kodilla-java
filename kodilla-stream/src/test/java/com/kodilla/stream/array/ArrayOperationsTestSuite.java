package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        double sum = 0;
        int[] numery = new int[20];
        for (int i = 0; i < 20; i++) {
            numery[i] = i;
            sum += i;
        }

        //When
        double av = ArrayOperations.getAverage(numery);

        //Then
        Assert.assertEquals(sum / numery.length, av, 0.001);
    }
}