package com.codility.algomi;

/**
 * Created by mgo12 on 11/10/2015.
 */
public class Task1 {

    public int solution(String S) {

        StringBuilder sb = new StringBuilder(S.trim());

        // make sure sentence ends with .?!
        int i = sb.length() - 1;
        while (i >= 0 && sb.charAt(i) != '?' && sb.charAt(i) != '.' && sb.charAt(i) != '!') {
            sb.deleteCharAt(i);
            i--;
        }

        if(sb.length() == 0) return 0;

        String[] sentences = sb.toString().split("\\?|\\.|\\!");

        int max = 0;
        for (String sentence : sentences) {
            String trimmed = sentence.trim();
            if(!trimmed.isEmpty()) {
                int sentenceLength = trimmed.split("\\s+").length;
                if (sentenceLength > max) max = sentenceLength;
            }
        }

        return max;
    }

}
