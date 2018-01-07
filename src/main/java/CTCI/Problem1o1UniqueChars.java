package CTCI;

import java.util.*;

/**
 * Problem 1.1 from CTCI. Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 */
public class Problem1o1UniqueChars {

	//Create hashmap, check if map contains each char.
	public static char uniqueCharsHashMap(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				return s.charAt(i);
			}
			else {
				map.put(s.charAt(i), i);
			}
		}
		return '0';
	}
	
	//no extra data structures allowed. Loop though string checking for duplicate char.
	public static char uniqueCharsNoExtraDataStructures(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (s.charAt(j) == s.charAt(i)) {
					return s.charAt(i);
				}
			}
		}
		return '0';
	}
	
	public static void main (String args[]) {
		System.out.println(uniqueCharsHashMap("qwertyuiop//"));
		System.out.println(uniqueCharsNoExtraDataStructures("qqwertyuiopppp"));
	}

}
