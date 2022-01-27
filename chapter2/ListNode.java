package chapter2;

public class ListNode {
	int val;
	ListNode next = null;
	
	public ListNode() {}
	
	public ListNode(int d) { val = d; }
	
	void appendToTail(int d) {
		ListNode end = new ListNode(d);
		ListNode n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	ListNode deleteNode(ListNode head, int d) {
		ListNode n = head;
		
		if (n.val == d) {
			return head.next; // moved head
		}
		
		while (n.next != null) {
			if (n.next.val == d) {
				n.next = n.next.next;
				return head; // head didn't change
			}
			n = n.next;
		}
		return head;
	}
}
