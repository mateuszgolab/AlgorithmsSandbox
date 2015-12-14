package com.codility.ovo_energy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mgo12 on 05/11/2015.
 */
public class Solution3Test {

    private Solution3 solution3 = new Solution3();

    @Test
    public void test1() {

        assertThat(solution3.solution(new int[]{5, 2, 4, 6, 3, 7}), is(5));

    }


    @Test
    public void test2() {

        assertThat(solution3.solution(new int[]{30, 2, 10, 500, 50, 700}), is(30));

    }
}
