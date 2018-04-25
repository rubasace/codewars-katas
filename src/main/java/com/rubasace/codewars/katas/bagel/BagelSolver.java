package com.rubasace.codewars.katas.bagel;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class BagelSolver {

    static {
        overrideTrue();
    }

    public static Bagel getBagel() {
        return new Bagel();
    }

    static void overrideTrue() {
        try {
            Field trueField = Boolean.class.getField("TRUE");

            trueField.setAccessible(true);

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(trueField, trueField.getModifiers() & ~Modifier.FINAL);

            trueField.set(null, false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}