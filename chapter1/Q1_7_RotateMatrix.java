package chapter1;

public class Q1_7_RotateMatrix {
	static void solution(int[][] matrix) {
		int n = matrix.length;

		// transpose matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// two-pointer reverse values each row
		int left = 0, right = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;
				left++;
				right--;
			}
			left = 0;
			right = n - 1;
		}
		
		/**
		 * transpose like matrix[i][j] <--> matrix[j][i] 
		 * so this: 
		 * [1 2 3] 
		 * [4 5 6] 
		 * [7 8 9]
		 *
		 * turns into: 
		 * [1 4 7] 
		 * [2 5 8] 
		 * [3 6 9]
		 * 
		 * and then use two pointers to reverse the values in each row 
		 * [7 4 1] 
		 * [8 5 2]
		 * [9 6 3]
		 * 
		 * and that's that. no way i'd have thought of this and implemented in 30 mins.
		 * after my 30 mins timer was up trying to come up with a good solution
		 * i was like HEY this is linear algebra and busted out my old notes.
		 * notes helped only after i checked out some nice advice for this problem. (i didnt copy-paste this code)
		 * 
		 */
	}
}
