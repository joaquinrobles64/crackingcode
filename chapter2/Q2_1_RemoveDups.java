package chapter2;

import java.util.HashSet;

public class Q2_1_RemoveDups {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(n)
	 */
	static void solution(ListNode head) {
		HashSet<Integer> hashset = new HashSet<>();
		ListNode prev = null;		
		ListNode curr = head;
		/*
		 * head loops through like normal
		 * prev will stay behind and edit the list based on curr's current value
		 * so prev will end up having prev.next be the next non-duplicate value
		 */
		while (curr != null) {
			if (hashset.contains(curr.val)) {
				prev.next = curr.next; 
			}
			else {
				hashset.add(curr.val);
				prev = curr;
			}
			
			curr = curr.next;
		}
	}
}
