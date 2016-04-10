package testLeetCode;

import leetcode.Solution5LC;

public class testSolution5LC {

	//testing Solution5LC. Return longest palindromic substring in string.
	public static void main (String[] args){
		
		String str1 = "abba";
		String str2 = "zfabbakz";
		String str3 = "zfabakz";
		String str4 = "bb";
		Solution5LC test = new Solution5LC();
		//expected abba
		System.out.println(test.longestPalindrome(str1));
		//expected abba
		System.out.println(test.longestPalindrome(str2));
		//expected aba
		System.out.println(test.longestPalindrome(str3));
		//expected bb
		System.out.println(test.longestPalindrome(str4));
	}
}
