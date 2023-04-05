package java_deep;

public class java_deep_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//////////////////////
		// #2 누적하기, 합 구하기
		
		int sum; //합 구하는 변수 선언
		sum = 0; // 초기화
		
		for(int i=1; i<101; i++) {
			
			sum += i; // for 반복문을 통해 누적 sum 
			
			
		}
		System.out.printf("#2 : %d\n", sum); //sum 출력
		System.out.printf("#2-2 : %d\n", (sum/100)); // 평균값 출력
		
		int [] v = {1,2,3,4,5}; //배열 v 
		int vSum = 0; // 배열 합 변수 선언
		
		for(int i=0; i<5; i++) {
			vSum=vSum+v[i]; // 반복문을 통해 합 변수에 누적
		}
		System.out.printf("#2-3 : %d\n", vSum); // 누적 출력
	}

}
