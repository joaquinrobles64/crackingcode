package chapter2;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(-1);
		ListNode curr = head;
		
		int[] values = new int[] {3,5,8,5,10,2,1};
		
		for (int i = 0; i<values.length; i++) {
			ListNode next = new ListNode(values[i]);
			curr.next = next;
			curr = curr.next;
		}
		
		ListNode list = head.next;
		
		printLinkedList(list);
		
//		Q2_1_RemoveDups.solution(head);
		Q2_4_Partition.solution(list, 5);
		
		printLinkedList(list);
	}
	
	static void printLinkedList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;	
		}
		System.out.println();
	}
}
