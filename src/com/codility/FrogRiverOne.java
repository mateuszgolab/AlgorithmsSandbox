package com.codility;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        boolean [] fallen = new boolean[X];

        for(int i=0; i < A.length; i++) {
            if(!fallen[A[i] - 1]) {
                fallen[A[i] - 1] = true;
                X--;
            }
            if(X == 0) return i;
        }

        return -1;
    }
}
