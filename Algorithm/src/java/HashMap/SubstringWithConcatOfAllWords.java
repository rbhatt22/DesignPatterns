package HashMap;

import java.util.*;

/**
 * Created by rbhatt22 on 12/16/19.
 */
public class SubstringWithConcatOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        //Split given string into substrings and store in LinkedHashMap
        int stringLength = s.length();
        int wordLength = words.length > 0? words[0].length() : 0;
        Map<Integer, String> map = new LinkedHashMap<>();
        List<String> list = new LinkedList();

        for (int i = 0; i <  stringLength; i = i + wordLength) {
            System.out.println(s.substring(i, i + wordLength));
            System.out.println("start index: " + i + ". End index: " + (i + wordLength));
            map.put(i, s.substring(i, i + wordLength));
            System.out.println(map);
        }

        //Find if concat of given words make a substring in given string
        for (String word : words) {
            
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "barfoothefoobarman";
        String[] words = new String[] {"foo","bar"};

        SubstringWithConcatOfAllWords ob = new SubstringWithConcatOfAllWords();
        ob.findSubstring(s, words);

    }

}
