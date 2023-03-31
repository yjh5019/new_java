package java_04;
import java.util.Scanner;
public class java_04_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			
			System.out.println("# Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("Balance : "+count);
			System.out.println("-> ");
			int menu = sc.nextInt();
			int price = sc.nextInt();
			switch(menu) {
				case 1:
					count += price;
					break;
					
				case 2:
					count -= price;
					break;
			
			}
			
		}

	}
}
