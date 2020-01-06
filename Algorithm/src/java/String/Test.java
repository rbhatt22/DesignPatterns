package String;

import java.util.Arrays;

/**
 * Created by rbhatt22 on 12/28/19.
 */
public class Test {

    public static  void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = {4, 5, 6, 7};

        if (Arrays.equals(a, b)) {
            System.out.println("a is same as b");
        } else {
            System.out.println("a is not same as b");
        }
        if (Arrays.equals(a, c)) {
            System.out.println("a is same as c");
        } else {
            System.out.println("a is not same as c");
        }

    }

}
