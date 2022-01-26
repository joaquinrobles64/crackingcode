package chapter2;

import java.util.Stack;

public class Q2_6_Palindrome {
	/* 
	 * time complexity: O(2n), drop constant -> O(n)
	 * space complexity: O(n/2) for half the values being put into a stack
	 */
	public static boolean solution(ListNode head) {
		// check length of linked list
		int listLength = 0;
		
		ListNode curr = head;
		while (curr != null) {
			listLength++;
			ListNode next = curr.next;
			curr = next;
		}
		
		if (listLength <= 1) return true;
		
		// add half of list values to a stack of ListNodes
		Stack<ListNode> stack = new Stack<>();
		curr = head;
		int i = 0;
		int halfLength = listLength / 2; // remember that int float will round down
		while (i < halfLength) {
			stack.push(curr);
			ListNode next = curr.next;
			curr = next;
			i++;
		}
		
		// odd length move forward once
		if (listLength % 2 == 1 && curr.next != null){
			curr = curr.next;
		}
		
		/* 
		 * looping through remainder of linked list
		 * and comparing current in linked list to current pop of stack 
		 */
		while (curr != null) {
			ListNode next = curr.next;
			ListNode stackCurr = stack.pop();
			if (curr.val != stackCurr.val) return false;
			curr = next;
		}
		
		return true;
	}
}
