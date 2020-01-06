package Sorting;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/28/19.
 */
public class InsertionSortAlgorithm {

    public void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        int[] a = {12, 11, 13, 5, 6};

        InsertionSortAlgorithm ob = new InsertionSortAlgorithm();
        ob.insertionSort(a);

    }

}
