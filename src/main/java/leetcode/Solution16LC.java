package leetcode;

import java.util.Arrays;

/** LeetCode Problem 16: 3Sum Closest
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * URL: https://leetcode.com/problems/3sum-closest/
 * @author Alex
 *
 */

public class Solution16LC {	
	
	public static void main(String args[]) {
		
		int[] nums1 = {1,1,-1,-1,3};
		System.out.println(threeSumClosest(nums1, -1));
		System.out.println(threeSumClosest(nums1, -1));
	}

    public static int threeSumClosest(int[] nums, int target) {
    	
    	//only one solution if length 3
		if (nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}
		//sort array so can implement dual pointer search
		Arrays.sort(nums);
		
		//pick a starting value
		int solution = nums[0] + nums[1] + nums[nums.length - 1];
		
		//implement a dual pointer search
		for (int i = 0; i < nums.length - 2; i++) {			
			int low = i + 1;
			int high = nums.length - 1;
			//simply check current sum value, then move low or high pointer. 
			//Then check if sum (current value) is better than the solution.
			while (low < high) {
				int sum = nums[low] + nums[high] + nums[i];		
				if (sum < target) {
					low++;
				}
				else {
					high--;
				}	
				if(Math.abs(target-solution) > Math.abs(target-sum)) {
					solution = sum;
				}
			}
		}		
		return solution;		
    }

}
