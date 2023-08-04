package ContainsDuplicate217;
import java.util.HashSet;

class containsDuplicate {
    public static boolean solution(int[] nums) {

        // Create a new set to hold our values
        HashSet<Integer> numbers = new HashSet<>();

        // Iterate through nums
        for(int num:nums) {
            // If our set contains num, we found a duplicate 
            if(numbers.contains(num)) {
                return true;
            }
            // Add num to set if no duplicate was found
            numbers.add(num);
        }
        // Return false if we never find a duplicate
        return false;
    }
}