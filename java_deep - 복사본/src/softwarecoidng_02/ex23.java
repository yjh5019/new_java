package softwarecoidng_02;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte kopo37_b = 1; // 1바이트 크기의 정수형변수에 1을 대입
		short kopo37_s = 2; // 2바이트 크기위 변수에 2 대입
		char kopo37_c = 'A'; // 2바이트 크기의 문자형 변수에 A 대입
		
		int kopo37_finger = 10;
		long kopo37_big = 10000000000L;
		long kopo37_hex = 0xFFFFFFFFFFFFFFFL;
		
		int kopo37_octNum = 010;		// 8진수 10, 10진수 8
		int kopo37_hexNum = 0x10;		// 16진수 10, 10진수 16
		int kopo37_binNum = 0b10;		// 2진수 10, 10진수 2
		
		System.out.printf("b=%d%n", kopo37_b);
		System.out.printf("s=%d%n", kopo37_s);
		System.out.printf("c=%c, %d, %n", kopo37_c, (int)kopo37_c);
		System.out.printf("finger=[%5d]%n", kopo37_finger); // 5자리로 오른쪽 정렬하여 출력
		System.out.printf("finger=[%-5d]%n", kopo37_finger); // 왼쪽 정렬
		System.out.printf("finger[%05d]%n", kopo37_finger); //5자리로 오른쪽 정렬하여 출력, 빈자리는 0으로 채움
		System.out.printf("big=%d%n", kopo37_big);
		System.out.printf("hex=%#x%n", kopo37_hex); // 16진수로 표시하고 앞에 "0x" 표시
		System.out.printf("",kopo37_octNum, kopo37_octNum);
		System.out.printf("", kopo37_hexNum, kopo37_hexNum); 
		System.out.printf("", Integer.toBinaryString(kopo37_binNum), kopo37_binNum);
	}

}


