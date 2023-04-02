package softwarecoidng_02;

public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short kopo37_sMin = -32768; // short 자료형의 최솟값
		short kopo37_sMax = 32767; // 최댓값
		char kopo37_cMin = 0; 
		char cMax = 65535; // char 변수의 최댓값
		// 각 자료형에 대해 형변환을 통해 값들을 출력 (최대 최소를 
		System.out.println("sMin = "+ kopo37_sMin); // 최솟값
		System.out.println("sMin-1 = "+ (short)(kopo37_sMin-1)); // 
		System.out.println("sMax " + kopo37_sMax);
		System.out.println("sMax+1= "+(short)(kopo37_sMax+1));
		System.out.println("cMin = " + (int)kopo37_cMin);
		System.out.println("cMin-1 = " + (int)--kopo37_cMin); // 
		System.out.println("cMax = " + (int)cMax); // 최댓값
		System.out.println("cMax+1 = "+(int)++cMax); // 최대값 범위를 벗어나 0을 출력함
	}

}
