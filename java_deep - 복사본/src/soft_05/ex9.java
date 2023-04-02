package soft_05;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###,###,###");
		Calendar calendar = new GregorianCalendar();
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat SDF = new SimpleDateFormat("MM월 dd일");
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		
		SimpleDateFormat sde = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		SimpleDateFormat sde1 = new SimpleDateFormat("YYYYMMdd");
		
//		String str = "안녕하세요, Hello!";
//
//        // 바이트 단위로 10~20 바이트 범위의 문자열을 추출
//        String substr = substringByBytes(str, 10, 20);
//        System.out.println(substr); // 출력: "o, Hello"
//
//        // 바이트 단위로 0~5 바이트 범위의 문자열을 추출
//        substr = substringByBytes(str, 0, 5);
//        System.out.println(substr); // 출력: "안녕"
//		
		/////////////////////////////////////////////
		//물품 항목
		String[] itemname = {"초코파이ㅇㅇㅇ","바나나우유","건포도","오렌지주스","초코에몽",
							"딸기파이","초코우유","포도","사과주스","딸기에몽",
							"바나나파이","딸기우유","딸기","포도주스","삼겹살",
							"진비빔면ㄱㅎ1","농심 신라면 39431g 이벤트1r13r1r13r3","샌드위치ㄹ311ㄹ13","상투과자","들깨미역국",
							"계란","김치볶음밥","짜파게티","핫도그","칫솔",
							"닭가슴살","프로틴","샴푸","린스","입욕제",
							"치약","면도기"};
		int[] num = 		{3,2,1,5,3,
							2,1,1,1,2,
							1,1,3,2,1,
							2,1,3,3,1,
							1,1,1,1,2,
							1,3};
		
		int[] price = 		{1000,2500,33300,2000,1500,
							1000,13311100,4300,2500,1300,
							1300,1500,70300,1710,1700,
							1600,3000,24300,3738,4300,
							13000,35300,50300,1000,1300,
							1800,900,53030,5000,200,
							6000,4500};
		
		
		boolean[] taxfree = {true,true,false,true,true,
							false,false,false,true,false,
							true,true,true,true,false,
							true,false,false,false,true,
							true,true,false,true,true,
							true,false};
		int item_num_sum = 0;		
		int taxfree_sum = 0; // 면세 합계
		int non_taxfree_sum = 0; // 비면세 합계
		
		
//		int vat = Math.round(non_taxfree_sum * 0.1f);
		/////////////////////////////////////////////
		// 5개마다 ------줄을 구분할수있게 설정
		// 과세물품 10프로 하면 소수점 올림
		//  26자    ====한글 13자
		// 천만원 으로 설정 단가
		// 바코드 밑에 날짜가 있으니 넣어주시고
		// 바이트 짜르기로 아이템 물픔
		//
		//
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.printf("emart \n");
		System.out.printf("이마트 죽전점 (031)888-1234\n");
		System.out.printf("206-86-50913 강희석\n");
		System.out.printf("용인 수지구 포은대로 552\n");
		System.out.printf("영수증 미참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선 7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/한불 구매점에서 가능(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구매]%s     POS:0011-9861\n",sdt.format(calt.getTime()));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("상 품 명           단 가  수량     금 액\n");
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<num.length; i++) {
//			String substr = itemname[i];
			String str = itemname[i];
			int endbyte = 13;// 상품명 출력 바이트수
			String substr = substringByBytes(str, 1, endbyte);
//			System.out.printf("%s\n",str.getBytes().length);
			if(str.getBytes().length<=endbyte) {
				
				substr += " ".repeat(endbyte - substr.getBytes().length);
			}
			
			
//			if(substr.length()<endbyte) {
//				substr += " ".repeat(endbyte-substr.length());
//			}
			item_num_sum+= num[i];
			if (taxfree[i]) {
		        substr = "*" + substr;
		        taxfree_sum+=price[i];
		    }else {
		    	
		    	substr = " " + substr;
		    	non_taxfree_sum+=price[i];
		    }
			System.out.printf("%s|%10s %3d %10s\n", substr,df.format(price[i]),num[i],df.format(price[i]*num[i]));
			if((i+1)%5==0) {
				System.out.printf("\n");
				System.out.printf("----------------------------------------\n");
				System.out.printf("\n");
			}
		}
		int vat = Math.round(non_taxfree_sum * 0.1f);
		System.out.printf("\n");
		System.out.printf("              총 물품 수량 %13d\n",item_num_sum);
		System.out.printf("           (*)면 세  물 품 %13.10000000s\n",df.format(taxfree_sum));
		System.out.printf("              과 세  물 품 %13.10000000s\n",df.format(non_taxfree_sum));
		System.out.printf("              부   가   세 %13.10000000s\n",df.format(vat));
		System.out.printf("              합        계 %13.10000000s\n", df.format(taxfree_sum+non_taxfree_sum+vat));
		System.out.printf("결 제 대 상 금 액%23.10000000s\n",df.format(taxfree_sum+non_taxfree_sum+vat));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("0012 KEB 하나      541707**0484/35860658\n");
		System.out.printf("카드결제(IC)           일시불/%10s\n",df.format(taxfree_sum+non_taxfree_sum+vat));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("          [신세계포인트 적립]\n");
		System.out.printf("윤지현 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트    9350**9995         164\n");
		System.out.printf("누계(가용)포인트      5637        (5637)\n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("   구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("차량번호 :                      34저****\n");
		System.out.printf("입차시간 : %29s\n",sde.format(calt.getTime()));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("\n");
		System.out.printf("캐셔:084599 윤OO                    1150\n");
		System.out.printf("%15s/00119861/00164980/31\n",sde1.format(calt.getTime()));
		
	}
	
	public static String substringByBytes(String str, int beginBytes, int endBytes) {
	    if (str == null || str.length() == 0) {
	        return "";
	    }
	 

	     if (beginBytes < 0) {
	        beginBytes = 0;
	    }

	    if (endBytes < 1) {
	        return "";
	    }

	    int len = str.length();

	    int beginIndex = -1;
	    int endIndex = 0;

	    int curBytes = 0;
	    String ch = null;
	    for (int i = 0; i < len; i++) {
	        ch = str.substring(i, i + 1);
	        curBytes += ch.getBytes().length;

	        if (beginIndex == -1 && curBytes >= beginBytes) {
	            beginIndex = i;
	        }

	        if (curBytes > endBytes) {
	            break;
	        } else {
	            endIndex = i + 1;
	        }
	        
	    }
	 

	    return str.substring(beginIndex, endIndex);
	}
}


