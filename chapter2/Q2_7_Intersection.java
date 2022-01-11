package chapter2;

public class Q2_7_Intersection {
	/* 
	O(n*m) runtime where n and m are the lengths of the two lists. 
	
	The book's solution is pretty good at O(A + B) where A and B are the lengths
	of the two lists. I don't think I would've come up with the approach 
	for reaching this runtime in 30 mins. Maybe I should give myself more than 30 mins?
	 */
	static ListNode solution(ListNode head1, ListNode head2) {
		ListNode pointer1 = head1;
		ListNode pointer2 = head2;
		
		/* check if the two lists actually intersect */
		while (pointer1.next != null) { pointer1 = pointer1.next; }
		while (pointer2.next != null) { pointer2 = pointer2.next; }
		
		boolean isIntersecting = false;
		if (pointer1 == pointer2) { isIntersecting = true; }
		
		
		if (isIntersecting) {
			pointer1 = head1;
			pointer2 = head2;
			
			/*
			Brute force nested loop to check 
			If at any point in the two lists the current nodes are equal, 
			then return either one of the two nodes
			 */
			while (pointer1 != null) {
				while (pointer2 != null) {
					if (pointer1 == pointer2) {
						return pointer1;
					} else {
						pointer2 = pointer2.next;
					}
				}
				pointer1 = pointer1.next;
				pointer2 = head2;
			}
		}
		
		return null;
	}
}
