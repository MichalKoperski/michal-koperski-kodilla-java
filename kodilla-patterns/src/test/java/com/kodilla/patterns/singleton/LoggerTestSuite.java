package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getInstance().log("jest 1 log");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Opened: " + lastLog);
        //Then
        Assert.assertEquals("jest 1 log", lastLog);
    }
}
