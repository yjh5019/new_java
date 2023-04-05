package softwarecoidng_02;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo37_i = 91234567; // 8자리 10진수
		float kopo37_f = (float)kopo37_i; // float 형으로 형변환
		int kopo37_i2 = (int)kopo37_f; // int형으로 변환
		
		double kopo37_d = (double)kopo37_i; // double로 형변환
		int kopo37_i3 = (int)kopo37_d; // int 로 형변환
		
		float kopo37_f2 = 1.666f;
		int kopo37_i4 = (int)kopo37_f2;
		
		System.out.printf("i=%d\n", kopo37_i);
		System.out.printf("f=%f i2=%d\n", kopo37_f, kopo37_i2);
		System.out.printf("d=%f i3=%d\n", kopo37_d, kopo37_i3);
		System.out.printf("(int)%f=%d\n", kopo37_f2, kopo37_i4);
	}

}
