package java_02;
import java.util.Scanner;
public class java_02_A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		int n = sc.nextInt();
		
		 for (int i = 2; i <= n; ++i) {
			   for (int j = 2; j <= n ; ++j) {
			    if (i % j == 0) {
			     if (i == j)
			      System.out.print(i + " ");
			     else
			      break;
			}
			   }
			
		}
		
		
		
	}

}
