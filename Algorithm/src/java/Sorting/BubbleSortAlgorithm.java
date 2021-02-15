package Sorting;

import java.util.Arrays;

//Bubble sort algorithm
public class BubbleSortAlgorithm {

    public void bubbleSort(int[] a) {
        int length = a.length;

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            //which each for loop we are putting highest unsorted number to its position.
            for (int i = 0; i < length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    isSorted = false;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] a = {2, 4, 1, 6, 8, 5, 3, 7};

        BubbleSortAlgorithm ob = new BubbleSortAlgorithm();
        ob.bubbleSort(a);

        Arrays.stream(a).forEach(System.out::print);

    }

}
