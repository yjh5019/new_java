package java_basic;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String inputString = scanner.nextLine();

        // 단어 입력 받기
        System.out.print("단어를 입력하세요: ");
        String inputWord = scanner.nextLine();

        // 문자열에서 입력한 단어의 개수 세기
        String[] words = inputString.split(" "); // 문자열을 단어 배열로 분리
        int count = 0;
        for (String word : words) {
            if (word.contains(inputWord)) { // 입력한 단어가 현재 단어에 포함되어 있으면
                count++; // 개수 증가
            }
        }

        System.out.println("입력한 문자열: " + inputString);
        System.out.println("입력한 단어: " + inputWord);
        System.out.println("입력한 단어가 포함된 개수: " + count);
		}

	}

}
