package softwarecoding_04;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopo37_il;
		double kopo37_iD;
		
		kopo37_il = 10/3;
		kopo37_iD = 10/3.0;
		
		if(kopo37_il==kopo37_iD) // 정수값과 실수값이 같다면 출력
			System.out.printf("equal\n");
		else // 다르다면 출력
			System.out.printf("Not equal[%f][%f]\n",(double)kopo37_il,kopo37_iD);
		if(kopo37_il==3.333333) // 정수형 변수가 실수형이니 출력 x
			System.out.printf("equal\n");
		else // 다르니까 이것이 출력됌
			System.out.printf("Not equal[3.333333][%f]\n",kopo37_iD);
		kopo37_iD=(int)kopo37_iD; // 실수형을 정수형 변수로 형변환
		if(kopo37_il==kopo37_iD) // 같아졌으니 해당 라인 출력
			System.out.printf("equal\n");
		else
			System.out.printf("Not equal[%f][%f]\n",(double)kopo37_il,kopo37_iD);
		
		System.out.printf("int로 인쇄[%d][%f]\n",kopo37_il,kopo37_iD);
		System.out.printf("double로 인쇄[%f][%f]\n",(double)kopo37_il,kopo37_iD);
		
		char kopo37_a = 'c'; // char 은 단일 문자형
		if(kopo37_a=='b') // a == b로 표현 
			System.out.printf("a는 b이다\n");
		if(kopo37_a=='c')
			System.out.printf("a는 c이다\n");
		if(kopo37_a=='d')
			System.out.printf("a는 d이다\n");
		
		String kopo37_aa="abcd";
		if(kopo37_aa.equals("abcd")) // string은 aa==abcd 가 아닌 equals를 이용해 작성해야함
			System.out.printf("aa는 abcd이다\n");
		else
			System.out.printf("aa는 abcd이 아니다\n");
		boolean bb = true;
		if(!!bb) // !은 not 이므로 !!은 true
			System.out.printf("bb가 아니고 아니면 참이다\n");
		else
			System.out.printf("bb가 아니고 아니면 거짓이다\n");
		
		

	}

}
