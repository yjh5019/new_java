package soft_05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k37_df = new DecimalFormat("###,###,###");
		Calendar k37_calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		int kopo37_iPrice= 59000; // 합계를 나타내는 정수형 변수
		int kopo37_Price = Math.round(kopo37_iPrice / 1.1f); // 부가 세금 전의 가격을 계산해서 변수에 반올림하여 변수에 저장
		////////////// 각각의 영수증에 대한 정보를 변수처리해 언제든지 수정 가능하도록 지정함
		String kopo37_danmalgi = "2N68665898";
		String kopo37_gameng = "김포제육볶음";
		String kopo37_address = "경기 성남시 분당구 황새울로351번길 10,1층";
		String kopo37_ceo = "윤지현";
		String kopo37_business = "752-53-00558";
		String kopo37_tel = "7055695";
		String kopo37_phone_num = "041218";
		String kopo37_appro = "70404427"; 
		String kopo37_deal_num = "357734873739";
		
		
		System.out.printf("신용승인\n");
		System.out.printf("단말기 : %s    전화번호 : %s\n",kopo37_danmalgi,kopo37_phone_num); // 단말기 와 전화번호 정보 출력
		System.out.printf("가맹점 : %s\n",kopo37_gameng); // 가맹점 번호
		System.out.printf("주소 : %s\n",kopo37_address); // 주소 출력
		System.out.printf("대표자 : %s\n",kopo37_ceo); // 대표자 출력
		System.out.printf("사업자 : %s      TEL : %s\n",kopo37_business,kopo37_tel); // 사업자에 대한 정보를 변수를 지정하여 출력
		System.out.printf("----------------------------------------\n");
		System.out.printf("금  액%32s원\n",k37_df.format((int)(kopo37_Price))); // 금액을 32공간을 두고 출력, 
		System.out.printf("부가세%32s원\n",k37_df.format((int)(kopo37_iPrice-kopo37_Price)));
		System.out.printf("합  계%32s원\n",k37_df.format(kopo37_iPrice));
		System.out.printf("----------------------------------------\n");
		System.out.printf(" 우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****-4613(S) 일시불\n");
		System.out.printf("거래일시 : %s\n", sdt.format(k37_calt.getTime()));
		System.out.printf("승인번호 : %s\n",kopo37_appro);
		System.out.printf("거래번호 : %s\n",kopo37_deal_num);
		System.out.printf("매입 : 비씨카드사  가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표 \n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("             * 감사합니다 *\n");
		System.out.printf("                      표준v2.08_20200212");

	}

}
