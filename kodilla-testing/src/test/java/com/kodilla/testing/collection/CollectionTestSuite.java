package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        System.out.println("Empty list: pass");
        Assert.assertEquals(0, oddext.exterminate(number).size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        System.out.println("Normal list: pass");
        Assert.assertEquals(5, oddext.exterminate(number).size());
    }
    @Before
    public void before() {
        System.out.println("Testing new case");
    }
    @After
    public void after() {
        System.out.println("Case was tested");
    }
}


