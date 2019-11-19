package array;

import static java.lang.Integer.max;

/**
 * Created by rbhatt22 on 01/16/19.
 * Problem: Find sub array with maximum sum
 * Solution: Kadane's algorithm
 */
public class MaxSumSubArray {

    private int[] a;

    public MaxSumSubArray(int[] a) {
        this.a = a;
    }

    private int execute () {

        int local_sum = 0;
        int global_sum  = Integer.MIN_VALUE;

        int subArrayStart = 0;
        int subArrayEnd = 0;

        for (int i = 0; i < a.length; i++) {
            local_sum = max(a[i], a[i] + local_sum);
            if (local_sum >= global_sum) {
                global_sum = local_sum;
                if (i == subArrayEnd + 1) {
                    subArrayEnd++;
                } else {
                    subArrayStart = i;
                    subArrayEnd = i;
                }
            }
        }
        System.out.println("Max Sub Array is starting at index:" + subArrayStart + " and ending at index:" + subArrayEnd);
        return global_sum;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, -2, -3, 2, 3, 1};

        MaxSumSubArray ob = new MaxSumSubArray(a);

        System.out.println(ob.execute());
    }

}
