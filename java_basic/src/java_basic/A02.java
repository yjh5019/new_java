package java_basic;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		Scanner scanner = new Scanner(System.in);

        // ���ڿ� �Է� �ޱ�
        System.out.print("���ڿ��� �Է��ϼ���: ");
        String inputString = scanner.nextLine();

        // �ܾ� �Է� �ޱ�
        System.out.print("�ܾ �Է��ϼ���: ");
        String inputWord = scanner.nextLine();

        // ���ڿ����� �Է��� �ܾ��� ���� ����
        String[] words = inputString.split(" "); // ���ڿ��� �ܾ� �迭�� �и�
        int count = 0;
        for (String word : words) {
            if (word.contains(inputWord)) { // �Է��� �ܾ ���� �ܾ ���ԵǾ� ������
                count++; // ���� ����
            }
        }

        System.out.println("�Է��� ���ڿ�: " + inputString);
        System.out.println("�Է��� �ܾ�: " + inputWord);
        System.out.println("�Է��� �ܾ ���Ե� ����: " + count);
		}

	}

}
