package com.codility.ovo_energy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mgo12 on 05/11/2015.
 */
public class Solution2Test {

    private Solution2 solution2 = new Solution2();

    @Test
    public void test1() {
        assertTrue(solution2.solution(new int[]{1, 5, 3, 3, 7}));
    }

    @Test
    public void test2() {
        assertFalse(solution2.solution(new int[]{1, 3, 5, 3, 4}));
    }

    @Test
    public void test3() {
        assertFalse(solution2.solution(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void test4() {
        assertTrue(solution2.solution(new int[]{1, 3, 3, 3, 4}));
    }

    @Test
    public void test5() {
        assertTrue(solution2.solution(new int[]{1, 3, 6, 30, 40}));
    }


    @Test
    public void test6() {
        assertFalse(solution2.solution(new int[]{1, 3, 5, 3, 4, 5, 7}));
    }

    @Test
    public void test7() {
        assertFalse(solution2.solution(new int[]{1, 3, 5, 3, 4, 5, 4}));
    }

    @Test
    public void test8() {
        assertTrue(solution2.solution(new int[]{1, 3, 5, 3, 4, 5, 3}));
    }

    @Test
    public void test9() {
        assertFalse(solution2.solution(new int[]{1, 3, 5, 3, 4, 5, 3, 3, 3}));
    }

}
