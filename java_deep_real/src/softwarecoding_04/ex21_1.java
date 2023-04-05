package softwarecoding_04;

public class ex21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] kopo37_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31}; // array로 각 마지막달의 일자를 정수형으로 선언
	
	for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1월~12월 까지 반복문
	System.out.printf("%d월=>", kopo37_i);
	for(int kopo37_j=1; kopo37_j<32; kopo37_j++) { 
		System.out.printf("%d",kopo37_j);
	if(kopo37_iLMD[kopo37_i-1]==kopo37_j) // 만약 마지막달의 일수가 j 반복문의 마지막 일수와 같다면
		break; // 콤마를 찍지 않고 나감
	System.out.printf(","); // 평소에 콤마를 찍다가
	}
			System.out.printf(".\n");
	}
	}

}
