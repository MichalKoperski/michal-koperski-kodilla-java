package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        assertEquals(0, oddext.exterminate(number).size());
    }
    @Test
    public void testOddNumbersExterminatorListWith10Digits() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        assertEquals(5, oddext.exterminate(number).size());
    }
    @Test
    public void testOddNumbersExterminatorListWith100Digits() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        for (int i = 100; i >= 0; i--) {
            number.add(i);
        }
        assertEquals(51, oddext.exterminate(number).size());
    }
    @Before
    public void before() {
        System.out.println("Now we test: "+name.getMethodName());
    }
    @After
    public void after() {
        System.out.println("Test: "+name.getMethodName()+": passed");
    }
}