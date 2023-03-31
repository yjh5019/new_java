package java_02;

import java.util.Scanner;

public class adfadfadafs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("bu : ");
		int num = sc.nextInt();
		
		System.out.println(num + "result:");
		for(int i = 1; i<=num; i++) {
			if (num%i == 0) {
				System.out.println(i);
				
			} 
		}
	}

}
