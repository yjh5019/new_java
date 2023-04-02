package softwarecoidng_02;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com";
				
		float kopo37_f1 = .10f; // 0.1
		float kopo37_f2 = 1e1f; // 1 * 10^1
		float kopo37_f3 = 3.14e3f; // 3.14 * 10^3
		double kopo37_d = 1.23456789;
		// 지수형태,실수 형태로 출력
		System.out.printf("f1=%f, 	%e,	%g%n",kopo37_f1, kopo37_f1, kopo37_f1);  
		System.out.printf("f2=%f, 	%e,	%g%n",kopo37_f2, kopo37_f2, kopo37_f2);
		System.out.printf("f3=%f, 	%e,	%g%n",kopo37_f3, kopo37_f3, kopo37_f3);
		
		System.out.printf("d=%f%n", kopo37_d); 
		System.out.printf("d=%14.10f%n", kopo37_d); // 총 14자리, 소수 10째 까지 출력
		
		System.out.printf("[12345678901234567890]%n"); 
		System.out.printf("[%s]%n",url); // 문자열 출력
		System.out.printf("[%20s]%n",url); // 20자리 오른쪽 정렬
		System.out.printf("[%-20s]%n",url); // 20자리 왼쪽 정렬
		System.out.printf("[%.8s]%n",url); // 문자열 중에서 앞에서부터 8자리까지만 출력
		
	}

}
