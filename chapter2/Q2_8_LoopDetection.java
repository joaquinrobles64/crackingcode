package chapter2;

import java.util.HashSet;

public class Q2_8_LoopDetection {
	/* 
	 * time complexity:  O(n) 
	 * space complexity: O(n)
	 */
	public static ListNode solution(ListNode head) {
		HashSet<ListNode> hashset = new HashSet<>();
		ListNode curr = head;
		
		while (curr != null) {
			ListNode next = curr.next;
			if (hashset.contains(next)) {
				return next;
			}
			hashset.add(curr);
			curr = next;
		}
		
		return null;
	}
}
