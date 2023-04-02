package softwarecoidng_02;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo37_i = 10; // 변수선언
		byte kopo37_b = (byte)kopo37_i; // int형을 byte형으로 형변환 
		System.out.printf("[int->byte] i=%d -> b=%d%n",kopo37_i, kopo37_b); // 출력
		
		kopo37_i = 300;
		kopo37_b = (byte)kopo37_i; //int형을 byte형으로 형변환 
		System.out.printf("[int->byte] i=%d -> b=%d%n",kopo37_i, kopo37_b);
		
		kopo37_b = 10;
		kopo37_i = (int)kopo37_b;
		System.out.printf("[byte->int] b=%d -> i=%d%n",kopo37_b, kopo37_i);
		
		kopo37_b = -2;
		kopo37_i = (int)kopo37_b; // 음의 값이 어떻게 나오는지 보자
		System.out.printf("[byte->int] b=%d -> i=%d%n",kopo37_b, kopo37_i);
		
		System.out.printf("i="+Integer.toBinaryString(kopo37_i));
	}

}
