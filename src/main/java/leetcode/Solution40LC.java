package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 40. Combination Sum II
 * Given a collection of candidate numbers (candidates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 * Each number in candidates may only be used once in the combination.
 * URL: https://leetcode.com/problems/combination-sum-ii/
 * @author Alex
 *
 */

public class Solution40LC {
    public static void main (String args[]) {

        int[] nums = {10,1,2,7,6,1,5};
        List<List<Integer>> result = combinationSum2(nums, 8);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

        System.out.println("Example 2:");
        int[] nums2 = {2,3,5};
        List<List<Integer>> result2 = combinationSum2(nums2, 8);
        for (int i = 0; i < result2.size(); i++) {
            System.out.println(result2.get(i).toString());
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(); //create result
        Arrays.sort(candidates); //sort array
        backtrack(result, new ArrayList<>(), candidates, target, 0); //begin backtracking algo
        return result;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return; //if remain < 0, return nothing so last entry is removed.
        } else if (remain == 0) {
            list.add(new ArrayList<>(templist)); //if remain = 0, we have found a valid entry. Add to result set and continue
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i-1]) {
                    continue; //skip elements
                }
                templist.add(candidates[i]);
                backtrack(list, templist, candidates, remain - candidates[i], i+1); //i+1 as cant reuse same elements
                templist.remove(templist.size() - 1); //only reaches this line when adding takes remain over the limit (ie remain < 0) then removes the element. OR end of loop
            }
        }
    }
}
