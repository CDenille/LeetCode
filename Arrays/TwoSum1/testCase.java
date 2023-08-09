package TwoSum1;

import java.util.Arrays;

public class testCase {
    public static void main(String[] args) {
        // returns [1, 0]
        int[] nums1 = {2,7,11,15}; int target1= 9;
        System.out.println(Arrays.toString(twoSum.solution(nums1, target1)));

        // returns [2, 1]
        int[] nums2 = {3,2,4}; int target2= 6;
        System.out.println(Arrays.toString(twoSum.solution(nums2, target2)));

        // returns [1, 0]
        int[] nums3 = {3,3}; int target3= 6;
        System.out.println(Arrays.toString(twoSum.solution(nums3, target3)));
    }
}
