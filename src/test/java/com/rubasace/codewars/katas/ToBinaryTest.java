package com.rubasace.codewars.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToBinaryTest {

    @Test
    public void testToBinary() {
        assertEquals(1, ToBinary.toBinary(1));
        assertEquals(10, ToBinary.toBinary(2));
        assertEquals(11, ToBinary.toBinary(3));
        assertEquals(101, ToBinary.toBinary(5));
    }
}