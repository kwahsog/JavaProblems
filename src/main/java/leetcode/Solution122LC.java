package leetcode;

/** LeetCode Problem 122. Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like 
 * (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple 
 * transactions at the same time (ie, you must sell the stock before you buy again).
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @author Alex
 *
 */

public class Solution122LC {

	/*
	 * O(n) solution. Just calculate change, and add to total if it is positive. 
	 */
	public static int maxProfit(int[] prices) {
		int total = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i+1] - prices[i] > 0) {
				total += prices[i+1] - prices[i];
			}
		}
		return total;
	}

	public static void main (String args[]) {
		int[] test = {7,1,4,3,6,4};
		System.out.println(maxProfit(test));
		int[] test2 = {1,2,3,4};
		System.out.println(maxProfit(test2));
	}	

}
