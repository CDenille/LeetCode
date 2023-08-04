package GroupAnagrams49;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static List<List<String>> solution(String[] strs) {

    // Edge case: If array is empty, return an empty list 
    if(strs.length == 0) {
        return new ArrayList<>();
    }
    // HashMap will have the key and its pair will be a list of anagrams
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    // Iterate through the array of Strings 
    for(int i=0; i<strs.length; i++) {
        // sort each String 
        // Because Anagrams uses the same letter at the same frequency,
        // the strings should be the same(equal) when sorted
        String key = sort(strs[i]);
        // If the map doesn't contain the sorted word,
        // we've found a new group and need to add a list for that group
        if(!map.containsKey(key)) {
            map.put(key, new ArrayList<String>());
        }
        // if the map already had this key, we've found an Anagram to be added to its group
        map.get(key).add(strs[i]);
    }
    // Return an arrayList with all of the maps values (our Anagram groups)
    return new ArrayList<>(map.values());
    

    }
    // To sort a string, we will first turn the String into an array of Characters
    public static String sort(String s) {
        char[] word = s.toCharArray(); 
        Arrays.sort(word);
        return new String(word);
    }
}
