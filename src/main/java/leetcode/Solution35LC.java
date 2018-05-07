package leetcode;

/** 35. Search Insert Position
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * URL: https://leetcode.com/problems/search-insert-position/
 * @author Alex
 *
 */

public class Solution35LC {

    //standard O(n) runtime, k loop through array.
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (i == 0 && nums.length < i+1 && nums[i+1] >= target) { //start of array case
                return i;
            } else if (i != 0 && nums[i-1] <= target && nums[i] >= target) { //normal case
                return i;
            } else if (i == nums.length - 1 && nums[i] <= target) { //end of array case
                return i+1;
            }
        }
        return 0;
    }

    //binary search solution, O(log n)
    public static int binarysearchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (high + low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low == high) {
            if (target > nums[high]) {
                return high + 1;
            } else {
                return high;
            }
        }
        return mid;
    }

    public static void main (String args[]) {
        int[] nums1 = {1};
        System.out.println(searchInsert(nums1,5)); //1
        int[] nums2 = {1,3,5,6};
        System.out.println(searchInsert(nums2,5)); //2
        System.out.println(binarysearchInsert(nums1,2)); //1
    }
}
