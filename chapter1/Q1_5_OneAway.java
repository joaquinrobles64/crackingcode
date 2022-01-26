package chapter1;

public class Q1_5_OneAway {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(1)
	 */
	static boolean solution(String s1, String s2) {
		if (s1.equals(s2)) return true;
		
		int n = s1.length(), m = s2.length();
		
		// check if one diff char
		if (n == m) return diff(s1, s2);
		// check if one less char 
		else if (n - 1 == m) return oneMoreOrLess(s1, s2);
		// check if one more char
		else if (n + 1 == m) return oneMoreOrLess(s2, s1);
		
		return false;
	}
	
	// check that only ONE character between the two strings is different
	private static boolean diff(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) return false;
				
				foundDifference = true;
			}
		}
		return true;
	}
	
	// i just stole this part from the book
	// s1 is always longer than s2 btw
	private static boolean oneMoreOrLess(String s1, String s2) {
		int index1 = 0, index2 = 0;
		
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
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				index2++;
				if (index1 != index2) {
					return false;
				}
				
			} 
			else {
				index1++;
				index2++;
			}
		}
		
		return true;
	}
}
