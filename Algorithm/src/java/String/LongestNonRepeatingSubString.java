package String;

/**
 * Created by rbhatt22 on 12/11/19.
 * Problem: Find longest non repeating substring from given string
 * Solution: Linear time solution by keeping track of starting index of current longest non repeating substring
 */
public class LongestNonRepeatingSubString {

    public int longestNonRepeatingSubString(String s) {
        String lss = "";        // global non repeating substring
        int length = s.length();
        int i = 0;
        String temp = "";       // current non repeating substring
        int startIndex = 0;     // starting index of current non repeating substring

        while(i < length) {
            String ss = String.valueOf(s.charAt(i));
            if (!temp.contains(ss)) {
                if (temp.length() == 0) {
                    startIndex = i;
                }
                temp = temp.concat(ss);
                if (lss.length() < temp.length()) {
                    lss = temp;
                }
            } else {
                i = startIndex;
                temp = "";
            }
            i++;
        }

        return lss.length();
    }

    public static void main(String[] args) {
        String a = "abcabc";
        String b = "aabcabc";
        String c = "aabcabcd";
        String d = "aabcbdeab";
        String e = "a";
        String f = "ac";
        String g = "";

        LongestNonRepeatingSubString ob = new LongestNonRepeatingSubString();
        System.out.println(ob.longestNonRepeatingSubString(a));
        System.out.println(ob.longestNonRepeatingSubString(b));
        System.out.println(ob.longestNonRepeatingSubString(c));
        System.out.println(ob.longestNonRepeatingSubString(d));
        System.out.println(ob.longestNonRepeatingSubString(e));
        System.out.println(ob.longestNonRepeatingSubString(f));
        System.out.println(ob.longestNonRepeatingSubString(g));
    }

}
