package chapter3;

import java.util.Stack;

public class Q3_4_QueueViaStacks<T> {
	private Stack<T> stack1, stack2;
	boolean inStack1 = true;
	
	public Q3_4_QueueViaStacks() {
		stack1 = new Stack<T>();
		stack2 = new Stack<T>();
	}
	
	public void push(T x) {
		if (!inStack1) {
			exchangeStackValues();
		}
		stack1.push(x);
	}
	
	public T pop() {
		if (inStack1) {
			exchangeStackValues();
		}
		return stack2.pop();
	}
	
	public T peek() {
		if (inStack1) {
			exchangeStackValues();
		}
		return stack2.peek();
	}
	
	public boolean empty() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			return true;
		}
		return false;
	}
	
	private void exchangeStackValues() {
		if (inStack1) {
			while (!stack1.isEmpty()) {
				T curr = stack1.pop();
				stack2.push(curr);
			}
			inStack1 = false;
		} else {
			while (!stack2.isEmpty()) {
				T curr = stack2.pop();
				stack1.push(curr);
			}
			inStack1 = true;
		}
	}
}
