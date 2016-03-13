package testLeetCode;

import leetcode.Solution1LC;

public class testSolution1LC {

	//testing Solution1LC. Return two indices of original array that add to target.
	public static void main(String args[]){
		
		
		//expected 0,3
		Solution1LC test = new Solution1LC();
		int[] nums = {0,3,4,0};
		System.out.println(test.twoSum(nums, 0)[0]+","+test.twoSum(nums, 0)[1]);
		
		//expected 0,1
		int[] nums2 = {1,7,9,0};
		System.out.println(test.twoSum(nums2, 8)[0]+","+test.twoSum(nums2, 8)[1]);
		
		//expected 0,1
		int[] nums3 = {1,1};
		System.out.println(test.twoSum(nums3, 2)[0]+","+test.twoSum(nums3, 2)[1]);
		
		//expected 1,5
		int[] nums4 = {1,100,7,13,5123,12};
		System.out.println(test.twoSum(nums4, 112)[0]+","+test.twoSum(nums4, 112)[1]);
	}
}
