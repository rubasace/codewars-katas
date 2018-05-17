package com.rubasace.codewars.katas;

import java.util.stream.IntStream;

public class Primes {

    public static IntStream stream() {
        return IntStream.iterate(2, i -> i + 1)
                        .filter(Primes::isPrime);
    }

    private static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }
}
