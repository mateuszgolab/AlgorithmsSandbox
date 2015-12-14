package com.codility;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class PermMissingElem {

    public int solution(int[] A) {
        long sum = ((A.length + 1) * (A.length + 2)) / 2;

        for (int i : A) {
            sum -= i;
        }

        return (int) sum;
    }


}
