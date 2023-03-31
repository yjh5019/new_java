package java_03;

import java.util.Scanner;

public class java_03_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
		int count = 1;
		int sum = 0;
		
		while(true) {
			System.out.print("input : ");
			int num = sc.nextInt();
//			if(num==0) {
//				break;
//			}
				
			sum += num;
				max = Math.max(max, num);
				min = Math.min(min, num);
				double mean = (double)sum/count;
				System.out.println("result"+count+" : "+"Mean: "+mean+" Max: "+max+" Min: "+min);
				
			
			

			count++;
			
		}
		
		
	}

}
