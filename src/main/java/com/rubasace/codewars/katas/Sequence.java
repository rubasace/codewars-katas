package com.rubasace.codewars.katas;

import java.util.stream.IntStream;

public class Sequence {

    public static int[] reverse(int n) {
        return IntStream.range(0, n)
                        .map(e -> n - e)
                        .toArray();
    }
}