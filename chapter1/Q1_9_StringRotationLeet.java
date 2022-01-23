package chapter1;

/* 
 * i stumbled upon the leetcode version of this problem
 * and solved that... and had the solution for 
 * the book's version of this question spoiled. 
 * so here's my accepted submission for leetcode.
 */
public class Q1_9_StringRotationLeet {
	/* 
	 * O(n^2) time | O(n) space, 
	 * I think... cause i make the char array 
	 * along with the string.valueof cause strings are silly slow in java
	 */
	public static boolean solution(String s, String goal) {
		int n = s.length();
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < n; i++) {
			if (String.valueOf(chars).equals(goal)) {
				return true;
			} 
			else {
				leftShift(chars);
			}
		}
		return false;
	}
	
	private static void leftShift(char[] chars) {
		if (chars.length <= 1) return;
		char firstChar = chars[0];
		
		for (int i = 0; i < chars.length - 1; i++) {
			chars[i] = chars[i + 1];
		}
		chars[chars.length - 1] = firstChar;
	}
}
