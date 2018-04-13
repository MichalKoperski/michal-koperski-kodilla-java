package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {

    @Test
    public void testPost1000() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        int posts = 1000;

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int quantityOfPosts = calculate.getAV1();

        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }
}
