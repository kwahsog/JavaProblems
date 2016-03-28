package leetcode;

/** LeetCode Problem 62: Unique Paths
 * A robot is located at the top-left corner of a mxn grid, and can only move down or right. 
 * Given he is trying to reach the bottom right corner of the grid, find the no. possible unique paths.
 * URL: https://leetcode.com/problems/unique-paths/
 * @author Alex
 * 
 */

public class Solution62LC {
	
	//dynamic programming solution.
	//first fill out left and top column with 1s-robot can only move right or down.
	//calculate entry at k,l by adding k-1,l and k,l-1.
    public int uniquePaths(int m, int n) {     
    	
    	if(m==0 && n==0){
    		return 0;
    	}
    	int[][] dp = new int[m][n];
    
    	dp[0][0] = 1;
    	for(int i = 0; i < m; i++){
    		dp[i][0] = 1;
    	}
    	
    	for(int j = 0; j < n; j++){
    		dp[0][j] = 1;
    	}
    	
    	for(int k = 1; k < m; k++){
    		for (int l = 1; l < n; l++){
    			dp[k][l] = dp[k-1][l] + dp[k][l-1];
    		}
    	}
    	
    	return dp[m-1][n-1];
    }
}
