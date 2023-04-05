package softwarecoding_04;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kopo37_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; // 문자 배열 생성
		for (int kopo37_i=0;kopo37_i<101; kopo37_i++) { // 반복문
			if(kopo37_i>=0 && kopo37_i<10) { // 1~9 까지 문자열 출력
				System.out.printf("일의 자리 : %s\n", kopo37_units[kopo37_i]);

			}else if(kopo37_i >=10 && kopo37_i<100) {
				int kopo37_i10,kopo37_i0; // 십의자리, 일의자리 선언
				kopo37_i10 = kopo37_i/10; // 십의 자리 
				kopo37_i0 = kopo37_i%10; // 일의 자리
				if(kopo37_i0==0) {
					System.out.printf("십의자리 : %s십\n",kopo37_units[kopo37_i10]);
				}else {
					System.out.printf("십의자리 : %s십%s\n",kopo37_units[kopo37_i10],kopo37_units[kopo37_i0]);
				}
			}else
				System.out.printf("==>%d\n",kopo37_i);
			
		}
	}

}
