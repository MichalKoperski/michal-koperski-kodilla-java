package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;

public class CollectionTestSuite {
    private static int counter = 0;

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        Assert.assertEquals(0, oddext.exterminate(number).size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        Assert.assertEquals(5, oddext.exterminate(number).size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList2() {
        List<Integer> number = new ArrayList<Integer>();
        OddNumbersExterminator oddext = new OddNumbersExterminator();
        for (int i = 100; i >= 0; i--) {
            number.add(i);
        }
        Assert.assertEquals(51, oddext.exterminate(number).size());
    }

    @Before
    public void before() {
        counter++;
        if (counter == 1) {
            System.out.println("Testing case when list is empty");
        }
        if (counter == 2) {
            System.out.println("Testing case when list contains 10 digits");
        }
        if (counter == 3) {
            System.out.println("Testing case when list contains 100 digits");
        }
    }
        @After
        public void after() {
            if (counter == 1) {
                System.out.println("Test with empty list: pass");
            }
            if (counter == 2) {
                System.out.println("Test with 10 digits list: pass");
            }
            if (counter == 3) {
                System.out.println("Test with 100 digits list: pass");
            }
        }
    }



