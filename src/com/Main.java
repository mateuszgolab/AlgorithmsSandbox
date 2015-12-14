package com;

import com.codility.algomi.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.solution("We test coders. Give us a try? Give  us  a  try."));
    }

    public static int[] getRandomArray(int n) {
        Random random = new Random();
        int result[] = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = Math.abs(random.nextInt(100));
        }

        return result;
    }

    public static List<Integer> getRandomList(int n) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>(n);
        for(int i = 0; i < n;i++) {
            list.add(Math.abs(random.nextInt(3)));
        }

        return list;

    }

    public static void print(int[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void print(List<Integer> list) {
        for(Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
