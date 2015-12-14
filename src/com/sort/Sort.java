package com.sort;

/**
 * Created by mgo12 on 10/10/2015.
 */
public class Sort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(i, j, array);
                }
            }
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(0, array.length - 1, array);
    }

    public static void mergeSort(int[] array) {
        mergeSortHelper(0, array.length - 1, array);
    }


    private static void quickSortHelper(int low, int high, int[] array) {
        if (low < high) {
            int m = (high - low) / 2 + low;
            int pivot = array[m];
            int i = low;
            int j = high;

            while (i < j) {
                while (array[i] < pivot) i++;
                while (array[j] > pivot) j--;

                if (i <= j) {
                    swap(i, j, array);
                    i++;
                    j--;
                }
//                Main.print(array);
            }
            quickSortHelper(low, j, array);
            quickSortHelper(i, high, array);
        }

    }

    private static void mergeSortHelper(int low, int high, int[] array) {
        if(low < high) {
            int middle = low + (high - low) / 2;
            mergeSortHelper(low, middle, array);
            mergeSortHelper(middle + 1, high, array);
            merge(low, middle, high, array);
        }
    }

    private static void merge(int low, int middle, int high, int[] array) {
        int[] helper = new int[high-low+1];
        for(int i = low; i <= high; i++) {
            helper[i-low] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while(i <= middle && j <= high) {
            if(helper[i - low] < helper[j - low]) {
                array[k] = helper[i-low];
                i++;
            } else {
                array[k] = helper[j-low];
                j++;
            }
            k++;
        }

       for(;i<=middle;i++,k++) {
           array[k] = helper[i-low];
       }

       // not necessary to copy the rest from (middle , high) because it means it's already sorted

    }


    private static void swap(int i, int j, int[] array) {
        if(i == j) return;
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
