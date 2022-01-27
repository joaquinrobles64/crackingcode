package chapter2;

public class Q2_5_SumLists {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(n)
	 */
	public static ListNode solution(ListNode list1, ListNode list2) {
		ListNode dummyHead = new ListNode();
		ListNode pointer1 = list1, pointer2 = list2, curr = dummyHead;
		
		boolean remainder = false;
		int onesPlace = 0;
		while (pointer1 != null || pointer2 != null) {
			int x = (pointer1 != null) ? pointer1.val : 0;
			int y = (pointer2 != null) ? pointer2.val : 0;
			
			int sum = remainder ? x + y + 1 : x + y;
			
			ListNode next = new ListNode();
			if (sum >= 10) {
				remainder = true;
				onesPlace = sum % 10;
				next.val = onesPlace;
			} else {
				remainder = false;
				next.val = sum;
			}
			
			curr.next = next;
			curr = curr.next;
			if (pointer1 != null) pointer1 = pointer1.next;
			if (pointer2 != null) pointer2 = pointer2.next;
		}
		if (remainder) {
			curr.next = new ListNode(1);
		}
		return dummyHead.next;
	}
}
