import java.util.HashSet;

class containsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {

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

    public static void main(String[] args) {
        int[] nums = new int[] {1,10, 5, 7, 1};
        int[] numbers = new int[] {6, 2, 11, 3};

        // returns true
        System.out.println(containsDuplicate(nums));

        // returns false
        System.out.println(containsDuplicate(numbers));
    }
}