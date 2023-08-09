package TopKFrequentElements347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class topKFrequentElements {
    public static int[] solution(int[] nums, int k) {
        // if our array is smaller than the numbers of elements we need, 
        // return the array as is. 
        if(nums.length <= k) {
            return nums;
        }

        // map to hold our Integer and the frequency in which it appears
         HashMap<Integer,Integer> map = new HashMap<>();
        // Iterate over our array, and add each value and its frequency to our map.
        for(int num:nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // We want to sort the values of each Integer
        // Map.Entry is a class that will store both our key and value
        ArrayList<Map.Entry<Integer, Integer>> values = new ArrayList<>(map.entrySet());
        // Sort our pairs in descending order
        values.sort((a, b) -> b.getValue() - a.getValue());
        
        // create a new int array to hold our answer
        int[] arr = new int[k];
        // Iterate over our sorted values 
        // Set our key into the array K amount of times.
        for(int i=0; i<k; i++) {
            arr[i] = values.get(i).getKey();
        }
        return arr;
    }
}
