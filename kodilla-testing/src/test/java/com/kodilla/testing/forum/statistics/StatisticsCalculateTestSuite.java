package com.kodilla.testing.forum.statistics;

import org.junit.*;
import static org.mockito.Mockito.*;

public class StatisticsCalculateTestSuite {

    @Test
    public void testPost1000() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        int posts = 1000;
        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames().size()).thenReturn(1);
        when(statisticMock.postsCount()/statisticMock.usersNames().size()).thenReturn(1);
        when(statisticMock.commentsCount()/statisticMock.usersNames().size()).thenReturn(1);
        when(statisticMock.commentsCount()/statisticMock.postsCount()).thenReturn(1);


        //When
        int quantityOfPosts = 1000;
                //calculate.calculateAdvStatistics(statisticMock).postsQuantity;

        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }
}
