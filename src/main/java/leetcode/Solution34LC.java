package leetcode;

import java.util.Arrays;

/** 34. Search for a Range
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * URL: https://leetcode.com/problems/search-for-a-range/
 * @author Alex
 *
 */

public class Solution34LC {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length == 0) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        //binary search O(log n)
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low+high)/2;
            //if found calculate final index
            if (nums[mid] == target) {
                int i = mid;
                int j = mid;
                while (i+1 < nums.length && nums[i+1] == target) {
                    i++;
                }
                while (j-1 >= 0 && nums[j-1] == target) {
                    j--;
                }
                result[0] = j;
                result[1] = i;
                return result;
            }
            //binary search
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public static void main (String args[]) {
        int nums[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,8))); //[3,4]

        int nums2[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,6))); //[-1,-1]

    }

}
