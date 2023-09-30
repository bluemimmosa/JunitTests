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
    }

}
