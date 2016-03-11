package leetcode;

import java.util.HashMap;

/** LeetCode Problem 1: 2 Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * URL: https://leetcode.com/problems/two-sum/
 * @author Alex
 *
 */
public class Solution1LC {

    public int[] twoSum(int[] nums, int target) {
    	
    	int[] solution = new int[2];
    	
    	//HashMap get/put methods O(1) times.
    	//loop through array checking for solution. If not found place in Hashmap for efficiency.
    	HashMap<Integer, Integer> HashMapSol = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums.length; i++){   		
    		int newtarget = target - nums[i]; 
    		if(HashMapSol.containsKey(newtarget)){
    			solution[0] = HashMapSol.get(newtarget);
    			solution[1] = i;
    		}
    		else{
    			HashMapSol.put(nums[i],i);
    		}
    		    		
    	}

    	return solution;
    	
    }
    
	
    public int[] twoSumBRUTEFORCE(int[] nums, int target) {
        
    	int index1 = 0;
    	int index2 = 0;
    	int[] solution = new int[2];
    	
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i+1; j < nums.length; j++){
    			if(nums[i]+nums[j]==target){
    				index1 = i;
    				index2 = j;
    				break;
    			}
    		}
    		
    	}
    	
    	solution[0]=index1;
    	solution[1]=index2;
    	return solution;
    }
}
