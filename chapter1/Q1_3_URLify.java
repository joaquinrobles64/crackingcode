package chapter1;

public class Q1_3_URLify {
	/*
	 * time complexity: O(2n) => O(n)
	 * space complexity: O(n)? cause of substring?
	 */
	static String solution (String string) {
		int n = string.length();
		if (n == 0) return string;
		
		return string.trim().replaceAll(" ", "%20");
	}
}

//	// book solution
//	void replaceSpaces(char[] str, int trueLength) {
//		int spaceCount = 0, index, i = 0;
//		for (i = 0; i < trueLength; i++) {
//			if (str[i] == ' ') {
//				spaceCount++;
//			}
//		}
//		index = trueLength + spaceCount * 2;
//		if (trueLength < str.length) str[trueLength] = '\0'; // end array
//		for (i = trueLength - 1; i >= 0; i--) {
//			if (str[i] == ' ') {
//				str[index - 1] = '0';
//				str[index - 2] = '2';
//				str[index - 3] = '%';
//				index = index - 3;
//			} else {
//				str[index - 1] = str[i];
//				index--;
//			}
//		}
//	}
