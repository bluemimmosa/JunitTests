package com.niraj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd(){
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

    @Test
    void testCircleArea(){
        MathUtils mu = new MathUtils();

        float expected = 31.416F;
        float actual = mu.computeCircleArea(5);
        assertEquals(expected, actual, "The circle area should be calculated by the function.");
    }

    @Test
    void divideTest(){
        MathUtils mu = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mu.div(1,0), "Divide by zero should throw.");
    }

}
