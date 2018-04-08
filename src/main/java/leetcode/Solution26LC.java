package leetcode;

import java.util.Arrays;

/** Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * @author Alex
 *
 */

public class Solution26LC {

    public static void main (String args[]) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
        int nums2[] = {1,1,2,3,3,3,4};
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            System.out.println(Arrays.toString(nums));
        }
        return i + 1;
    }
}
