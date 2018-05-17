package com.rubasace.codewars.katas;

import java.util.stream.IntStream;

public class Palindrome {

    public static boolean checkPalindrome(final String abba) {
        int lastIndex = abba.length() - 1;

        return IntStream.range(0, abba.length() / 2)
                        .allMatch(i -> abba.charAt(i) == abba.charAt(lastIndex - i));
    }
}
