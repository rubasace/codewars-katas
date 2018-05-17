package com.rubasace.codewars.katas;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

public class RemovedNumbers {

    public static List<long[]> removNb(long n) {

        long sum = ((n + 1) * n / 2);
        long minMultiplication = sum - 2 * n + 1;
        long minCandidate = (long) Math.sqrt(minMultiplication);

        LinkedList<long[]> list = new LinkedList<>();

        LongStream.rangeClosed(minCandidate, n)
                  .mapToObj(a -> new long[]{a, calculateB(a, sum)})
                  .filter(longs -> longs[0] > longs[1])
                  .filter(longs -> longs[1] <= n)
                  .filter(longs -> longs[0] * longs[1] == sum - longs[0] - longs[1])
                  .forEach(longs -> addArrays(list, longs));

        return list;
    }

    private static long calculateB(long a, long sum) {
        // sum -a  / (a+1) =  b
        return (sum - a) / (a + 1);
    }

    private static void addArrays(final LinkedList<long[]> list, final long[] longs) {
        list.addFirst(new long[]{longs[1], longs[0]});
        list.add(longs);
    }
}