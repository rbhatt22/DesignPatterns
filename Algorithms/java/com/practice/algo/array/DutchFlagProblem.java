package com.practice.algo.array;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 01/13/19.
 * Problem: Sort an array consists of 0, 1, 2.
 * Solution: DutchFlagProblem algorithm.
 */
public class DutchFlagProblem {

    //number of elements in array
    private int n;
    private int[] ar;

    public DutchFlagProblem(int n, int[] ar) {
        this.n = n;
        this.ar = ar;
    }

    private void execute(int[] ar) {
        int low = 0;
        int mid = 0;
        int high = ar.length - 1;

        while (mid <= high) {
            if (ar[mid] == 0) {
                swap(ar, mid, low);
                mid++;
                low++;
            } else if (ar[mid] == 1) {
                mid++;
            } else if (ar[mid] == 2) {
                swap(ar, mid, high);
                high--;
            }
        }
        //return ar;
    }

    private void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] ar = new int[]{0, 1, 2, 0, 1, 2, 1, 0};

        DutchFlagProblem dfp = new DutchFlagProblem(n, ar);
        System.out.println("Array before sorting: ");
        Arrays.stream(dfp.ar).forEach(x -> System.out.print(" " + x + " "));
        System.out.println();
        dfp.execute(ar);
        System.out.println("Array after sorting: ");
        Arrays.stream(dfp.ar).forEach(x -> System.out.print(" " + x + " "));
    }
}
