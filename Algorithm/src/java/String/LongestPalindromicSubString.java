package String;

/**
 * Created by rbhatt22 on 12/11/19.
 */
public class LongestPalindromicSubString {

    public String longestPalindrome(String s) {
        String palindromicString = "";

        int size = s.length();
        for (int i = 0; i < size-1; i ++) {
            for (int j = size; j > i+1; j --) {
                String ss = s.substring(i,j);
                if (isPalindromic(ss)) {
                    if (palindromicString.isEmpty() || palindromicString.length() < ss.length()) {
                        palindromicString = ss;
                    }
                }
            }
        }
        if (!palindromicString.isEmpty()) {
            return palindromicString;
        }
        if (!s.isEmpty()) {
            return s.substring(0,1);
        }
        return s;
    }

    boolean isPalindromic(String s) {
        int size = s.length();

        //Odd size string
        if (size%2 != 0) {
            int mid = (size + 1) / 2;
            String left = s.substring(0,mid-1);
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(mid, size));
            String right = sb.reverse().toString();
            return left.equals(right);
        } else { //even size string
            int mid = size/2;
            String left = s.substring(0,mid);
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(mid, size));
            String right = sb.reverse().toString();
            return left.equals(right);
        }
    }

    public static void main(String[] args) {
        LongestPalindromicSubString ob = new LongestPalindromicSubString();

        String a = "abcba";
        String b = "cbbd";
        String c = "abacab";
        String d = "ac";
        String e = "";

        System.out.println(ob.longestPalindrome(a));
        System.out.println(ob.longestPalindrome(b));
        System.out.println(ob.longestPalindrome(c));
        System.out.println(ob.longestPalindrome(d));
        System.out.println(ob.longestPalindrome(e));

    }

}
