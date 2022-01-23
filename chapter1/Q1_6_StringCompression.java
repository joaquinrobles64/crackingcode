package chapter1;

public class Q1_6_StringCompression {
	/* O(n) runtime */
	static String solution(String str) {
		int n = str.length();
		var sb = new StringBuilder();	
		
		int i = 0;
		while (i < n) {
			char currChar = str.charAt(i);
			int count = 0;
			
			while (i < n && currChar == str.charAt(i)) {
				i++;
				count++;
			}
			sb.append(currChar);
			sb.append(count);
		}
		
		String compressed = sb.toString();
		return compressed.length() < n ? compressed.toString() : str;
	}
}
