package com.codility;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class EquilibriumIndex {

    public static int solution(int[] A) {
        long sum = 0;
        for(int i = 0 ; i < A.length; i++) {
            sum += A[i];
        }

        long subtractor = 0;

        for(int i = A.length - 1; i >= 0; i--) {
            sum -= A[i];
            if(sum == subtractor) return i;
            subtractor += A[i];
        }

        return -1;

    }
}
