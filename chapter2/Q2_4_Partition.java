package chapter2;

public class Q2_4_Partition {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(1)
	 */
	static ListNode solution(ListNode head, int x) {
		if (head == null || head.next == null) return head;
		
		ListNode leftHead = new ListNode(-1);
		ListNode rightHead = new ListNode(-1);
		
		ListNode leftPointer = leftHead;
		ListNode rightPointer = rightHead;
		
		/* 
		 * separately build the left and right partition lists 
		 * as we go along through the input linked-list 
		 */
		while (head != null) {
			if (head.val < x) {
				leftPointer.next = head;
				leftPointer = leftPointer.next;
			} else {
				rightPointer.next = head;
				rightPointer = rightPointer.next;
			}
			
			head = head.next;
		}
		
		rightPointer.next = null;
		leftPointer.next = rightHead.next;
		
		ListNode partitioned = leftHead.next;
		return partitioned;
	}
}
