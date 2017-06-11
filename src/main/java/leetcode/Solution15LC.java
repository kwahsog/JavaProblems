package leetcode;

import java.util.*;

/** LeetCode Problem 15: 3Sum
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0 
 * Find all unique triplets in the array which gives the sum of zero.
 * URL: https://leetcode.com/problems/3sum/
 * @author Alex
 *
 */

public class Solution15LC {
	
	public static void main(String args[]){
		//example case.
    	int[] nums = {-1,0,1,2,-1,-4};
    	System.out.println(threeSum(nums).toString());
	}

    public static List<List<Integer>> threeSum(int[] nums) {
        
    	List<List<Integer>> result = new ArrayList<>();
    	//first sort the array, so we can loop through with guaranteed order.
    	Arrays.sort(nums);    	
    	
    	//2 pointer search though array
    	for(int i = 0; i < nums.length - 2; i++) {
    		if (i == 0 || (i > 0 && nums[i] != nums[i-1])) { //avoid duplicate results from when nums[i] = nums[i - 1];
    			int low = i + 1; //low pointer eg -1000000 increasing
    			int high = nums.length - 1; //high pointer eg 9999 decreasing
    			while (low < high) {
    				if (nums[low] + nums[high] + nums[i] == 0) { //ie found a result    					
    					result.add(Arrays.asList(nums[i], nums[low], nums[high])); //add found result to the array.
    					//this is needed to skip duplicate results from low/high.
    					while (low < high && nums[low] == nums[low + 1]) low++; 
    					while (low < high && nums[high] == nums[high - 1]) high--; 
    					//change low and high as found a unique result
    					low++; 
    					high--;
    				}
    				//else no result found, so change high or low depending on if below or above target of 0.
    				else if (nums[i] + nums[low] + nums[high] > 0) {
    					high--;
    				}
    				else if (nums[i] + nums[low] + nums[high] < 0) {
    					low++;    					
    				}
    			}
    		}
    	}    	
    	return result;
    }
}
