package com.codility.ovo_energy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mgo12 on 05/11/2015.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertThat(solution.solution("a0Ba"), is(2));
    }

    @Test
    public void test2() {
        assertThat(solution.solution("aBa"), is(3));
    }

    @Test
    public void test3() {
        assertThat(solution.solution("a0bb"), is(-1));
    }


    @Test
    public void test4() {
        assertThat(solution.solution("23423425"), is(-1));
    }

    @Test
    public void test5() {
        assertThat(solution.solution("asfasdgsg"), is(-1));
    }

    @Test
    public void test6() {
        assertThat(solution.solution("Aaaaa"), is(5));
    }

    @Test
    public void test7() {
        assertThat(solution.solution("6asdA"), is(4));
    }

    @Test
    public void test8() {
        assertThat(solution.solution("sd5sdf6sdf6A4"), is(1));
    }

    @Test
    public void test9() {
        assertThat(solution.solution("a"), is(-1));
    }

    @Test
    public void test10() {
        assertThat(solution.solution("5"), is(-1));
    }

    @Test
    public void test11() {
        assertThat(solution.solution("V"), is(1));
    }

    @Test
    public void test12() {
        assertThat(solution.solution("4VBSDSD4"), is(6));
    }



}
