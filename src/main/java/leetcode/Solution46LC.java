package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 46. Permutations
 * Given a collection of distinct integers, return all possible permutations.
 *
 * URL: https://leetcode.com/problems/permutations/
 * @author Alex
 *
 */

public class Solution46LC {

    public static void main (String args[]) {

        int[] nums = {2, 3, 6, 7};
        List<List<Integer>> result = permute(nums);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }

        int[] nums2 = {2, 3, 5};
        List<List<Integer>> result2 = permute(nums2);
        for (int i = 0; i < result2.size(); i++) {
            System.out.println(result2.get(i).toString());
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); //create result
        backtrack(result, new ArrayList<>(), nums); //begin backtracking algo
        return result;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums) {

        //condition for adding result.
        if (templist.size() == nums.length) {
            list.add(new ArrayList<>(templist));
        }
        else { //standard loop through nums, add THEN backtrack THEN remove. User to do: Add your own special criteria, here we have contains.
            for (int i = 0; i < nums.length; i++) {
                if (templist.contains(nums[i])) {
                    continue;
                }
                templist.add(nums[i]);
                backtrack(list, templist, nums);
                templist.remove(templist.size() - 1);
            }

        }
    }

}
