package chapter2;

public class Q2_2ReturnKthToLast {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(1)
	 */
	public static int solution(ListNode head, int k) {
		if (head == null) return 0;
		
		int n = 0;
		ListNode curr = head;
		while (curr != null) {
			n++;
			curr = curr.next;
		}
		
		int i = 0;
		curr = head;
		int loops = n - k;
		while (i < loops && curr != null) {
			i++;
			curr = curr.next;
		}
		
		return curr.val;
	}
}
