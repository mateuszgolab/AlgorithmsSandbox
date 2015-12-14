package com.codility;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class Frog {

    public int solution(int X, int Y, int D) {
        int distance = Y-X;
        int steps = distance / D;
        if((distance % D) == 0) return steps;
        else return steps + 1;
    }
}
