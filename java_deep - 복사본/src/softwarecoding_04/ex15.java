package softwarecoding_04;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo37_iA,kopo37_iB; // 정수형 변수 선언
		
		kopo37_iA = 0; // 변수 초기화
		while(true) { // 무한 루프
			kopo37_iB = 0; // 초기화
			while(true) {
				System.out.printf("*"); // 별 출력
				
				if(kopo37_iA==kopo37_iB) break; // 만약 iA와 iB가 같다면 반복문 탈출
				kopo37_iB++; // iB 1 증가
			}
			System.out.printf("\n"); // 위에서 break가 걸리면 반복문을 탈출하고 줄바꿈
			kopo37_iA++; // iA 1씩 증가
			if(kopo37_iA==30)break; // 별 30개 찍힐때까지 반복
		} 
	}

}
