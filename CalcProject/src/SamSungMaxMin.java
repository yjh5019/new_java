import java.io.*;
public class SamSungMaxMin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File kp37_f = new File("C:\\Users\\pc\\A005930.csv"); // 삼성전자 관련 주가로 만든 csv 파일
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // 객체 생성
		
		String kp37_readtxt; //  읽어올 파일 문자열 변수 생성 
		int kp37_Samsung_max = Integer.MIN_VALUE; //  종가 기준 최고값
		int kp37_Samsung_min = Integer.MAX_VALUE; //  종가 기준 최저값
		
		while((kp37_readtxt=kp37_br.readLine())!=null) {
			String[] kp37_field = kp37_readtxt.split(","); // , 기준으로 파일을 읽어옴
			if(kp37_field[1].substring(0,4).equals("2012")) { // 2012년
				int kp37_stock_max = Integer.parseInt(kp37_field[3]);
				
				if(kp37_stock_max > kp37_Samsung_max) { // 최고값 저장
					kp37_Samsung_max = kp37_stock_max;
				}
				if(kp37_stock_max < kp37_Samsung_min) { //  최저값 저장
					kp37_Samsung_min = kp37_stock_max;
				}
				
			}
			
			
		}
		kp37_br.close(); // 파일 닫기
		System.out.println("삼성 전자 종가 기준 최고가 : "+kp37_Samsung_max + "원"); // 출력
		System.out.println("삼성 전자 종가 기준 최저가 : "+kp37_Samsung_min + "원"); //  출력

	}

}
