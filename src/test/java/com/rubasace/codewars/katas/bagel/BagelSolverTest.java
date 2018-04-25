package com.rubasace.codewars.katas.bagel;

import org.junit.Test;

public class BagelSolverTest {

    @Test
    public void testBagel() {
        Bagel bagel = BagelSolver.getBagel();

        org.junit.Assert.assertEquals(
                bagel.getValue() == 4,
                java.lang.Boolean.TRUE
        );
    }
}