package com.codility.ovo_energy;

/**
 * Created by mgo12 on 05/11/2015.
 */
public class Solution3 {

    public int solution(int[] A) {
        int min = 1000000000;
        int index = -1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] < min) {
                min = A[i];
                index = i;
            }
        }

        int min2 = 1000000000;
        int index2 = -1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] < min2 && i != index && (i+1) != index && (i-1) != index) {
                min2 = A[i];
                index2 = i;
            }
        }

        int min3 = 1000000000;
        int index3 = -1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] < min3 && i != index2 && (i+1) != index2 && (i-1) != index) {
                min3 = A[i];
                index3 = i;
            }
        }

        return (A[index] + A[index2]) < (A[index3] + A[index2])?(A[index] + A[index2]):(A[index3] + A[index2]);

    }

}
