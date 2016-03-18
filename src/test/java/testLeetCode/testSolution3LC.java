package testLeetCode;

import leetcode.Solution3LC;

public class testSolution3LC {

	public static void main (String[] args){
		
		String a = "dvdf";
		String b = "aaaaaaaaaab";
		Solution3LC test = new Solution3LC();
		System.out.println(test.lengthOfLongestSubstring(a));
		System.out.println(test.lengthOfLongestSubstring(b));
	}
}
