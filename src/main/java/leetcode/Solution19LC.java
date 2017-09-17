package leetcode;

import leetcode.ListNode;

/** LeetCode Problem 19: Remove Nth Node From End of List 
 * Given a linked list, remove the nth node from the end of list and return its head.
 * URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * See ListNode class for working code.
 * @author Alex
 */

public class Solution19LC {

	/* Find length of linked list then set Node at (n-1).next to (n+1). */
	public ListNode removeNthFromEndTwoPass(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		int length = 0;
		ListNode firstPass = head;

		// get max length of list.
		while (firstPass != null) {
			length++;
			firstPass = firstPass.next;
		}

		length = length - n;
		firstPass = dummy;
		while (length > 0) {
			firstPass = firstPass.next;
			length--;
		}
		firstPass.next = firstPass.next.next;
		return dummy.next;
	}
	
	/* Use two pointers, first at n+1 steps from start, one at the start.
	 * When first pointer is null, 2nd is at nth node from the last. Then remove node
	 */
	
	public ListNode removeNthFromEndOnePass(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode firstPass = dummy;
		ListNode secondPass = dummy;

		//move first n+1 steps so gap is n node apart. 
		for (int i = 1; i <= n+1 ; i++) {
			firstPass = firstPass.next;
		}

		//when first is null second pointer reaches the desired node. Then remove node.
		while (firstPass != null) {
			firstPass = firstPass.next;
			secondPass = secondPass.next;
		}
		secondPass.next = secondPass.next.next;
		return dummy.next;
	}
}
