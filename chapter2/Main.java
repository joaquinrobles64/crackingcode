package chapter2;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode curr = head;
		
		for (int i = 0; i < 4; i++) {
			curr.val = i;
			ListNode nex = new ListNode(-1);
			curr.next = nex;
			curr = curr.next;
		}
		curr.val = 2;
		
		Q2_1.removeDups(head);
		
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
			
		}
	}

}
