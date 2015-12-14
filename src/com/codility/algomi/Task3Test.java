package com.codility.algomi;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class Task3Test {

    private Task3 task3 = new Task3();


    @Test
    public void test1() {
        assertTrue(task3.solution(new int[]{3, 5, 6, 3, 3, 5}) == 4);
    }

    @Test
    public void test2() {
        assertTrue(task3.solution(new int[]{}) == 0);
    }


    @Test
    public void test3() {
        assertTrue(task3.solution(new int[]{1000000000, 1000000000}) == 1);
    }

    @Test
    public void test4() {
        assertTrue(task3.solution(new int[]{1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000}) == 15);
    }


    @Test
    public void test5() {

        assertTrue(task3.solution(new int[100000]) == 1000000000);
    }

    @Test
    public void test6() {

        assertTrue(task3.solution(new int[3]) == 3);


    }

    @Test
    public void test7() {

        assertTrue(task3.solution(new int[]{1,2,3,4,5,6,7,8,9}) == 0);
    }

    @Test
    public void test8() {
        assertTrue(task3.solution(new int[]{1,2,3,4,5,6,7,8,9,1}) == 1);
    }

    @Test
    public void test9() {
        assertTrue(task3.solution(new int[]{1}) == 0);
    }

    @Test
    public void test10() {
        assertTrue(task3.solution(new int[]{1,2}) == 0);
    }

    @Test
    public void test11() {
        assertTrue(task3.solution(new int[]{1,1}) == 1);
    }

    @Test
    public void test12() {

        assertTrue(task3.solution(new int[]{-1000000,-1000000,1000000}) == 1);
    }

    @Test
    public void test13() {

        assertTrue(task3.solution(new int[]{-34, 4,65, -5464, 6,23, 34, 34, 23, 34}) == 4);
    }

}