package java_02;

import java.util.Scanner;



public class java_02_A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		int num = 0;
		for (int i = 1; i<=n*m; i++) {
			if (i%n==0 && i%m==0) {
				num = i;
				break;
			}
			
		}
		System.out.println();
		
		
		
		
		
	}
	
		
	
	}



