package chapter1;

import java.util.Stack;

public class Q1_8_ZeroMatrix {
	/* 
	 * time complexity: O(m*n) 
	 * space complexity: O(k) where k is the number of 0's in the matrix put into the stack
	 * 
	 */
	public static void solution(int[][] matrix) {
		class Tuple {
			private int[] tuple = new int[2];
			
			public Tuple(int val1, int val2) {
				this.tuple[0] = val1;
				this.tuple[1] = val2;
			}
			
			private int[] getTuple() {
				return this.tuple;
			}
		}
		
		int m = matrix.length;
		int n = matrix[0].length;
		Stack<Tuple> tupleStack = new Stack<>();
		
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				if (matrix[row][col] == 0) {
					tupleStack.push(new Tuple(row, col));
				}
			}
		}
		
		while (!tupleStack.empty()) {
			Tuple tuple = tupleStack.pop();
			int rowToLoop = tuple.getTuple()[0];
			int colToLoop = tuple.getTuple()[1];
			
			// loop through row elements
			for (int i = 0; i < n; i++) {
				matrix[rowToLoop][i] = 0;
			}
			
			// loop through col elements
			for (int i = 0; i < m; i++) {
				matrix[i][colToLoop] = 0;
			}
		}
	}
	
}
