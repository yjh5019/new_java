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
		
		
        // ���ڿ� �Է� �ޱ�
//        System.out.print("���ڿ��� �Է��ϼ���: ");
//        String inputString = scanner.nextLine();
//
//        // �ܾ� �Է� �ޱ�
//        System.out.print("�ܾ �Է��ϼ���: ");
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
        System.out.println("���� ���ڿ�: " + original);
        System.out.println("��ȣȭ�� ���ڿ�: " + encrypted);
    }

    public static String encryptString(String original) {
        // ���� ���ڿ��� ��ȣȭ�� ���ڿ��� ��Ī�� �迭 ����
        char[] originalArr = {'a', 'b', 'c', 'd'};
        char[] encryptedArr = {'z', 'y', 'x', 'w'};
        
        // ���� ���ڿ��� char �迭�� ��ȯ�Ͽ� ��ȣȭ�� ���ڿ��� ġȯ
        char[] encryptedCharArr = original.toCharArray();
        for (int i = 0; i < encryptedCharArr.length; i++) {
            for (int j = 0; j < originalArr.length; j++) {
                if (encryptedCharArr[i] == originalArr[j]) {
                    encryptedCharArr[i] = encryptedArr[j];
                    break;
                }
            }
        }
        
        // ��ȣȭ�� ���ڿ��� ��ȯ �� ��ȯ
        return new String(encryptedCharArr);
    }
}*/