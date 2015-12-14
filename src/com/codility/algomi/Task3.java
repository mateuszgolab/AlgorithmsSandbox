package com.codility.algomi;

import java.util.Arrays;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class Task3 {

    public int solution(int[] A) {

        if (A.length < 2) return 0;

        Arrays.sort(A);

        final long N = 1000000000;

        long pairsCount = 0;
        int elem = A[0];
        long counter = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == elem) counter++;
            else {
                pairsCount += (counter * (counter + 1) / 2);
                if (pairsCount > N) return (int) N;
                counter = 0;
                elem = A[i];
            }
        }

        if (counter > 0) {
            pairsCount += (counter * (counter + 1) / 2);
            if (pairsCount > N) return (int) N;
        }


        return (int) pairsCount;
    }


}
