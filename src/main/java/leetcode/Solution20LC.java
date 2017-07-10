package leetcode;

import java.util.Stack;

/** Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * URL: https://leetcode.com/problems/valid-parentheses/
 * @author Alex
 *
 */

public class Solution20LC {

	public static void main (String args[]) {
		System.out.println(isValid("(([({)]))}"));
		System.out.println(isValid("[](){()}"));		
	}
	
    public static boolean isValid(String s) {     
    	Stack<Character> stack = new Stack<Character>();    	
    	for(int i =  0; i < s.length(); i++) {
	    	if (stack.empty()) {    		
	    		stack.push(s.charAt(i));
	    	}
	    	else if (stack.peek() == '(' && s.charAt(i) == ')' ) {
	    		stack.pop();    		
	    	}
	    	else if (stack.peek() == '{' && s.charAt(i) == '}' ) {
	    		stack.pop();
	    	}
	    	else if (stack.peek() == '[' && s.charAt(i) == ']' ) {
	    		stack.pop();
	    	}
	    	else {
	    		stack.push(s.charAt(i));
	    	}
    	}
    	return stack.empty();
    }
}
