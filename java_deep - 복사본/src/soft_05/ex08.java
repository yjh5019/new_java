package soft_05;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kopo37_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";
		String kopo37_itemcode1 = "[1031615]";
		int kopo37_price1 = 1400;
		int kopo37_amount1 = 1;
		String kopo37_itemname2 = "슬라이드식명찰(가로형)(100호)";
		String kopo37_itemcode2 = "[11008152]";
		int kopo37_price2 = 2500;
		int kopo37_amount2 = 1;
		String k37_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k37_itemcode3 = "[1020800]";
		int k37_pricme3 = 9700;
		int k37_amount3 = 1;
		
		int k37_sum = ((kopo37_price1*kopo37_amount1)+(kopo37_price2*kopo37_amount2)+(k37_pricme3*k37_amount3));
		int k37_Price = Math.round(k37_sum / 1.1f);		
		DecimalFormat df = new DecimalFormat("###,###,###"); // 가격 콤마 찍는 형식 지정
		Calendar k37_calendar = new GregorianCalendar();// 현재 시간을 가져오기
		Calendar k37_calt = Calendar.getInstance();
		SimpleDateFormat k37_SDF = new SimpleDateFormat("MM월 dd일"); // 날짜 형식 지정
		SimpleDateFormat k37_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 날짜 형식 지정
		//////출력화면
		System.out.printf("           \"국민가게, 다이소\"\n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부,신호섭 213-81-52063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");
		System.out.printf("========================================\n");
		System.out.printf("     소비자중심경영(CCM) 인증기업\n");
		System.out.printf("    ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("========================================\n");
		k37_calendar.add(Calendar.DATE, 14); // 캘린더를 가져와 현재시간보다 14일 뒤의 날짜 받아옴
//		chkDate = SDF.format(calendar.getTime());
		System.out.printf("      교환/환불 14일(%s)이내,\n",k37_SDF.format(k37_calendar.getTime())); // 받아온날짜를 출력
		System.out.printf("     (전자)영수증, 결제카드 지참 후\n");
		System.out.printf("           구입매장에서 가능\n");
		System.out.printf("    포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("      체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("========================================\n");
		System.out.printf("[POS 1058231]        %s\n",k37_sdt.format(k37_calt.getTime())); // 현재 시간 날짜를 가져옴
		System.out.printf("========================================\n");
		System.out.printf("%.14s %s %d %s\n",kopo37_itemname1,df.format(kopo37_price1),kopo37_amount1,df.format((int)(kopo37_price1*kopo37_amount1))); // 상품명, 가격, 수량,합계를 출력
		System.out.printf("%s\n",kopo37_itemcode1); // 해당 품목의 넘버를 가져옴
		System.out.printf("%.14s   %s %d %s\n",kopo37_itemname2,df.format(kopo37_price2),kopo37_amount2,df.format((int)(kopo37_price2*kopo37_amount2))); // 상품 정보가져옴
		System.out.printf("%s\n",kopo37_itemcode2);
		System.out.printf("%.14s %s %d %s\n",k37_itemname3,df.format(k37_pricme3),k37_amount3,df.format((int)(k37_pricme3*k37_amount3))); // 상품정보를 가지고 옴
		System.out.printf("%s\n",k37_itemcode3);
		System.out.printf("              과세합계            %.10000000s\n",df.format(k37_Price)); // 부가세 전의 가격을 출력
		System.out.printf("              부가세               %.10000000s\n",df.format(k37_sum-k37_Price)); // 부가세 출력
		System.out.printf("----------------------------------------\n");
		System.out.printf("판매합계                          %.10000000s\n",df.format(k37_sum)); // 모든 합계를 sum으로 변수에 넣어 출력
		System.out.printf("========================================\n");
		System.out.printf("신용카드                          %.10000000s\n",df.format(k37_sum)); // 위와 마찬가지로 지정해서 출력
		System.out.printf("----------------------------------------\n");
		System.out.printf("우리카드                538720**********\n");
		System.out.printf("승인번호 77982843(0)     승인금액 %.10000000s\n",df.format(k37_sum));
		System.out.printf("========================================\n");
		System.out.printf("       %s 분당서현점\n",k37_sdt.format(k37_calt.getTime())); // 현재 시간을 가져옴
		System.out.printf("상품 및 기타 문의 : 1522-440\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("             2112820610158231\n"); // 바코드 넘버 출력
		System.out.printf("----------------------------------------\n");
		System.out.printf("◈다이소 멤버십 앱 또는 홈페이지에 접속하셔\n");
		System.out.printf(" 서 회원가입 후 다양한 혜택을 누려보세요!◈\n");
	}

}
