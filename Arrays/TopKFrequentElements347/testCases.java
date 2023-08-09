package TopKFrequentElements347;

import java.util.Arrays;

public class testCases {
    public static void main(String[] args) {
        // returns [1,2]
        int[] nums1 = new int[] { 1, 1, 1, 2, 2, 3 };
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequentElements.solution(nums1, k1)));

        // returns [-1,2]
        int[] nums2 = new int[] { 4, 1, -1, 2, -1, 2, 3 };
        int k2 = 2;
        System.out.println(Arrays.toString(topKFrequentElements.solution(nums2, k2)));

        // returns [0]
        int[] nums3 = new int[] { 3, 0, 1, 0 };
        int k3 = 1;
        System.out.println(Arrays.toString(topKFrequentElements.solution(nums3, k3)));
    }
}
