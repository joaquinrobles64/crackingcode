package chapter1;

public class Q1_5_OneAway {
	static boolean solution(String s1, String s2) {
		if (s1.equals(s2)) { return true; }
		
		int n = s1.length(),  m = s2.length();
		
		if (n == m) { // check if one diff char
			return diff(s1, s2);
		} else if (n - 1 == m) { // check if one less char
			return oneMoreOrLess(s1, s2);
		} else if (n + 1 == m) { // check if one more char
			return oneMoreOrLess(s2, s1);
		}
		
		return false;
	}
	
	private static boolean diff(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) { return false; }
				foundDifference = true;
			}
		}
		return true;
	}
	
	// stealing this part from the book
	// s1 is always longer than s2 btw
	private static boolean oneMoreOrLess(String s1, String s2) {
		int index1 = 0, index2 = 0;
		
		while (index2 < s2.length() && index1 < s1.length()) {
			/*
			 * check if the char at current index of each string is different
			 * 
			 * so like s1 = cheese and s2 = chese for example, where this block does its job
			 * would be: [s1 at index 3: e, s2 at index 3: s]
			 * 
			 * were s2 to be something like chesa then the index check would kick in and
			 * return false thanks to the index2++
			 * 
			 * i think
			 */
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} 
			else {
				index1++;
				index2++;
			}
		}
		
		return true;
	}
}
