package com.rubasace.codewars.katas;

import java.util.stream.IntStream;

class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        int numPreviousElements = numberOfElements(n - 1);
        int initialNumber = numPreviousElements * 2 + 1;
        return IntStream.range(0, n)
                        .map(e -> initialNumber + 2 * e)
                        .sum();
    }

    private static int numberOfElements(int n) {
        return (int) ((Math.pow(n, 2) + n) / 2);
    }
}