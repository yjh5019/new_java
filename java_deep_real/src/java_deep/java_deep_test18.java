package java_deep;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class java_deep_test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////단순 환전 계산/////////////////
		int MyWon = 1000000; // 한화100만원
		double MoneyEx = 1238.21; // 달러 환율
		double commission = 0.003; // 환전 수수료
		
		int usd = (int) (MyWon/MoneyEx); // 한화를 달러로 바꾸는 식, 정수형으로 리턴받아 소수점 버림
		int remain = (int) (MyWon-usd*MoneyEx); // 환전 후 잔액에 대한 수식, 소수점 또한 버림으로 처리
		// 수수료 없이 계산
		// 총 한화 환전금액, 미화, 잔돈
		// 출력
		System.out.printf("************************************************************\n");
		System.out.printf("*			수수료없이 계산			*\n");
		System.out.printf("총 한화환전금액: %d=>	미화:	%d달러, 잔돈: %d원\n",MyWon, usd, remain);
		System.out.printf("************************************************************\n");
		
		///수수료 포함 환전 계산(1)
		
		double ComPerOne = MoneyEx * commission; // 1달러당 수수료 (달러환율 * 환전수수료)==> 실수로 리턴받는다
		
		double totalcom = usd * ComPerOne; // 1달러당 수수료를 총 환전 달러를 곱해 총 수수료 계산==>실수형으로 리턴
		System.out.printf("************************************************************\n");
		System.out.printf("*			수수료 계산			*\n");
		System.out.printf("총 수수료: %f원=>	미화:	%d달러, 달러당 수수료: %f원\n", totalcom, usd, ComPerOne);
		System.out.printf("************************************************************\n");

		///수수료 포함 환전 계산(2)
		// 수수료에 대한 소수점의 값들이 전부 버려지기 때문에 1달러
		int i_totalcom; // 
		
		if (totalcom != (double)((int)totalcom)) // 총수수료가 실수형 즉, 소수점까지 나타내어지기때문에 정수형으로 변환 한 값이 
												//  기존 총수수료의 값과 같지 않다면===>조건문 수행
			i_totalcom = (int)totalcom+1;		// 올림 처리 하여 총수수료 재정의
		else
			i_totalcom = (int)totalcom;         // 만약 그 값이 같다면 그대로 정수형으로 총수수료 정의	
		System.out.printf("************************************************************\n");
		System.out.printf("*			수수료 적용환전			*\n");
		System.out.printf("총 수수료: %d원=>	미화:	%d달러, 달러당 수수료: %f원\n", i_totalcom, usd,ComPerOne);
		System.out.printf("************************************************************\n");
		
		remain = (int)(MyWon-usd*MoneyEx - i_totalcom); // 그에 따른 잔돈 계산==> 실수형이 아닌 정수형
		System.out.printf("총 한화환전금액: %d원=>	미화:	%d달러, 수수료징구: %d원 잔돈: %d\n", MyWon, usd, i_totalcom, remain);
		System.out.printf("************************************************************\n");
		
		///수수료 포함 환전 계산(3)
		// 따라서 1달러당 원화금액+1달러당 수수료를 통해 실수형 계산 진행
		usd = (int) (MyWon/(MoneyEx + ComPerOne)); // 환전 달러==>1000000원/(1달러 환율 + 1달러당 수수료)
		totalcom = usd * ComPerOne; // 수수료를 포함한 환전 달러를 1달러당 수수료 곱하여==>총 수수료 계산
		
		if(totalcom != (double)((int)totalcom)) // 총수수료가 실수형 즉, 소수점까지 나타내어지기때문에 정수형으로 변환 한 값이  
			i_totalcom = (int)totalcom+1;		//  기존 총수수료의 값과 같지 않다면===>조건문 수행 // 올림 처리 하여 총수수료 재정의
		else
			i_totalcom=(int)totalcom;			// 만약 그 값이 같다면 그대로 정수형으로 총수수료 정의
		//출력 화면
		System.out.printf("************************************************************\n");
		System.out.printf("*			(정확한)수수료 적용환전			*\n");
		System.out.printf("총 수수료: %d원=>	미화:	%d달러, 달러당 수수료: %f원\n", i_totalcom, usd,ComPerOne);
		System.out.printf("************************************************************\n");
		
		remain = (int) (MyWon-usd*MoneyEx - i_totalcom); // 잔돈 
		System.out.printf("총 한화환전금액: %d원=>	미화:	%d달러, 수수료징구: %d원 잔돈: %d\n", MyWon, usd, i_totalcom, remain);
		System.out.printf("************************************************************\n");
		
		
		//////////////////////////////////////////////////////////////////
		//////////////////콤마 찍기////////////////
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat은 다양한 숫자 데이터를 자신의 원하는 형식으로 나타낼 수 있는 클래스
																	// 금액에 대한 콤마를 찍어 가독성을 높임
		System.out.printf("************************************************************\n");
		System.out.printf("*			콤마찍기,날짜적용	*\n");
		
		
		System.out.printf("총 수수료:	%s=> 미화: %s달러,		달러당 수수료:	%f원\n",
				df.format(i_totalcom), // 총 수수료 콤마
				df.format(usd), // 미화 콤마 찍힌것
				ComPerOne ); // 달러당 수수료
		
		remain = (int) (MyWon-usd*MoneyEx - i_totalcom); // 잔액
		System.out.printf("총 한화환전금액: %s원=>	미화:	%s달러, 수수료징구: %s원 잔돈: %s\n",
				df.format(MyWon), df.format(usd), df.format(i_totalcom), df.format(remain)); // 각 요소별 콤마 찍기
		
		
		//////////////////////////////////////////////////////////////////
		/////////////////날짜, 시간 찍기////////////////
		
		Calendar calt = Calendar.getInstance(); // Calendar 클래스를 이용해 현재 시간을 가져옴
		SimpleDateFormat sdt = new SimpleDateFormat("YYY/MM/dd HH:mm:ss"); // 출력 형식 지정
		System.out.printf("최종실행시간: %s\n", sdt.format(calt.getTime())); // 출력 화면 
		System.out.printf("************************************************************\n");
		
		
		
		
		
	}

}
