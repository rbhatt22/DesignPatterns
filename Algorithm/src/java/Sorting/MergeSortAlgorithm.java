package Sorting;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/28/19.
 */
public class MergeSortAlgorithm {

    public void mergeSort(int[] a) {
        int length = a.length;
        //exit condition
        if (length < 2) {
            return;
        }

        //setup left and right arrays
        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < length; i++) {
            right[i - mid] = a[i];
        }

        //Make recursive call on left and right arrays
        mergeSort(left);
        mergeSort(right);

        //Merge left and right into original array
        merge(left, right, a);
    }

    public void merge(int[] left, int[] right, int[] a) {

        //get
        int lengthL = left.length;
        int lengthR = right.length;

        int i = 0, j = 0, k = 0;

        while (i < lengthL && j < lengthR) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < lengthL) {
            a[k] = left[i];
            k++;
            i++;
        }
        while (j < lengthR) {
            a[k] = right[j];
            k++;
            j++;
        }

    }

    public static void main(String[] args) {
        int[] a = {2, 4, 1, 6, 8, 5, 3, 7};

        MergeSortAlgorithm ob = new MergeSortAlgorithm();
        ob.mergeSort(a);

        System.out.println("Sorted Array");
        Arrays.stream(a).forEach(System.out::print);
    }

}
