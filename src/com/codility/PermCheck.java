package com.codility;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class PermCheck {

    public int solution(int[] A) {
        boolean[] visited = new boolean[A.length];
        int count = A.length;

        for(int i : A) {
            if(i <= A.length && !visited[i-1]) {
                visited[i-1] = true;
                count--;
            } else {
                return 0;
            }
        }

        return count == 0 ? 1: 0;

    }
}
