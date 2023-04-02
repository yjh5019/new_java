package softwarecoding_04;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// iNumval ==> 정수형 변수 ==> 문자형으로 변환 ==> (문자형으로 변환해야 각 요소를 나눌 수 있음???)substring으로 각 요소를 분리
		// ==>분리한 요소의 각 문자"0","1"..등을 Integer.parseInt을 통해 정수로 변환(units 배열의 인덱
		// units[0],units[1]..등으로 표현 해야 하기 때문에 위와 같은 과정을 거쳐야함
		int k37_iNumVal = 1300000000;
//		int k37_iNumVal = 2101034567;
		
		String k37_sNumVal = String.valueOf(k37_iNumVal); // 정수형 변수 iNumVal을 문자열로 변환하여 sNumVal에 할당
		String k37_sNumVoice = ""; // 빈 문자열 생성
		
		
		System.out.printf("==> %s [%d자리]\n",k37_sNumVal,k37_sNumVal.length()); // sNumVal과 sNumVal의 자릿수 출력
		int k37_i,k37_j;
		
		String[] k37_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; // string 문자열 배열 생성
		String[] unitX = {"","십","백","천","만","십","백","천","억","십"}; // string 문자 배열 생성
		k37_i = 0; // 변수 초기화 정수형
		k37_j = k37_sNumVal.length()-1; //j를 sNumVal 문자열의 길이에서 1을 뺀 값으로 초기화===> 처음 인덱스가 0에서 시작하기 때문에==>9
		
		while(true) {
			if(k37_i>=k37_sNumVal.length()) //11자리 이상이라면 반복문 중지
				break;
			/// sNumVal 문자열에서 i+1번째 문자 하나를 추출하여 units 배열에서 해당하는 한글 단어를 가져와 출력
			System.out.printf("%s[%s]",
					k37_sNumVal.substring(k37_i,k37_i+1), // substring ==>문자열 자르기==>숫자를 하나씩 꺼내기
					k37_units[Integer.parseInt(k37_sNumVal.substring(k37_i,k37_i+1))]); //parseInt()의 기능은 String타입의 숫자를 int타입으로 변환
			
			// sNumVal 문자열에서 i+1번째 문자 하나를 추출하여 그게 0이면 조건문 수행
			if (k37_sNumVal.substring(k37_i, k37_i + 1).equals("0")) {
			    if (unitX[k37_j].equals("만") || unitX[k37_j].equals("억")) {
			        if(unitX[k37_j].equals("만")) {
			        	if (!k37_sNumVal.substring(2, 6).equals("0000")) { // "만" 자리가 "0000"이 아니면 "만"을 출력
			        		k37_sNumVoice = k37_sNumVoice + "" + unitX[k37_j];
			        	
			        }
			        	else {
			        		//생략
			        	}
			        if(unitX[k37_j].equals("억")) {
			        	
			        	k37_sNumVoice = k37_sNumVoice + "" + unitX[k37_j];
			        }
			        	
			        
			        }
			        
			    }
			    else {
			        // 생략
			    }
			} else {
			    k37_sNumVoice = k37_sNumVoice + k37_units[Integer.parseInt(k37_sNumVal.substring(k37_i, k37_i + 1))] + unitX[k37_j];
			}
			k37_i++;
			k37_j--;
		}
		System.out.printf("\n %s[]%s\n",k37_sNumVal,k37_sNumVoice);
		
	}

}
