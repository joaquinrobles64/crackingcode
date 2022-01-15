package chapter3;

public class Q3_4_QueueViaStacks<T> {
	private MyStack<T> stack1;
	private MyStack<T> stack2;
	private boolean stackmode = true;
	
	
	public Q3_4_QueueViaStacks() {
		stack1 = new MyStack<T>();
		stack2 = new MyStack<T>();
	}
	
	public void add(T value) {
		if (!stackmode) exchangeStackValues();
		stack1.push(value);
	}
	
	public T remove() {
		if (stackmode) {
			exchangeStackValues();
		}
		return stack2.pop();
	}
	
	public T peek() {
		if (stackmode) {
			exchangeStackValues();
		}
		return stack2.peek();
	}
	
	public boolean isEmpty() {
		if (stack1.isEmpty() || stack2.isEmpty()) return true;
		return false;
	}
	
	private void exchangeStackValues() {
		if (stackmode) {
			while (!stack1.isEmpty()) {
				T curr = stack1.pop();
				stack2.push(curr);
			}
			stackmode = false;
		} 
		else {
			while (!stack2.isEmpty()) {
				T curr = stack2.pop();
				stack1.push(curr);
			}
			stackmode = true;
		}
	}
}
