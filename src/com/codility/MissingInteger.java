package com.codility;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class MissingInteger {

    public int solution(int[] A) {
        boolean[] visited = new boolean[A.length];
        for(int i : A) {
            if(i > 0 && i <= A.length && !visited[i-1]) {
                visited[i-1] = true;
            }
        }

        for(int i = 0; i < visited.length; i++) {
            if(!visited[i]) return i+1;
        }

        return A.length + 1;
    }
}
