package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculateTestSuite {

    @Test
    public void testPost1000() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(1000, avPost);
        Assert.assertEquals(1, avCom);
        Assert.assertEquals(0, avCperP);
    }
    @Test
    public void testPost0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(0, avPost);
        Assert.assertEquals(1, avCom);
        Assert.assertEquals(0, avCperP);
    }
    @Test
    public void testComment0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(1, avPost);
        Assert.assertEquals(0, avCom);
        Assert.assertEquals(0, avCperP);
    }
    @Test
    public void testCommentLowerThanPosts() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(10);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(10, avPost);
        Assert.assertEquals(1, avCom);
        Assert.assertEquals(0, avCperP);
    }
    @Test
    public void testPostLowerThanComments() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1);
        when(statisticMock.commentsCount()).thenReturn(10);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList("test"));

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(1, avPost);
        Assert.assertEquals(10, avCom);
        Assert.assertEquals(10, avCperP);
    }
    @Test
    public void testUser0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(Arrays.asList());

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(0, avPost);
        Assert.assertEquals(0, avCom);
        Assert.assertEquals(1, avCperP);
    }
    @Test
    public void testUser100() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> list = new ArrayList<String>();
        for(int i=0; i<100; i++) {
            list.add(new String("a"));
        }
        CalculateStatistics calculate = new CalculateStatistics();
        when(statisticMock.postsCount()).thenReturn(1);
        when(statisticMock.commentsCount()).thenReturn(1);
        when(statisticMock.usersNames()).thenReturn(list);

        //When
        calculate.calculateAdvStatistics(statisticMock);
        int avPost = calculate.getAveragePost();
        int avCom = calculate.getAverageComment();
        int avCperP = calculate.getAverageCperP();

        //Then
        Assert.assertEquals(0, avPost);
        Assert.assertEquals(0, avCom);
        Assert.assertEquals(1, avCperP);
    }
}
