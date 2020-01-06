package Sorting;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/27/19.
 * Quicksort with Pivot as first element of the array
 */
public class QuickSortAlgoAlt {

    public void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pIndex = partition(a, start, end);
            quickSort(a, start, pIndex - 1);
            quickSort(a, pIndex + 1, end);
        }
    }

    public int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int pIndex = end;

        for (int i = end; i > start; i--) {
            if (a[i] > pivot) {
                swap(a, pIndex, i);
                pIndex--;
            }
        }
        swap(a, pIndex, start);
        return pIndex;
    }

    public void swap(int[] a, int indexA, int indexB) {
        int temp = a[indexA];
        a[indexA] = a[indexB];
        a[indexB] = temp;
    }

    public static void main(String[] args) {

        int[] a = {7, 2, 1, 6, 8, 5, 3, 4};

        QuickSortAlgoAlt qs = new QuickSortAlgoAlt();
        qs.quickSort(a, 0, a.length - 1);

        System.out.println("Sorted");
        Arrays.stream(a).forEach(System.out::print);

    }


}
