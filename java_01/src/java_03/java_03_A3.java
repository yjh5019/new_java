package java_03;


public class java_03_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I go to school";
		int[] counts = new int[26]; // 알파벳 개수 저장할 배열

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (ch >= 'a' && ch <= 'z') {
		        counts[ch - 'a']++; // 소문자 알파벳 개수 증가
		    } 
		}

		// 결과 출력
		for (int i = 0; i < 26; i++) {
		    if (counts[i] > 0) {
		        System.out.println((char) ('a' + i) + " - " + counts[i]);
		    }
		}
	}
}
