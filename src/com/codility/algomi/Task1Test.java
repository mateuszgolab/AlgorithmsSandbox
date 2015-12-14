package com.codility.algomi;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class Task1Test {

    private Task1 task1 = new Task1();


    @Test
    public void test1() {
        assertTrue(task1.solution("We test coders.") == 3);
    }

    @Test
    public void test2() {
        assertTrue(task1.solution("Forget  CVs..Save time . x x") == 2);
    }


    @Test
    public void test3() {
        assertTrue(task1.solution(" Give us a try?") == 4);
    }

    @Test
    public void test4() {
        assertTrue(task1.solution(" Give  us  a  try ? ") == 4);
    }


    @Test
    public void test5() {
        assertTrue(task1.solution("fdf") == 0);
    }

    @Test
    public void test6() {
        assertTrue(task1.solution("fdf. this is not a sentence") == 1);
    }

    @Test
        public void test7() {
        assertTrue(task1.solution("???????? .... !!! ! !") == 0);
    }

    @Test
    public void test8() {
        assertTrue(task1.solution("   ") == 0);
    }

    @Test
    public void test9() {
        assertTrue(task1.solution("") == 0);
    }

    @Test
    public void test10() {
        assertTrue(task1.solution("ASDASDASD. ASDASD ASfDASD ASDdsASD?!") == 3);
    }

    @Test
    public void test11() {
        assertTrue(task1.solution(" ??ASDASDASD. ?ASDASD?? ASfDASD? ASDdsASD?!") == 1);
    }

    @Test
    public void test12() {
        assertTrue(task1.solution("   ?.!    s s s s s s     s s s s s s s s s s s s s s            .!?") == 20);
    }

    @Test
    public void test13() {
        assertTrue(task1.solution("a") == 0);
    }

    @Test
      public void test14() {
        assertTrue(task1.solution("?") == 0);
    }

    @Test
    public void test15() {
        assertTrue(task1.solution("a?") == 1);
    }

    @Test
    public void test16() {
        assertTrue(task1.solution("a a a a ? sdfsfsdfsd sdf sd sf sf  ") == 4);
    }

    @Test
    public void test17() {
        assertTrue(task1.solution("a.a.a.a.a.a.a") == 1);
    }



}