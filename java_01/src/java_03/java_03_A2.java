package java_03;
import java.util.Scanner;

public class java_03_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	int p = 0;
	int n = 0;
	int o = 0;
	int e = 0;

	
	
	while(true) {
		
		
		System.out.print("input : ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			
			p++;
			if(num%2 == 0) {
				
				e++;
			}else {
				o++;
			}
			
		}else {
			
			n++;
			if(num%2 != 0) {
				o++;
			}else {
				e++;
			}
		}
		System.out.println("p - "+p+" n - "+n+" o - "+o+" e - "+e);
				
				
			
			
		}

	}

}
