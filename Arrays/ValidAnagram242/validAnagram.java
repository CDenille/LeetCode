package ValidAnagram242;

import java.util.Arrays;

public class validAnagram {
    public static boolean solution(String s, String t) {
        // Anagrams uses the same frequency of letter and thus should have the same length
        if(s.length() != t.length()) {
            return false;
        }
        // Turn the String into an Array of Characters for sorting
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // If the sorted arrays are equal, the two Strings are Anagrams
        return Arrays.equals(sArray, tArray);
    }
}
