package com.kodilla.stream.array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        List<Integer> list = IntStream.range(0, numbers.length)
                .forEach(System.out::println)
        return IntStream.range(0, list.size())
                .average()
                .getAsDouble();
    }
}