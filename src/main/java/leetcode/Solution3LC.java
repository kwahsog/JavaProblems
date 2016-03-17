package leetcode;

import java.util.HashMap;

public class Solution3LC {
	
	/** LeetCode Problem 3: Longest Substring Without Repeating Characters
	 * Given a string, find the length of the longest substring without repeating characters. 
	 * e.g.  the longest substring without repeating letters for "abcabcbb" is "abc", so return 3.
	 * URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 * @author Alex
	 *
	 */
	public int lengthOfLongestSubstring(String s) {

	    HashMap<Character,Integer> alpha = new HashMap<Character, Integer>();
	    int max=0;
	    int prevStart=0;
	    int len = 0;
	    for(int i=0; i<s.length(); i++){
	          //If in hashmap and prev start < value in map
	          if(alpha.containsKey(s.charAt(i)) && prevStart <= alpha.get(s.charAt(i))){

	              //compare len and max
	              if(max < len){
	                  max = len;
	              }
	              //prev start = value in map + 1
	              prevStart = alpha.get(s.charAt(i)) + 1;
	              //len = i - value in map
	              len = i - alpha.get(s.charAt(i));
	          }
	          else{
	              //length++
	              len++;
	          }
	          //Put in hashmap
	          alpha.put(s.charAt(i), i);
	    }

	     //compare len and max
	              if(max < len){
	                  max = len;
	              }
	    return max;

	}

}
