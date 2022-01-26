package chapter2;

public class Main {

	public static void main(String[] args) {
		ListNode head = new ListNode(-1);
		ListNode curr = head;
		
		int[] values = new int[] {9,8,0,8,9};
		
		for (int i = 0; i<values.length; i++) {
			ListNode next = new ListNode(values[i]);
			curr.next = next;
			curr = curr.next;
		}
		
		// use this one
		ListNode list = head.next;
		
		printLinkedList(list);
		
//		Q2_1_RemoveDups.solution(list);
		
//		Q2_4_Partition.solution(list, 5);
		
//		System.out.println(Q2_6_Palindrome.solution(list));
		
//		printLinkedList(list);
	}
	
	static void printLinkedList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;	
		}
		System.out.println();
	}
}
