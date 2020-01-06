package Sorting;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/30/19.
 */
public class SelectionSortAlgorithm {

    public void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n-1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            swap(a, min_index, i);
        }

        System.out.println(Arrays.toString(a));
    }

    public void swap(int[] a, int indexI, int indexJ) {
        int temp = a[indexI];
        a[indexI] = a[indexJ];
        a[indexJ] = temp;
    }

    public static void main(String[] args) {

        int[] a = {64, 25, 12, 22, 11};

        SelectionSortAlgorithm ob = new SelectionSortAlgorithm();
        ob.selectionSort(a);

    }

}
