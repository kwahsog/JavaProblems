package testLeetCode;

import leetcode.Solution3LC;

public class testSolution3LC {

	//testing Solution1LC. Return length of longest substring without repeating characters.
	public static void main (String[] args){
		
		String str1 = "dvdf";
		String str2 = "aaaaaaaaaab";
		String str3 = "asdfadzadfazgp";
		Solution3LC test = new Solution3LC();
		
		//expected 3
		System.out.println(test.lengthOfLongestSubstring(str1));
		//expected 2
		System.out.println(test.lengthOfLongestSubstring(str2));
		//expected 6
		System.out.println(test.lengthOfLongestSubstring(str3));
		
	}
}
