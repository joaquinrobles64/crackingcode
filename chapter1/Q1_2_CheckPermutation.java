package chapter1;

import java.util.HashSet;

/**
 * good questions to ask cause its a string problem
 * - is the permutation case sensitive?
 * - is whitespace significant?
 */
public class Q1_2_CheckPermutation {
	/*
	 * time complexity: O(2n) => O(n)
	 * space complexity: O(n)
	 */
	static boolean solution(String s1, String s2) {
		int n = s1.length();
		int n2 = s2.length();
		
		if (n != n2) return false; // different lengths means its not a permutation
		
		HashSet<Character> hashset = new HashSet<>();
		// add s1 chars to hashset
		for (int i = 0; i < n; i++) {
			Character s1Char = s1.charAt(i);
			hashset.add(s1Char);
		}
		
		// go through s2 and check if current char of s2 is not in the hashset 
		for (int i = 0; i < n; i++) {
			Character s2Char = s2.charAt(i);
			if (!hashset.contains(s2Char)) {
				return false;
			}
		}
		
		return true;
	}
}

//	static boolean checkPermutation(String s1, String s2) {
//		if (s1.length() != s2.length()) return false;
//		return sort(s1).equals(sort(s2));
//	}
//	
//	private static String sort(String s) {
//		char[] charArray = s.toCharArray();
//		Arrays.sort(charArray);
//		return new String(charArray);
//	}
