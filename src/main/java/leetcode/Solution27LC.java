package leetcode;

import java.util.Arrays;

/** Given an array and a value, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * URL: https://leetcode.com/problems/remove-element/
 * @author Alex
 *
 */

public class Solution27LC {

    public static void main (String args[]) {
        int nums[] = {1,2};
        System.out.println(removeElement(nums,1));
        System.out.println(Arrays.toString(nums));
        int nums2[] = {1,1,2,3,3,3,4};
        System.out.println(removeElement(nums2,3));
        System.out.println(Arrays.toString(nums2));
        int nums3[] = {3,2,2,3};
        System.out.println(removeElement(nums3,3));
        System.out.println(Arrays.toString(nums3));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if(nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        int i = 0;
        int j = nums.length - 1;
        while (j >= 0 && nums[j] == val) {
            j--;
        }
        while (i <= j && j >= 0) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                nums[j] = val;
            }
            i++;
            while (nums[j] == val) {
                j--;
            }
        }
        return i;
    }

    public static int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return i;
    }
}
