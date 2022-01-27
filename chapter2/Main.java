package chapter2;

public class Main {

	public static void main(String[] args) {
		ListNode dummy1 = new ListNode(-1);
		ListNode dummy2 = new ListNode(-1);
		int[] values = new int[] {9,9,9,9};
		int[] values2 = new int[] {9,9};
		dummy1 = arrToLinkedList(values, dummy1);
		dummy2 = arrToLinkedList(values2, dummy2);
		
		printLinkedList(dummy1);
//		System.out.println("+");
//		printLinkedList(dummy2);
//		System.out.println("----------");
//		Q2_1_RemoveDups.solution(head);
		
//		Q2_4_Partition.solution(head, 5);
		
//		ListNode sumlist = Q2_5_SumLists.solution(dummy1, dummy2);
//		printLinkedList(sumlist);
		
//		System.out.println(Q2_6_Palindrome.solution(head));
		
	}
	
	static void printLinkedList(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;	
		}
		System.out.println();
	}
	
	static ListNode arrToLinkedList(int[] values, ListNode head) {
		ListNode curr = head;
		for (int i = 0; i < values.length; i++) {
			ListNode next = new ListNode(values[i]);
			curr.next = next;
			curr = curr.next;
		}
		return head = head.next;
	}
}
