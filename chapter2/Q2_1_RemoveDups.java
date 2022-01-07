package chapter2;

import java.util.HashSet;

public class Q2_1_RemoveDups {
	static void solution(ListNode head) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		ListNode prev = null;		
		
		while (head != null) {
			if (hashset.contains(head.val)) {
				prev.next = head.next; 
			} else {
				hashset.add(head.val);
				prev = head;
			}
			head = head.next;
		}
	}
}
