package softwarecoding_04;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo37_n,kopo37_m; // 변수 선언
		kopo37_n = 1; // 1로 초기화
		kopo37_m = 20; // 20으로 초기화
		
		while(true) {
			
			for(int kopo37_i=0; kopo37_i<kopo37_m; kopo37_i++) System.out.printf(" "); // 0~20까지 띄어쓰기=>
															// m값이 20에서 1씩 줄어들기 때문에 띄어쓰기가 줄어듬
			for(int i=0; i<kopo37_n; i++) System.out.printf("*"); // n+2이기 때문에 별의 갯수가 2개씩 증가
			System.out.printf("\n"); // 줄바꿈
			
			kopo37_m = kopo37_m-1;
			kopo37_n = kopo37_n+2;
			if(kopo37_m<0) break; // m값이 계속 줄어들면서 m값이 음수가 되면 프로그램 종료
		}
	}

}
