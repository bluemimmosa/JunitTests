package com.niraj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingTest {
    @Test
    void sortTest(){
        SortingAlgo sa = new SortingAlgo();
        int[] expected = {1, 4, 4, 5, 8, 9, 12, 23, 43, 54, 79};
        int[] actual = sa.sort(new int[]{4,8,9,12,1,54,79,23,43,5,3}, 11);
        assertArrayEquals(expected, actual, "The eqals should check if both arraya re equal after soritng.");
    }
}
