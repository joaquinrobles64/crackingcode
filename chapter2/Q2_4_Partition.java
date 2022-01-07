package chapter2;

public class Q2_4_Partition {
	
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
