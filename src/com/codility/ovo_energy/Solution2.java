package com.codility.ovo_energy;

import java.util.Arrays;

/**
 * Created by mgo12 on 05/11/2015.
 */
public class Solution2 {

    public boolean solution(int[] A) {

        int notSorted[] = Arrays.copyOf(A, A.length);
        Arrays.sort(A);

        int swapCounter = 0;

        for(int i = 0; i < A.length; i++) {
            if(notSorted[i] != A[i]) {
                swapCounter++;
                if(swapCounter > 2) return false;
            }
        }

        return true;


    }


}
