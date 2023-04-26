import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DateStockPrice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File kp37_f = new File("C:\\Users\\pc\\StockDailyPrice.csv");// 읽어올 파일 경로 설정
		BufferedReader kp37_br = new BufferedReader(new FileReader(kp37_f)); // // 파일 객체 생성
		
		File kp37_f1 = new File("C:\\Users\\pc\\20120120.csv");// 읽어올 파일을 기준으로 작성할 파일 경로 및 파일 이름 설정
		BufferedWriter kp37_bw1 = new BufferedWriter(new FileWriter(kp37_f1));// 파일 객체 생성
		
		
		String kp37_readtxt;// 읽을 파일 문자형 변수 설장
		
		while((kp37_readtxt=kp37_br.readLine())!=null) {// 한줄 한줄 읽어오는 while문 작성
			StringBuffer kp37_s = new StringBuffer();// StringBuffer 객체 생성
			String[] kp37_field = kp37_readtxt.split(",");//  해당 문자를 기준으로 필드를 나눠
			
			if(kp37_field[1].equals("20120120")) { //  전의 실습에서 삼성전자를 기준으로 파일을 생성했기 때문에 2012년날짜를 기준으로 파일 쓰기
				for(int i=0; i<kp37_field.length;i++) { // 반복문을 통해 
					kp37_s.append(kp37_field[i]+","); // 해당 정보를 파일에 추가
				}
				kp37_bw1.write(kp37_s.toString());kp37_bw1.newLine();// 문자열로 변환한뒤 파일 작성
				
			}
			
		}
		kp37_br.close();// 읽어온 파일 닫기
		kp37_bw1.close();//  작성 파일 닫기

	}

}
