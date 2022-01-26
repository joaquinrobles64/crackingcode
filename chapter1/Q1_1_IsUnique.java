package chapter1;

import java.util.HashSet;

public class Q1_1_IsUnique {
	/* 
	 * time complexity: O(n)
	 * space complexity: O(n)
	 */
	static boolean solution(String string) {
		int n = string.length();
		HashSet<Character> hashset = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			Character currChar = string.charAt(i);
			if (hashset.contains(currChar)) {
				return false;
			} else {
				hashset.add(currChar);
			}
		}
		
		return true;
	}
}
