package com.codility;

/**
 * Created by mgo12 on 10/10/2015.
 */
public class Lesson1 {

    public static int solution(int[] A) {
        int sum = 0;
        for(int i = 0 ; i < A.length - 1; i++) {
            sum += A[i];
        }

        int subtractor = A[A.length-1];
        int min = Math.abs(sum - subtractor);

        for(int i = A.length - 1; i > 0; i--) {
            subtractor += A[i];
            sum -= A[i];
            int newValue = Math.abs(sum - subtractor);
            if(newValue < min) {
                min = newValue;
            }
        }

        return min;

    }
}