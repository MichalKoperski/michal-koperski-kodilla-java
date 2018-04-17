package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    List<Integer> evenNumbers = new ArrayList<Integer>();

    public List<Integer> exterminate(List<Integer> numbers) {
        for(int i=0; i<numbers.size(); i++) {
            Integer temp = numbers.get(i);
                if (temp % 2 == 0) {
                    evenNumbers.add(temp);
                }
        }
        return evenNumbers;
    }
}