package com.rubasace.codewars.katas;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void testCheckPalindrome() {
        assertTrue(Palindrome.checkPalindrome("abba"));
        assertTrue(Palindrome.checkPalindrome("abcba"));
        assertFalse(Palindrome.checkPalindrome("abbb"));
        assertFalse(Palindrome.checkPalindrome("abcbae"));
    }
}