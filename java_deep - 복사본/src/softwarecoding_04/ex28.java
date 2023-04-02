package softwarecoding_04;

import java.text.DecimalFormat;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//칸 맞추기 실습
		String kopo37_item = "사과"; // 문자열 변수 선언
		int kopo37_unit_price = 5000; // 단가
		int num = 500; // 수량
		int kopo37_total = 0; // 합계이므로 0인 변수를 선언해 쌓아 나가야함
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat으로 형태 지정
		
		// 헤더 찍기
		System.out.printf("=====================================================\n");
		// 20, 8,8,8 씩 만큼의 공간을 확보해 칸 맞추기
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n","품목","단가","수량","합계");
		System.out.printf("=====================================================\n");
		// 값 찍기 // 20, 10, 10, 10 // DecimalFormat으로 콤마 찍기 수행
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n",
				kopo37_item,df.format(kopo37_unit_price),df.format(num),df.format(kopo37_unit_price*num));
		
		System.out.printf("=====================================================\n");
		
	}

}
