package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 39. Combination Sum
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sums to target.
 * The same repeated number may be chosen from candidates unlimited number of times.
 * URL: https://leetcode.com/problems/combination-sum/
 * @author Alex
 *
 */

//TAGS: Backtracking

public class Solution39LC {

    public static void main (String args[]) {

        int[] nums = {2,3,6,7};
        List<List<Integer>> result = combinationSum(nums, 7);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

        int[] nums2 = {2,3,5};
        List<List<Integer>> result2 = combinationSum(nums2, 8);
        for (int i = 0; i < result2.size(); i++) {
            System.out.println(result2.get(i).toString());
        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
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
                templist.add(candidates[i]);
                backtrack(list, templist, candidates, remain - candidates[i], i); //i as can reuse same elements
                templist.remove(templist.size() - 1); //only reaches this line when adding takes remain over the limit (ie remain < 0) then removes the element. OR end of loop
            }
        }
    }
}
