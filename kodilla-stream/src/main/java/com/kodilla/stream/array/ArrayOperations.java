package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(t -> numbers[t])
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .map(t -> numbers[t])
                .average()
                .getAsDouble();
    }
}