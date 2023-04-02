package java_deep;

public class java_deep_test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/////////////////////////////////////////
		// #3 정수형 변수의 나눗셈
		
		int kopo37_i;
		
		kopo37_i = 1000/3;
		System.out.printf("#3-1 : %d\n", kopo37_i); // 정수형 %d 이기 때문에 소수 부분은 버려짐
		
		kopo37_i = 1000%3;
		System.out.printf("#3-2 : %d\n", kopo37_i); // 나머지 연산자 %
		
		//나머지 연산자 응용
		
		for(int i=0; i<20; i++) {
			
			System.out.printf("#3-3 : %d ", i);  //
			if(((i+1)%5)==0) { // i 변수가 0으로 초기화 되었기 때문에 i+1 값으로 나머지 연산을 통해 출력
				
				System.out.printf("\n", i); //
				
			}
		}
		
		/////////////////////////////////////////
		// #4 원하는 자릿수 반올림, 버림처리
		
		kopo37_i = 12345;
		int j = (kopo37_i/10)*10; // 10원 이하 버림
		System.out.printf("#4-1 : %d\n", j);
		kopo37_i = 12345;
		j = ((kopo37_i+5)/10)*10; // 10원 이하 반올림
		
		System.out.printf("#4-2 : %d\n", j);
		kopo37_i = 12344;
		j = (kopo37_i/10)*10; // 반올림
		
		System.out.printf("#4-3 : %d\n", j); // 
		/////////////////////////////////////////
		// #4-X 100원이하 버림 올림, 1000원이하 버림 반올림 구현
		//# 100원 이하 버림
		kopo37_i = 12345;
		j = (kopo37_i/100)*100; 
		System.out.printf("#4-1-1 : %d\n", j);
		
		//# 100원 이하 올림
		kopo37_i = 12345;
		j = ((kopo37_i+55)/100)*100; 
		System.out.printf("#4-1-2 : %d\n", j);
		//# 1000원 이하 버림
		kopo37_i = 12345;
		j = (kopo37_i/1000)*1000; 
		System.out.printf("#4-1-3 : %d\n", j);
		//# 1000원 이하 반올림
		kopo37_i = 12567;
		j = ((kopo37_i+433)/1000)*1000; 
		System.out.printf("#4-1-4 : %d\n", j);
		
		
		
		
		/////////////////////////////////////////
		// #5. 소수점 이하에서
		
		int kopo37_MyVal = 14/5;
		
		System.out.printf("#5-1 : %d\n", kopo37_MyVal);
		
		double kopo37_kopo37_MyValF;
		
		kopo37_kopo37_MyValF=14/5;
		System.out.printf("#5-2 : %f\n", kopo37_kopo37_MyValF); // double 을 선언 하였으므로 소수점 까지 출력 하지만 소수점값들은 표시가 안됌 
		kopo37_kopo37_MyValF=14.0/5;
		System.out.printf("#5-3 : %f\n", kopo37_kopo37_MyValF); // 실수형태로 표시 해야 소수의 값들이 출력됨
		kopo37_kopo37_MyValF=(14.0)/5+0.5;
		System.out.printf("#5-4 : %f\n", kopo37_kopo37_MyValF); // double 형이므로 소수점까지 출력
		kopo37_kopo37_MyValF=(int)((14.0)/5+0.5);
		System.out.printf("#5-5 : %f\n", kopo37_kopo37_MyValF); // double-> int 형으로 형변환이므로 소수점이 버려짐
		
		
		
		
		
		

	}

}
