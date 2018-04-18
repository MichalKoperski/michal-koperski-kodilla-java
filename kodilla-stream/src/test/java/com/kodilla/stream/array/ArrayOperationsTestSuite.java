package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ArrayOperationsTestSuite {
    @Test
    public void testAverage() {
        //Given
        ArrayOperations arrayOperationsMock = mock(ArrayOperations.class);

        Array arrayNumbers = new Array();
        int sum = 0;
        int[] numery = new int[];
        for (int i = 0; i < 20; i++) {
            int[i] =i;
            sum += i;
        }
        when(arrayOperationsMock.getAv2()).thenReturn(sum / numery.length);

        //When

        double av2 = arrayNumbers.getAv2();

        //Then
        Assert.assertEquals(sum / numery.length, av2);

    }
}
