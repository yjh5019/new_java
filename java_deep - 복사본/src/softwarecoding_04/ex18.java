package softwarecoding_04;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int kopo37_i=1;kopo37_i<13;kopo37_i++) { // 1월~12월 까지 반복문
			System.out.printf("%d월=>", kopo37_i);
			for(int j=1; j<32; j++) { // 각 월의 일수롤 계산하는 반복문 작성
				System.out.printf("%d,", j);
				//각 월마다의 일수까지 출력 후 조건문 제어문을 통해 break
				if(kopo37_i==1 && j==31) 
					break;
				if(kopo37_i==2 && j==28)
					break;
				if(kopo37_i==3 && j==31)
					break;
				if(kopo37_i==4 && j==30)
					break;
				if(kopo37_i==5 && j==31)
					break;
				if(kopo37_i==6 && j==30)
					break;
				if(kopo37_i==7 && j==31)
					break;
				if(kopo37_i==8 && j==31)
					break;
				if(kopo37_i==9 && j==30)
					break;
				if(kopo37_i==10 && j==31)
					break;
				if(kopo37_i==11 && j==30)
					break;
				if(kopo37_i==12 && j==31)
					break;
			}
			System.out.printf("\n"); // 각 월의 일자를 모두 출력했을 경우 break 후 줄바꿈 실행
		}
	}

}
