package com.rubasace.codewars.katas;

import java.util.stream.IntStream;

public class Positive {

    public static int sum(int[] arr) {
        return IntStream.of(arr)
                        .filter(e -> e > 0)
                        .sum();
    }
}