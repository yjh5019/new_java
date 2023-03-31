package java_02;
import java.util.Scanner;
public class java_02_A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int num = 0;
		
		if(n<m) {
			for (int i = 1; i<=m; i++) {
				if(m%i==0 && n%i==0) {
					num = i;
					
				}
				
			}
		} else {
			for (int i = 1; i<=n; i++) {
				if(m%i==0 && n%i==0) {
					num = i;
		}
		
			
					
				}
				
			}
		System.out.println(num);
		}
		
	}


