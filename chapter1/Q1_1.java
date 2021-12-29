package chapter1;

import java.util.HashMap;

public class Q1_1 {
	static boolean isUnique(String string) {
		int n = string.length();
		HashMap<Character, Boolean> hashmap = new HashMap<Character, Boolean>();
		
		for (int i = 0; i < n; i++) {
			Character currChar = string.charAt(i);
			if (hashmap.containsKey(currChar)) {
				return false;
			} else {
				hashmap.put(currChar, true);
			}
		}
		
		return true;
	}
}
