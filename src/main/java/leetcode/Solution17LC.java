package leetcode;

import java.util.*;

/** LeetCode Problem 17: Letter Combinations of a Phone Number 
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given 
 * URL: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * @author Alex
 *
 */
public class Solution17LC {

	public static void main(String args[]) {
		System.out.println(letterCombinations("234").toString());
	}
	
	public static List<String> letterCombinations(String digits) {
        
		List<String> result = new ArrayList<String>();
		List<String> tempresult = new ArrayList<String>();
		
		//preset values
		String[] phoneKeyValues = new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		//loop through each digit, adding all possible combinations to array.
		for (int i = 0; i < digits.length(); i++) {
			String currValue = phoneKeyValues[Integer.parseInt(String.valueOf(digits.charAt(i)))]; //gets "abc"
			String[] charArray = currValue.split(""); //[a,b,c]
			if(result.size() == 0) {
				for (int j  = 0; j < charArray.length; j++) {
					result.add(charArray[j]);
				}
			} else {
				tempresult.clear();
				for (int k = 0; k < result.size(); k++) {
					for (int m  = 0; m < charArray.length; m++) {
						tempresult.add(result.get(k)+charArray[m]);
					}
				}
				result.clear();
				result.addAll(tempresult);
			}
		}
		return result;
    }
}
