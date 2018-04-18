package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Array {
    private int[] numbers = new int[20];
    private List<Integer> av1;
    private double av2;

    public void getAverage(int[] numbers) {
        av1 = IntStream.range(0, numbers.length-1)
                .collect(toList());

        av2 = IntStream.range(0, numbers.length-1)
                .average();
    }
    public List<Integer> getAv1() {
        return new ArrayList<>(av1);
    }
    public double getAv2() {
        return this.av2;
    }
}
