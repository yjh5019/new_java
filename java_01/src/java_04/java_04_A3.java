package java_04;
import java.util.Scanner;
public class java_04_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		
		System.out.print("(");
		for(int i = 1; i <= (m/n); i++) {
			count = n*i;
			sum += count;
			System.out.print(count+"  ");
			
			
		}
		System.out.println(")");
		
		System.out.print("sum "+sum);
		
		
	}

}
