package leetcode;

/** LeetCode Problem 121. Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
 * design an algorithm to find the maximum profit.
 * URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * @author Alex
 *
 */

public class Solution121LC {

	/*
	 * O(n) solution. Only need to keep track of current min, then compare to all future totals.
	 */
	public static int maxProfit(int[] input) {
		int minbuyingprice = Integer.MAX_VALUE;
		int total = 0;		
		for (int i = 0; i < input.length; i++) {
			if (input[i] < minbuyingprice) {
				minbuyingprice = input[i];
			}
			if (input[i] - minbuyingprice > total) {
				total = input[i] - minbuyingprice;
			}
		}
		return total;
	}
	
	/*
	 * Working solution on O(n^2) runtime. Loop through checking all possible cases.
	 */
	public static int maxProfitOn2(int[] input) {
		int total = 0;
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i+1; j < input.length; j++) {
				if (input[j] - input[i] > total) {
					total = input[j] - input[i];
				}
			}
		}
		return total;
		
	}	
	
	public static void main (String args[]) {
		int[] test = {7,1,4,3,6,4};
		System.out.println(maxProfit(test));
		int[] test2 = {1,2};
		System.out.println(maxProfit(test2));
	}	

}
