package chapter1;

import java.util.HashMap;

/**
 * each unique char count should be a multiple of 2 for even length strings
 * odd length strings will be the same except there will be one character that appears only once
 */
public class Q1_4_PalindromePermutation {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(n)
	 */
	static boolean solution(String input) {
		String string = input.trim();
		int n = string.length();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		// add chars from string to HashMap and increment the char's count when more are found
		for (int i = 0; i < n; i++) {
			Character letter = string.charAt(i);
			if (hashmap.containsKey(letter)) {
				int letterCount = hashmap.get(letter);
				hashmap.put(letter, ++letterCount);
			} else {
				hashmap.put(letter, 1);
			}
		}
		
		// check that no more than one character has an odd count
		boolean foundOdd = false;
		for (Integer count: hashmap.values()) {
			/*
			 * if we find a char with odd count and there already exists another char with
			 * an odd count then return false
			 */
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
}
