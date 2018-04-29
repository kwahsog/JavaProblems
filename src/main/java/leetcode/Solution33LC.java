package leetcode;

/** 33. Search in Rotated Sorted Array
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * URL: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * @author Alex
 *
 */
public class Solution33LC {

    public static int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }

        //binary search to run at O(log n)
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[high] > nums[mid]) { //sorted right
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1; //in sorted path
                } else {
                    high = mid - 1; // not in sorted path
                }
            } else { //sorted left
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; //in sorted path
                } else {
                    low = mid + 1; //not in sorted path
                }
            }
        }
        return -1;

    }

    public static void main (String args[]) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums,0)); //return 4

        int[] nums2 = {4,5,6,7,0,1,2};
        System.out.println(search(nums2,3)); //return -1

        int[] nums3 = {1,3};
        System.out.println(search(nums3,3)); //return 1

    }
}
