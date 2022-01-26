package chapter1;

public class Q1_6_StringCompression {
	/*
	 * time complexity:  O(n)
	 * space complexity: O(n)
	 */
	static String solution(String str) {
		int n = str.length();
		var sb = new StringBuilder();	
		
		// loop through string
		int i = 0;
		while (i < n) {
			char currChar = str.charAt(i);
			
			// loop for as long as the same char appears
			int count = 0;
			while (i < n && currChar == str.charAt(i)) {
				i++;
				count++;
			}
			sb.append(currChar);
			sb.append(count);
		}
		
		String compressed = sb.toString();
		// if new string is not shorter then return original string
		return compressed.length() < n ? compressed.toString() : str;
	}
}
