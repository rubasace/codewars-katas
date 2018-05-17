package com.rubasace.codewars.katas;

import java.util.OptionalLong;
import java.util.stream.LongStream;

class Bud {

    public static String buddy(long start, long limit) {
        OptionalLong firstBuddy = LongStream.range(start, limit)
                                            .filter(Bud::hasBudy)
                                            .findFirst();
        if (firstBuddy.isPresent()) {
            return "(" + firstBuddy.getAsLong() + " " + (s(firstBuddy.getAsLong()) - 1) + ")";
        }
        return "Nothing";
    }

    private static long s(final long number) {
        return LongStream.rangeClosed(1, (long) Math.sqrt(number))
                         .filter(e -> number % e == 0)
                         .flatMap(i -> LongStream.of(i, number / i))
                         .distinct()
                         .filter(e -> e < number)
                         .sum();
    }

    private static boolean hasBudy(final long number) {
        long buddy = s(number) - 1;
        return buddy > number && s(buddy) == number + 1;
    }
}