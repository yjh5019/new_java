package softwarecoding_04;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo37_iVal;
		for (int kopo37_i=0; kopo37_i<300; kopo37_i++) {  // 조건문 반복으로 0~1500 까지 연산하자
			kopo37_iVal = 5 * kopo37_i;
			if(kopo37_iVal>=0 && kopo37_iVal<100)
				System.out.printf("일 %d\n",kopo37_iVal); // 비트연산자 & 와 &&의 차이는 같은 결과를 
			// 나오게 하지만 & 는 앞의 조건식이 false 여도 뒤의 조건식이 true인지 false 인지 판별한다. 어차피 결과는 false인데도 말이다.
			// && 는 앞의 조건식이 false 라면, 뒤의 조건식은 true인지 false인지 신경쓰지 않는다. 어차피 결과는 false이기 때문이다.
			else if(kopo37_iVal>=10 && kopo37_iVal<100) // 10이상 100 미만은 십의 단위로 출력
				System.out.printf("십 %d\n",kopo37_iVal);
			else if(kopo37_iVal>=100 && kopo37_iVal<1000) // 100이상 1000 미만은 백의 단위로 출력
				System.out.printf("백 %d\n",kopo37_iVal);
			else // 그외 단위는 천으로 출력
				System.out.printf("천 %d\n",kopo37_iVal);
			
		}
	}

}
