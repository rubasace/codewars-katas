package com.rubasace.codewars.katas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.range(a, b + 1)
                         .filter(SumDigPower::digPow)
                         .boxed()
                         .collect(Collectors.toList());
    }

    private static boolean digPow(final long number) {
        long processedNumber = number;
        int digitIndex = (int) Math.log10(number) + 1;
        long digPow = 0L;
        int digit;

        while (digitIndex > 0 && digPow <= number) {
            digit = (int) (processedNumber % 10);

            digPow += Math.pow(digit, digitIndex);

            processedNumber /= 10;
            digitIndex--;
        }

        return digPow == number;
    }
}