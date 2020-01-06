package Sorting;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/28/19.
 */
public class BubbleSortAlgorithm {

    public void bubbleSort(int[] a) {
        int length = a.length;

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
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
