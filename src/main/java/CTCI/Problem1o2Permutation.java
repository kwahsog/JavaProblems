package CTCI;

import java.util.Arrays;

/**
 * Problem 1.2 from CTCI. Given two strings, write a method to decide if one is a permutation of the other.
 *
 */
public class Problem1o2Permutation {

	//convert to char array, sort and compare arrays.
	public static boolean CheckPermutation(String s1, String s2) {	
		
		if (s1.length() != s2.length()) {
			return false;
		}		
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2)){
			return true;
		} else {
			return false;
		}
	}
	
	//alternative solution (not implemented), count number of times each char occurs in each string and compare totals.
	public static void main (String args[]) {		
		String test1 = "abcdegg";
		String test2 = "gdabceg";
		String test3 = "abbdegg";
		System.out.println(CheckPermutation(test1, test2));
		System.out.println(CheckPermutation(test1, test3));
		System.out.println(CheckPermutation(test2, test3));		
	}
}
