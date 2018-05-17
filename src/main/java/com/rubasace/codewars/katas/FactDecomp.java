package com.rubasace.codewars.katas;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FactDecomp {

    public static String decomp(int n) {

        Map<Integer, Long> primes = IntStream.rangeClosed(2, n)
                                             .parallel()
                                             .flatMap(FactDecomp::decompNumber)
                                             .boxed()
                                             .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        return primes.keySet().stream()
                     .sorted()
                     .map(e -> printPrime(e, primes.get(e)))
                     .collect(Collectors.joining(" * "));
    }

    private static String printPrime(int number, long pow) {
        String suffix = "";
        if (pow > 1) {
            suffix = "^" + pow;
        }
        return number + suffix;
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .noneMatch(i -> number % i == 0);
    }

    private static IntStream decompNumber(int number) {
        if (isPrime(number)) {
            return IntStream.of(number);
        }
        return IntStream.rangeClosed((int) Math.sqrt(number), number - 2)
                        .map(e -> number - e)
                        .filter(e -> number % e == 0)
                        .limit(1)
                        .flatMap(e -> IntStream.concat(decompNumber(e), decompNumber(number / e)));
    }
} 