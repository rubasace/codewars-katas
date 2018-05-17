package com.rubasace.codewars.katas;

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(final int[] ints) {
        return Arrays.stream(ints)
                     .min()
                     .orElseThrow(() -> new IllegalArgumentException("No numbers found"));
    }
}
