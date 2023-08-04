package ContainsDuplicate217;

public class testCase {
    public static void main(String[] args) {
        int[] nums = new int[] {1,10, 5, 7, 1};
        int[] numbers = new int[] {6, 2, 11, 3};

        // returns true
        System.out.println(containsDuplicate.solution(nums));

        // returns false
        System.out.println(containsDuplicate.solution(numbers));
    }
}
