package chapter3;

import java.util.EmptyStackException;

public class Q3_2_MinStack {
	private class StackNode {
		int val, min;
		StackNode next;
		
		public StackNode(int val, int min, StackNode next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}
	}
	
	StackNode head;
	
	public void push(int val) {
		if (head == null) head = new StackNode(val, val, null);
		else head = new StackNode(val, Math.min(val, head.val), head);
	}
	
	public int pop() {
		if (head == null) throw new EmptyStackException();
		int num = head.val;
		head = head.next;
		return num;
	}
	
	public int peek() {
		return head.val;
	}
	
	public int getMin() {
		return head.min;
	}
}
