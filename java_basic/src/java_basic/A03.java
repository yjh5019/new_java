package java_basic;
import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String i = "i go to the school";
		byte[] j = i.getBytes();
		
		for(int k=0; k<j.length; k++) {
			
			System.out.println(i);
			System.out.println(j);
		}
		
		
		
//		Scanner scanner = new Scanner(System.in);
		
		
        // 문자열 입력 받기
//        System.out.print("문자열을 입력하세요: ");
//        String inputString = scanner.nextLine();
//
//        // 단어 입력 받기
//        System.out.print("단어를 입력하세요: ");
//        String inputWord = scanner.nextLine();

       
      
		    }

	}



/*
import java.util.HashMap;
import java.util.Map;

public class StringEncryptor {
    public static void main(String[] args) {
        String original = "abcd";
        String encrypted = encryptString(original);
        System.out.println("원본 문자열: " + original);
        System.out.println("암호화된 문자열: " + encrypted);
    }

    public static String encryptString(String original) {
        // 원본 문자열과 암호화된 문자열을 매칭할 배열 정의
        char[] originalArr = {'a', 'b', 'c', 'd'};
        char[] encryptedArr = {'z', 'y', 'x', 'w'};
        
        // 원본 문자열을 char 배열로 변환하여 암호화된 문자열로 치환
        char[] encryptedCharArr = original.toCharArray();
        for (int i = 0; i < encryptedCharArr.length; i++) {
            for (int j = 0; j < originalArr.length; j++) {
                if (encryptedCharArr[i] == originalArr[j]) {
                    encryptedCharArr[i] = encryptedArr[j];
                    break;
                }
            }
        }
        
        // 암호화된 문자열로 변환 후 반환
        return new String(encryptedCharArr);
    }
}*/