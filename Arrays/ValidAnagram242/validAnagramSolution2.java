package ValidAnagram242;

import java.util.HashMap;

public class validAnagramSolution2 {
    public static boolean solution(String s, String t) {
        // This data structure will store our Characters and the number of
        // times they appear in our first String.
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate over the first String and store each Character and its frequency.
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        // Iterate over the Second String 
        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            // If this Character isn't in our map, add it with the default frequency of 1.
            if (!map.containsKey(a)) {
                map.put(a, map.getOrDefault(a, 0) + 1);
            } else {
                // If this Character is in the map once, 
                // both String s and String t have this Character and we should delete it.
                if (map.get(a) == 1) {
                    map.remove(a);
                } else {
                    // If this Character is in our map more than once
                    // we reduce its frequency by one. 
                    map.put(a, map.get(a) - 1);
                }
            }
        }
        // If we have a valid Anagram the map should be empty
        // meaning all characters and its frequency have been accounted for and deleted. 
        return map.isEmpty();
    }
}
