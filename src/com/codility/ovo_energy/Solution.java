package com.codility.ovo_energy;

/**
 * Created by mgo12 on 05/11/2015.
 */
public class Solution {

    public int solution(String S) {

        int max = -1;

        String replaceDigits = S.replaceAll("[0-9]", " ");
        String[] subStrings = replaceDigits.split(" ");

        for (String s : subStrings) {
            if (s.length() > max && hasCapital(s)) {
                max = s.length();
            }
        }

        return max;
    }

    private boolean hasCapital(String s) {
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') return true;
        }
        return false;
    }


}
