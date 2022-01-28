package chapter2;

public class Q2_3_DeleteMiddleNode {
	/*
	 * time complexity:  O(n/2) => O(n)
	 * space complexity: O(1)
	 */
	public static void solution(ListNode middle) {
		ListNode next = middle.next;
		middle.val = next.val;
		middle.next = next.next;
		
		
		
		
		/* whoops! misread the prompt
		 * didnt understand the part that said that
		 * we're given only "that" node
		 * i did this one in like 10 minutes anyway
		 */
//		ListNode slow = head, fast = head.next, prev = new ListNode(-1);
//		prev.next = head;
//		
//		while (fast.next != null && fast.next.next != null) {
//			slow = slow.next;
//			fast = fast.next.next;
//			prev = prev.next;
//		}
//		
//		if (fast.next == null) {
//			prev.next = slow.next;
//		} else {
//			slow.next = slow.next.next;
//		}
	}
}
