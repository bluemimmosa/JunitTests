package com.niraj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void test(){
        MathUtils mu = new MathUtils();
        int expected = 2;
        int actual = mu.add(1, 1);
        assertEquals(expected, actual);

        /*
        Various Assertions
        assertEquals(expected, actual)
        Asserts that expected and actual are equal.

        assertArrayEquals(expectedArray, actualArray)
        Verifies each item in the arrays are equal in the right position

        assertIterableEquals(expectedArray, actualArray)
        verifies each item in the iterable are equal in the corresponding positions.
         */
    }

}
