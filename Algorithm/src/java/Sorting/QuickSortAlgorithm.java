package Sorting;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/27/19.
 * QucikSort algorithm.
 * Pivot is end of the array.
 */
public class QuickSortAlgorithm {

    public void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pIndex = partition(a, start, end);
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
    }

    public int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (a[i] < pivot) {
                    swap(a, pIndex, i);
                    pIndex++;
            }
        }
        swap(a, pIndex, end);
        return pIndex;
    }

    public void swap(int[] a, int indexA, int indexB) {
        int temp = a[indexA];
        a[indexA] = a[indexB];
        a[indexB] = temp;
    }

    public static void main(String[] args) {

        int[] a = {7, 2, 1, 6, 8, 5, 3, 4};

        QuickSortAlgorithm qs = new QuickSortAlgorithm();
        qs.quickSort(a, 0, a.length - 1);

        System.out.println("Sorted");
        Arrays.stream(a).forEach(System.out::println);

    }

}
