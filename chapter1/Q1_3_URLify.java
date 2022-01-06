package chapter1;

public class Q1_3_URLify {
	static String solution (String string) {
		int n = string.length();
		if (n == 0) return string;
			
		int startCharIndex, endCharIndex;
		
		startCharIndex = findStartIndex(string);
		endCharIndex = findEndIndex(string);
		
		String urlified = string.substring(startCharIndex, endCharIndex+1);
		
		return urlified.replaceAll(" ", "%20");
	}
	
	private static int findEndIndex (String st) {
		int iter = st.length() - 1;
		while (st.charAt(iter) == ' ') {
			iter--;
		}
		return iter;
	}
	
	private static int findStartIndex (String st) {
		int iter = 0;
		while (st.charAt(iter) == ' ') {
			iter++;
		}
		return iter;
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
